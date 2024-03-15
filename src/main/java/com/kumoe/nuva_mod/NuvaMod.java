package com.kumoe.nuva_mod;

import com.kumoe.nuva_mod.Config.BlockConfig;
import com.kumoe.nuva_mod.Config.MobConfig;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NuvaMod.MODID)
public class NuvaMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "nuva_mod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    static NuvaMod instance;
    final Pair<MobConfig, ForgeConfigSpec> mobConfigSpecPair = (new ForgeConfigSpec.Builder()).configure(MobConfig::new);
    final Pair<BlockConfig, ForgeConfigSpec> blockConfigSpecPair = (new ForgeConfigSpec.Builder()).configure(BlockConfig::new);

    public NuvaMod() {
        LOGGER.info("init Nuva mod");
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, getMobConfigSpecPair().getRight(), MODID + "_mob_config.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, getBlockConfigSpecPair().getRight(), MODID + "_block_config.toml");
    }

    public static NuvaMod getInstance() {
        return instance;
    }

    public Pair<MobConfig, ForgeConfigSpec> getMobConfigSpecPair() {
        return mobConfigSpecPair;
    }

    public Pair<BlockConfig, ForgeConfigSpec> getBlockConfigSpecPair() {
        return blockConfigSpecPair;
    }

    public BlockConfig getBlockConfig() {
        return this.blockConfigSpecPair.getLeft();
    }

    public MobConfig getMobConfig() {
        return this.mobConfigSpecPair.getLeft();
    }

}
