package com.kumoe.nuva_mod.Events;

import com.kumoe.nuva_mod.Config.NuvaConfig;
import com.kumoe.nuva_mod.Config.ConfigHolder;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;

//@Mod.EventBusSubscriber(modid = NuvaMod.MODID, bus = Bus.MOD)
public class ModEvents {
//    @SubscribeEvent
    public static void onModConfigLoad(ModConfigEvent event) {
        ModConfig config = event.getConfig();
        if (config.getSpec() == ConfigHolder.COMMON_SPEC) {
            NuvaConfig.bake(config);
        }
    }
}
