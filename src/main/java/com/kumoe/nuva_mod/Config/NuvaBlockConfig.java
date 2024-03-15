package com.kumoe.nuva_mod.Config;

import com.kumoe.nuva_mod.NuvaMod;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.config.ModConfig;
import satisfyu.vinery.registry.ObjectRegistry;

import java.util.HashMap;
import java.util.Map;

public final class NuvaBlockConfig {
    public static final Map<String, Integer> saplingBlockMap = new HashMap<>();
    public static BlockConfig config = NuvaMod.getInstance().getBlockConfig();
    public static int acaciaSaplingBlock;
    public static int birchSaplingBlock;
    public static int cherrySaplingBlock;
    public static int darkOakSaplingBlock;
    public static int jungleSaplingBlock;
    public static int oakSaplingBlock;
    public static int spruceSaplingBlock;
    public static int vineryAppleTreeSaplingBlock;
    public static int vineryCherrySaplingBlock;

    public static void bake(ModConfig config) {
        // general settings
        // initGeneralSettings();
        // vanilla mobs config
        initVanillaSaplingMap();
        if (ModList.get().isLoaded("vinery")) {
            initVinerySaplingMap();
        }

    }

    private static void initVanillaSaplingMap() {
        try {
            acaciaSaplingBlock = config.AcaciaSaplingBlock.get();
            birchSaplingBlock = config.BirchSaplingBlock.get();
            cherrySaplingBlock = config.CherrySaplingBlock.get();
            darkOakSaplingBlock = config.DarkOakSaplingBlock.get();
            jungleSaplingBlock = config.JungleSaplingBlock.get();
            oakSaplingBlock = config.OakSaplingBlock.get();
            spruceSaplingBlock = config.SpruceSaplingBlock.get();

            saplingBlockMap.put(Blocks.ACACIA_SAPLING.getName().getString(), acaciaSaplingBlock);
            saplingBlockMap.put(Blocks.BIRCH_SAPLING.getName().getString(), birchSaplingBlock);
            saplingBlockMap.put(Blocks.CHERRY_SAPLING.getName().getString(), cherrySaplingBlock);
            saplingBlockMap.put(Blocks.DARK_OAK_SAPLING.getName().getString(), darkOakSaplingBlock);
            saplingBlockMap.put(Blocks.JUNGLE_SAPLING.getName().getString(), jungleSaplingBlock);
            saplingBlockMap.put(Blocks.OAK_SAPLING.getName().getString(), oakSaplingBlock);
            saplingBlockMap.put(Blocks.SPRUCE_SAPLING.getName().getString(), spruceSaplingBlock);
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for Vanilla Config.\n" + var);
        }
    }

    private static void initVinerySaplingMap() {
        try {
            vineryAppleTreeSaplingBlock = config.VineryAppleTreeSaplingBlock.get();
            vineryCherrySaplingBlock = config.VineryCherrySaplingBlock.get();
            saplingBlockMap.put(ObjectRegistry.APPLE_TREE_SAPLING.get().getName().getString(), vineryAppleTreeSaplingBlock);
            saplingBlockMap.put(ObjectRegistry.CHERRY_SAPLING.get().getName().getString(), vineryCherrySaplingBlock);

        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for vinery mod Config.\n" + var);
        }
    }
}
