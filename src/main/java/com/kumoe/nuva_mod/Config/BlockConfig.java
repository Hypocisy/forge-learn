package com.kumoe.nuva_mod.Config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;
import satisfyu.vinery.block.grape.GrapeBush;
import satisfyu.vinery.block.grape.SavannaGrapeBush;
import satisfyu.vinery.block.grape.TaigaGrapeBush;
import satisfyu.vinery.world.JungleGrapeFeature;
import vectorwing.farmersdelight.FarmersDelight;

public class BlockConfig {
    protected final int minValue = 0;
    protected final int defaultValue = 50;
    protected final int maxValue = 100;
    // vanilla tree
    protected ForgeConfigSpec.IntValue OakSaplingBlock;
    protected ForgeConfigSpec.IntValue SpruceSaplingBlock;
    protected ForgeConfigSpec.IntValue BirchSaplingBlock;
    protected ForgeConfigSpec.IntValue JungleSaplingBlock;
    protected ForgeConfigSpec.IntValue AcaciaSaplingBlock;
    protected ForgeConfigSpec.IntValue DarkOakSaplingBlock;
    protected ForgeConfigSpec.IntValue CherrySaplingBlock;
    protected ForgeConfigSpec.IntValue AzaleaBlock;
    protected ForgeConfigSpec.IntValue MangrovePropaguleBlock;
    protected ForgeConfigSpec.IntValue BambooSaplingBlock;
    // vanilla crops
    protected ForgeConfigSpec.IntValue Wheat;
    protected ForgeConfigSpec.IntValue Torchflower;
    protected ForgeConfigSpec.IntValue Beetroot;
    protected ForgeConfigSpec.IntValue Pumpkin;
    protected ForgeConfigSpec.IntValue Melon;
    protected ForgeConfigSpec.IntValue ChorusPlant;
    protected ForgeConfigSpec.IntValue Carrot;
    protected ForgeConfigSpec.IntValue Cocoa;
    protected ForgeConfigSpec.IntValue PitcherCrop;
    protected ForgeConfigSpec.IntValue PitcherPlant;
    protected ForgeConfigSpec.IntValue Potato;
    protected ForgeConfigSpec.IntValue NetherWart;
    protected ForgeConfigSpec.IntValue SugarCane;
    protected ForgeConfigSpec.IntValue Cactus;
    // vintage delight
    protected ForgeConfigSpec.IntValue OatBlock;
    protected ForgeConfigSpec.IntValue GhostPepperCrop;
    protected ForgeConfigSpec.IntValue Peanut;
    protected ForgeConfigSpec.IntValue Cucumber;
    protected ForgeConfigSpec.IntValue GearoBerry;
    // lets do brewery
    protected ForgeConfigSpec.IntValue HopsCrop;
    protected ForgeConfigSpec.IntValue BarleyCrop;
    protected ForgeConfigSpec.IntValue CornCrop;
    // vinery grape
    protected ForgeConfigSpec.IntValue RedGrep;
    protected ForgeConfigSpec.IntValue WhiteGrap;
    protected ForgeConfigSpec.IntValue SavannaGrape;
    protected ForgeConfigSpec.IntValue TaigaGrape;
    protected ForgeConfigSpec.IntValue JungleGrapeRed;
    protected ForgeConfigSpec.IntValue JungleGrapeWhite;

    // vinery
    protected ForgeConfigSpec.IntValue VineryCherrySaplingBlock;
    protected ForgeConfigSpec.IntValue VineryAppleTreeSaplingBlock;
    // farmers delight
    protected ForgeConfigSpec.IntValue Rice;
    protected ForgeConfigSpec.IntValue Cabbage;
    protected ForgeConfigSpec.IntValue Tomato;
    protected ForgeConfigSpec.IntValue Onion;
    protected ForgeConfigSpec.IntValue BuddingTomatoCrop;



    public BlockConfig(ForgeConfigSpec.Builder builder) {
        builder.push("Vanilla").comment("Chance for grow up", "Tips: 20 is means 20% chance not grow up");
        {
            // Trees
            OakSaplingBlock = builder.defineInRange("OakSaplingBlock", defaultValue, minValue, maxValue);
            SpruceSaplingBlock = builder.defineInRange("SpruceSaplingBlock", defaultValue, minValue, maxValue);
            BirchSaplingBlock = builder.defineInRange("BirchSaplingBlock", defaultValue, minValue, maxValue);
            JungleSaplingBlock = builder.defineInRange("JungleSaplingBlock", defaultValue, minValue, maxValue);
            AcaciaSaplingBlock = builder.defineInRange("AcaciaSaplingBlock", defaultValue, minValue, maxValue);
            DarkOakSaplingBlock = builder.defineInRange("DarkOakSaplingBlock", defaultValue, minValue, maxValue);
            CherrySaplingBlock = builder.defineInRange("CherrySaplingBlock", defaultValue, minValue, maxValue);
            AzaleaBlock = builder.defineInRange("AzaleaBlock", defaultValue, minValue, maxValue);
            MangrovePropaguleBlock = builder.defineInRange("MangrovePropaguleBlock", defaultValue, minValue, maxValue);
            BambooSaplingBlock = builder.defineInRange("BambooSaplingBlock", defaultValue, minValue, maxValue);
            builder.comment("Crops");
            // crops
            Wheat = builder.defineInRange("Wheat", defaultValue, minValue, maxValue);
            Torchflower = builder.defineInRange("Torchflower", defaultValue, minValue, maxValue);
            Beetroot = builder.defineInRange("Beetroot", defaultValue, minValue, maxValue);
            Pumpkin = builder.defineInRange("Pumpkin", defaultValue, minValue, maxValue);
            Melon = builder.defineInRange("Melon", defaultValue, minValue, maxValue);
            ChorusPlant = builder.defineInRange("ChorusPlant", defaultValue, minValue, maxValue);
            Carrot = builder.defineInRange("Carrot", defaultValue, minValue, maxValue);
            Cocoa = builder.defineInRange("Cocoa", defaultValue, minValue, maxValue);
            PitcherCrop = builder.defineInRange("PitcherCrop", defaultValue, minValue, maxValue);
            PitcherPlant = builder.defineInRange("PitcherPlant", defaultValue, minValue, maxValue);
            Potato = builder.defineInRange("Potato", defaultValue, minValue, maxValue);
            NetherWart = builder.defineInRange("NetherWart", defaultValue, minValue, maxValue);
            SugarCane = builder.defineInRange("SugarCane", defaultValue, minValue, maxValue);
            Cactus = builder.defineInRange("Cactus", defaultValue, minValue, maxValue);
//            Seagrass = builder.defineInRange("Seagrass", defaultValue, minValue, maxValue);
//            SeaPickle = builder.defineInRange("SeaPickle", defaultValue, minValue, maxValue);
//            Kelp = builder.defineInRange("Kelp", defaultValue, minValue, maxValue);

        }
        builder.pop();


        if (ModList.get().isLoaded("vinery")) {
            builder.push("vinery").comment("vinery Tree config");
            {
                VineryCherrySaplingBlock = builder.defineInRange("CherrySaplingBlock", defaultValue, minValue, maxValue);
                VineryAppleTreeSaplingBlock = builder.defineInRange("AppleTreeSaplingBlock", defaultValue, minValue, maxValue);
                RedGrep = builder.defineInRange("RedGrep", defaultValue, minValue, maxValue);
                WhiteGrap = builder.defineInRange("WhiteGrap", defaultValue, minValue, maxValue);
                SavannaGrape = builder.defineInRange("SavannaGrape", defaultValue, minValue, maxValue);
                TaigaGrape = builder.defineInRange("TaigaGrape", defaultValue, minValue, maxValue);
                JungleGrapeRed = builder.defineInRange("JungleGrapeRed", defaultValue, minValue, maxValue);
                JungleGrapeWhite = builder.defineInRange("JungleGrapeWhite", defaultValue, minValue, maxValue);
            }
            builder.pop();
        }
        if (ModList.get().isLoaded("farmersdelight")) {
            builder.push("Farmers Delight").comment("farmers delight config");
            {
                Rice = builder.defineInRange("Rice", defaultValue, minValue, maxValue);
                Cabbage = builder.defineInRange("Cabbage", defaultValue, minValue, maxValue);
                Tomato = builder.defineInRange("Tomato", defaultValue, minValue, maxValue);
                BuddingTomatoCrop = builder.defineInRange("BuddingTomatoCrop", defaultValue, minValue, maxValue);
                Onion = builder.defineInRange("Onion", defaultValue, minValue, maxValue);
            }
            builder.pop();
        }

        if (ModList.get().isLoaded("vintagedelight")) {
            builder.push("Vintage Delight").comment("Vintage Delight config");
            {
                OatBlock = builder.defineInRange("Oat", defaultValue, minValue, maxValue);
                GhostPepperCrop = builder.defineInRange("GhostPepper", defaultValue, minValue, maxValue);
                Peanut = builder.defineInRange("Peanut", defaultValue, minValue, maxValue);
                Cucumber = builder.defineInRange("Cucumber", defaultValue, minValue, maxValue);
                GearoBerry = builder.defineInRange("GearoBerry", defaultValue, minValue, maxValue);
            }
            builder.pop();
        }
        if (ModList.get().isLoaded("brewery")) {
            builder.push("brewery").comment("Vintage Delight config");
            {
                HopsCrop = builder.defineInRange("HopsCrop", defaultValue, minValue, maxValue);
                BarleyCrop = builder.defineInRange("BarleyCrop", defaultValue, minValue, maxValue);
                CornCrop = builder.defineInRange("CornCrop", defaultValue, minValue, maxValue);
            }
            builder.pop();
        }
    }

}

