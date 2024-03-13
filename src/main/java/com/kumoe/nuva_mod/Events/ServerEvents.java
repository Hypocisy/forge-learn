package com.kumoe.nuva_mod.Events;

import com.kumoe.nuva_mod.Config.NuvaConfig;
import com.kumoe.nuva_mod.utils.strategy.*;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.HoverEvent;
import net.minecraft.network.chat.Style;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import java.util.Arrays;
import java.util.List;

//@Mod.EventBusSubscriber(modid = NuvaMod.MODID, bus = Bus.FORGE)
public class ServerEvents {
    private static final List<AgeSettingStrategy> strategies = Arrays.asList(new VanillaMobStrategy(), new CrabberDelightMobStrategy(), new AlexMobStrategy(), new vineryMobStrategy());
    protected static CompoundTag tag = new CompoundTag();

    //    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        if (!event.getLevel().isClientSide) {
            if (event.getEntity() instanceof Animal animal && !animal.getPersistentData().getBoolean("ForcedAged") && animal.isBaby()) {
                // age >= 0 成年
                // age < 0 未成年
                for (AgeSettingStrategy strategy : strategies) {
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

    private static void debugMessage(AgeableMob animal) {
        if (NuvaConfig.enableDebug) {
            if (animal.getServer() != null) {
                for (ServerPlayer player : animal.getServer().getPlayerList().getPlayers()) {
                    if (player != null && player.hasPermissions(2)) {
                        player.sendSystemMessage(Component.translatable("debug.nuva.mob_age_info",
                                        animal.getName().getString(),
                                        animal.getAge() / -20)
                                .withStyle(ChatFormatting.RED)
                                .withStyle(Style.EMPTY.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Component.translatable("debug.nuva.mob_age_hover",
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
