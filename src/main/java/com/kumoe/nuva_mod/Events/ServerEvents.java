package com.kumoe.nuva_mod.Events;

import com.kumoe.nuva_mod.Config.NuvaBlockConfig;
import com.kumoe.nuva_mod.Config.NuvaMobConfig;
import com.kumoe.nuva_mod.NuvaMod;
import com.kumoe.nuva_mod.utils.strategy.AgeSettingStrategy;
import com.kumoe.nuva_mod.utils.strategy.mob.AlexMobStrategy;
import com.kumoe.nuva_mod.utils.strategy.mob.CrabberDelightMobStrategy;
import com.kumoe.nuva_mod.utils.strategy.mob.VanillaMobStrategy;
import com.kumoe.nuva_mod.utils.strategy.mob.vineryMobStrategy;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.HoverEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.CropBlock;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.event.level.SaplingGrowTreeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.List;

import static net.minecraft.network.chat.Style.EMPTY;

@Mod.EventBusSubscriber(modid = NuvaMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerEvents {
    private static final List<AgeSettingStrategy> mobStrategies = Arrays.asList(new VanillaMobStrategy(), new CrabberDelightMobStrategy(), new AlexMobStrategy(), new vineryMobStrategy());
    protected static CompoundTag tag = new CompoundTag();

    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        if (event.getLevel() instanceof ServerLevel) {
            if (event.getEntity() instanceof Animal animal && !animal.getPersistentData().getBoolean("ForcedAged") && animal.isBaby()) {
                // age >= 0 成年
                // age < 0 未成年
                for (AgeSettingStrategy strategy : mobStrategies) {
                    Integer age = strategy.getAge(animal.getClass());
                    if (age != null) {
                        setAge(animal, age);
                        debugMessage(animal);
                        animal.getPersistentData().putBoolean("ForcedAged", true);
                        break;
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerUseItem(PlayerInteractEvent.RightClickBlock event) {
        if (!event.getLevel().isClientSide) {
            if (NuvaMobConfig.enableBoneMeal && event.getItemStack().is(Items.BONE_MEAL)) {
                if (NuvaMobConfig.enableDebug) {
                    event.getEntity().sendSystemMessage(Component.literal("[debug] 取消了施肥").withStyle(ChatFormatting.RED));
                }
                event.setCanceled(true);
            }
        }
    }


    /*
     * 作物生长检测
     * */
    @SubscribeEvent
    public static void onCropGrow(BlockEvent.CropGrowEvent.Pre event) {
        if (event.getLevel() instanceof ServerLevel serverLevel) {
            if (event.getState().getBlock() instanceof CropBlock cropBlock) {

                Integer chance = NuvaBlockConfig.cropBlockMap.get(cropBlock.getDescriptionId());
                int nextInt = serverLevel.getRandom().nextInt(100);
                if (chance != null) {
                    if (chance > nextInt) {
                        event.setResult(Event.Result.DENY);
                    }

                }
                if (NuvaMobConfig.enableDebug) {
                    serverLevel.getServer().getPlayerList().getPlayers().stream().filter(e -> e.hasPermissions(2)).forEach(p -> p.sendSystemMessage(Component.literal( cropBlock.getDescriptionId() + " config's chance " + chance + " nextInt " + nextInt).withStyle(ChatFormatting.AQUA).withStyle(EMPTY.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Component.translatable("debug.nuva.crop_hover", cropBlock.getName().getString(),
                            event.getState().getBlock().getName().toString(),
                            event.getPos().getX(),
                            event.getPos().getY(),
                            event.getPos().getZ()))).withClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/tp @s %s %s %s".formatted(event.getPos().getX(), event.getPos().getY(), event.getPos().getZ()))))));
                }
            } else if (event.getState().getBlock() instanceof BushBlock bushBlock) {

                Integer chance = NuvaBlockConfig.cropBlockMap.get(bushBlock.getDescriptionId());
                int nextInt = serverLevel.getRandom().nextInt(100);
                if (chance != null) {
                    if (chance > nextInt) {
                        event.setResult(Event.Result.DENY);
                    }
                }
                if (NuvaMobConfig.enableDebug) {
                    serverLevel.getServer().getPlayerList().getPlayers().stream().filter(e -> e.hasPermissions(2)).forEach(p -> {
                        p.sendSystemMessage(Component.literal(bushBlock.getDescriptionId() + " config's chance " + chance + " nextInt " + nextInt).withStyle(ChatFormatting.BLUE).withStyle(EMPTY.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Component.translatable("debug.nuva.crop_hover", bushBlock.getName().getString(),
                                event.getState().getBlock().getName().toString(),
                                event.getPos().getX(),
                                event.getPos().getY(),
                                event.getPos().getZ()))).withClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/tp @s %s %s %s".formatted(event.getPos().getX(), event.getPos().getY(), event.getPos().getZ())))));
                    });
                }
            }
        }
    }

    @SubscribeEvent
    public static void onSaplingGrow(SaplingGrowTreeEvent event) {
        if (event.getLevel() instanceof ServerLevel serverLevel) {
            var sapling = serverLevel.getBlockState(event.getPos()).getBlock();
            NuvaMod.LOGGER.debug(sapling.getClass().toString());
            Integer chance = NuvaBlockConfig.saplingBlockMap.get(sapling.getDescriptionId());
            int nextInt = event.getRandomSource().nextInt(100);
            if (chance != null) {
                if (chance > nextInt) {
                    event.setResult(Event.Result.DENY);
                }
                NuvaMod.LOGGER.debug(sapling.getName().getString() + event.getPos().toString() + " config's chance " + chance + " rdm " + nextInt);
            }
        }
    }

    private static void debugMessage(AgeableMob animal) {
        if (NuvaMobConfig.enableDebug) {
            if (animal.getServer() != null) {
                for (ServerPlayer player : animal.getServer().getPlayerList().getPlayers()) {
                    if (player != null && player.hasPermissions(2)) {
                        player.sendSystemMessage(Component.translatable("debug.nuva.mob_age_info",
                                        animal.getName().getString(),
                                        animal.getAge() / -20)
                                .withStyle(ChatFormatting.RED)
                                .withStyle(EMPTY.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Component.translatable("debug.nuva.mob_age_hover",
                                                animal.getName(),
                                                animal.getUUID().toString(),
                                                animal.getBlockX(),
                                                animal.getBlockY(),
                                                animal.getBlockZ())))
                                        .withClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/tp @s %s %s %s".formatted(animal.getBlockX(), animal.getBlockY(), animal.getBlockZ()))))
                        );
                    }
                }
            }
        }
    }

    private static void setAge(AgeableMob ageable, int age) {
        tag.putInt("Age", age * -20);
        tag.putInt("ForcedAge", age * -20);

        ageable.readAdditionalSaveData(tag);
    }

}
