package com.kumoe.nuva_mod.Events;

import com.kumoe.nuva_mod.Config.NuvaBlockConfig;
import com.kumoe.nuva_mod.Config.NuvaMobConfig;
import com.kumoe.nuva_mod.NuvaMod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = NuvaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void onModConfigLoad(ModConfigEvent event) {
        ModConfig config = event.getConfig();
        if (config.getFileName().equals(NuvaMod.MODID + "_mob_config.toml") && config.getSpec() == NuvaMod.getInstance().getMobConfigSpecPair().getRight()) {
            NuvaMod.LOGGER.debug("Loading nuva mob config");
            NuvaMobConfig.bake(config);
        }
        if (config.getFileName().equals(NuvaMod.MODID + "_block_config.toml") && config.getSpec() == NuvaMod.getInstance().getBlockConfigSpecPair().getRight()) {
            NuvaMod.LOGGER.debug("Loading nuva block config");
            NuvaBlockConfig.bake(config);
        }
    }
}
