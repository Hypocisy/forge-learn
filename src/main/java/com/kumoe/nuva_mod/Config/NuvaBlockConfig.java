package com.kumoe.nuva_mod.Config;

import com.kumoe.nuva_mod.NuvaMod;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.config.ModConfig;
import net.ribs.vintagedelight.block.ModBlocks;
import satisfyu.vinery.registry.ObjectRegistry;

import java.util.HashMap;
import java.util.Map;

public final class NuvaBlockConfig {
    public static final Map<String, Integer> saplingBlockMap = new HashMap<>();
    public static final Map<String, Integer> cropBlockMap = new HashMap<>();
    public static BlockConfig config = NuvaMod.getInstance().getBlockConfig();
    public static int acaciaSaplingBlock;
    public static int birchSaplingBlock;
    public static int cherrySaplingBlock;
    public static int darkOakSaplingBlock;
    public static int jungleSaplingBlock;
    public static int oakSaplingBlock;
    public static int spruceSaplingBlock;
    public static int azaleaBlock;
    public static int vineryAppleTreeSaplingBlock;
    public static int vineryCherrySaplingBlock;
    public static int mangrovePropaguleBlock;
    public static int bambooSaplingBlock;
    // init Vanilla Crop Map
    public static int Wheat;
    public static int Torchflower;
    public static int Beetroot;
    public static int Pumpkin;
    public static int Melon;
    public static int ChorusPlant;
    public static int Carrot;
    public static int Cocoa;
    public static int PitcherCrop;
    public static int Potato;
    public static int NetherWart;
    public static int SugarCane;
    public static int Cactus;
    // vintage delight
    public static int OatBlock;
    public static int GhostPepperCrop;
    public static int Peanut;
    public static int Cucumber;
    public static int GearoBerry;
    // lets do brewery
    public static int HopsCrop;
    public static int BarleyCrop;
    public static int CornCrop;

    // vinery
    public static int redGrep;
    public static int savannaGrape;
    public static int jungleGrapeRed;
    public static int jungleGrapeWhite;
    public static int taigaGrape;
    public static int whiteGrep;

    // farmers delight
    public static int riceCrop;
    public static int cabbage;
    public static int tomato;
    public static int buddingTomatoCrop;
    public static int onion;

    public static void bake(ModConfig ignoredConfig) {
        // general settings
        // initGeneralSettings();
        // vanilla mobs config
        initVanillaSaplingMap();
        initVanillaCropMap();
        if (ModList.get().isLoaded("vinery")) {
            initVinerySaplingMap();
            initVineryCropMap();
        }
        if (ModList.get().isLoaded("vintagedelight")) {
            initVintageDelightCropMap();
        }
        if (ModList.get().isLoaded("brewery")) {
            initBreweryCropMap();
        }
        if (ModList.get().isLoaded("farmersdelight")) {
            initFarmersDelightMap();
        }

    }

    private static void initVanillaSaplingMap() {
        try {
            // tree likes
            acaciaSaplingBlock = config.AcaciaSaplingBlock.get();
            birchSaplingBlock = config.BirchSaplingBlock.get();
            cherrySaplingBlock = config.CherrySaplingBlock.get();
            darkOakSaplingBlock = config.DarkOakSaplingBlock.get();
            jungleSaplingBlock = config.JungleSaplingBlock.get();
            oakSaplingBlock = config.OakSaplingBlock.get();
            spruceSaplingBlock = config.SpruceSaplingBlock.get();
            azaleaBlock = config.AzaleaBlock.get();
            mangrovePropaguleBlock = config.MangrovePropaguleBlock.get();
            bambooSaplingBlock = config.BambooSaplingBlock.get();

            saplingBlockMap.put(Blocks.ACACIA_SAPLING.getDescriptionId(), acaciaSaplingBlock);
            saplingBlockMap.put(Blocks.BIRCH_SAPLING.getDescriptionId(), birchSaplingBlock);
            saplingBlockMap.put(Blocks.CHERRY_SAPLING.getDescriptionId(), cherrySaplingBlock);
            saplingBlockMap.put(Blocks.DARK_OAK_SAPLING.getDescriptionId(), darkOakSaplingBlock);
            saplingBlockMap.put(Blocks.JUNGLE_SAPLING.getDescriptionId(), jungleSaplingBlock);
            saplingBlockMap.put(Blocks.OAK_SAPLING.getDescriptionId(), oakSaplingBlock);
            saplingBlockMap.put(Blocks.SPRUCE_SAPLING.getDescriptionId(), spruceSaplingBlock);
            saplingBlockMap.put(Blocks.AZALEA.getDescriptionId(), azaleaBlock);
            saplingBlockMap.put(Blocks.MANGROVE_PROPAGULE.getDescriptionId(), mangrovePropaguleBlock);
            saplingBlockMap.put(Blocks.BAMBOO_BLOCK.getDescriptionId(), bambooSaplingBlock);

        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for Vanilla Config.\n" + var);
        }
    }

    private static void initVinerySaplingMap() {
        try {
            vineryAppleTreeSaplingBlock = config.VineryAppleTreeSaplingBlock.get();
            vineryCherrySaplingBlock = config.VineryCherrySaplingBlock.get();
            saplingBlockMap.put(ObjectRegistry.APPLE_TREE_SAPLING.get().getDescriptionId(), vineryAppleTreeSaplingBlock);
            saplingBlockMap.put(ObjectRegistry.CHERRY_SAPLING.get().getDescriptionId(), vineryCherrySaplingBlock);
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for vinery mod Config.\n" + var);
        }
    }

    private static void initVineryCropMap() {
        try {
            redGrep = config.RedGrep.get();
            whiteGrep = config.WhiteGrap.get();
            jungleGrapeRed = config.JungleGrapeRed.get();
            jungleGrapeWhite = config.JungleGrapeWhite.get();
            savannaGrape = config.SavannaGrape.get();
            taigaGrape = config.TaigaGrape.get();
            cropBlockMap.put(ObjectRegistry.RED_GRAPE_BUSH.get().getDescriptionId(), redGrep);
            cropBlockMap.put(ObjectRegistry.WHITE_GRAPE.get().getDescriptionId(), whiteGrep);
            cropBlockMap.put(ObjectRegistry.JUNGLE_RED_GRAPE_BUSH.get().getDescriptionId(), jungleGrapeRed);
            cropBlockMap.put(ObjectRegistry.JUNGLE_WHITE_GRAPE_BUSH.get().getDescriptionId(), jungleGrapeWhite);
            cropBlockMap.put(ObjectRegistry.SAVANNA_RED_GRAPE_BUSH.get().getDescriptionId(), savannaGrape);
            cropBlockMap.put(ObjectRegistry.TAIGA_RED_GRAPE_BUSH.get().getDescriptionId(), taigaGrape);
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for vinery mod Config.\n" + var);
        }
    }

    private static void initVanillaCropMap() {
        Wheat = config.Wheat.get();
        Torchflower = config.Torchflower.get();
        Beetroot = config.Beetroot.get();
        Pumpkin = config.Pumpkin.get();
        Melon = config.Melon.get();
        ChorusPlant = config.ChorusPlant.get();
        Carrot = config.Carrot.get();
        Cocoa = config.Cocoa.get();
        PitcherCrop = config.PitcherCrop.get();
        Potato = config.Potato.get();
        NetherWart = config.NetherWart.get();
        SugarCane = config.SugarCane.get();
        Cactus = config.Cactus.get();

        cropBlockMap.put(Blocks.WHEAT.getDescriptionId(), Wheat);
        cropBlockMap.put(Blocks.TORCHFLOWER_CROP.getDescriptionId(), Torchflower);
        cropBlockMap.put(Blocks.MELON_STEM.getDescriptionId(), Melon);
        cropBlockMap.put(Blocks.CHORUS_PLANT.getDescriptionId(), ChorusPlant);
        cropBlockMap.put(Blocks.CARROTS.getDescriptionId(), Beetroot);
        cropBlockMap.put(Blocks.COCOA.getDescriptionId(), Cocoa);
        cropBlockMap.put(Blocks.PITCHER_CROP.getDescriptionId(), PitcherCrop);
        cropBlockMap.put(Blocks.POTATOES.getDescriptionId(), Potato);
        cropBlockMap.put(Blocks.NETHER_WART.getDescriptionId(), NetherWart);
        cropBlockMap.put(Blocks.SUGAR_CANE.getDescriptionId(), SugarCane);
        cropBlockMap.put(Blocks.CACTUS.getDescriptionId(), Cactus);

    }

    private static void initVintageDelightCropMap() {
        OatBlock = config.OatBlock.get();
        GhostPepperCrop = config.GhostPepperCrop.get();
        Peanut = config.Peanut.get();
        GearoBerry = config.GearoBerry.get();
        Cucumber = config.Cucumber.get();
        cropBlockMap.put(ModBlocks.OAT_CROP.get().getDescriptionId(), OatBlock);
        cropBlockMap.put(ModBlocks.GHOST_PEPPER_CROP.get().getDescriptionId(), GhostPepperCrop);
        cropBlockMap.put(ModBlocks.PEANUT_CROP.get().getDescriptionId(), Peanut);
        cropBlockMap.put(ModBlocks.GEARO_BERRY_BUSH.get().getDescriptionId(), GearoBerry);
        cropBlockMap.put(ModBlocks.CUCUMBER_CROP.get().getDescriptionId(), Cucumber);
    }

    private static void initBreweryCropMap() {
        HopsCrop = config.HopsCrop.get();
        BarleyCrop = config.BarleyCrop.get();
        CornCrop = config.CornCrop.get();
        cropBlockMap.put(net.satisfy.brewery.registry.ObjectRegistry.HOPS_CROP.get().getDescriptionId(), HopsCrop);
        cropBlockMap.put(net.satisfy.brewery.registry.ObjectRegistry.BARLEY_CROP.get().getDescriptionId(), BarleyCrop);
        cropBlockMap.put(net.satisfy.brewery.registry.ObjectRegistry.CORN_CROP.get().getDescriptionId(), BarleyCrop);
    }

    private static void initFarmersDelightMap() {
        riceCrop = config.Rice.get();
        tomato = config.Tomato.get();
        cabbage = config.Cabbage.get();
        onion = config.Onion.get();
        buddingTomatoCrop = config.BuddingTomatoCrop.get();
        cropBlockMap.put(vectorwing.farmersdelight.common.registry.ModBlocks.RICE_CROP.get().getDescriptionId(), riceCrop);
        cropBlockMap.put(vectorwing.farmersdelight.common.registry.ModBlocks.TOMATO_CROP.get().getDescriptionId(), tomato);
        cropBlockMap.put(vectorwing.farmersdelight.common.registry.ModBlocks.BUDDING_TOMATO_CROP.get().getDescriptionId(), buddingTomatoCrop);
        cropBlockMap.put(vectorwing.farmersdelight.common.registry.ModBlocks.CABBAGE_CROP.get().getDescriptionId(), cabbage);
        cropBlockMap.put(vectorwing.farmersdelight.common.registry.ModBlocks.ONION_CROP.get().getDescriptionId(), onion);
    }

}
