package com.kumoe.nuva_mod;

import com.kumoe.nuva_mod.Config.ConfigHolder;
import com.kumoe.nuva_mod.Events.ModEvents;
import com.kumoe.nuva_mod.Events.ServerEvents;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NuvaMod.MODID)
public class NuvaMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "nuva_mod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public NuvaMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModEvents::onModConfigLoad);
        LOGGER.info("init Nuva mod");
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(ServerEvents::onEntityJoinLevel);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHolder.COMMON_SPEC);
    }
}
