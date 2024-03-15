package com.kumoe.nuva_mod.Config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;

public class BlockConfig {
    protected final int minValue = 0;
    protected final int defaultValue = 10;
    protected final int maxValue = 100;
    // vanilla
    protected ForgeConfigSpec.IntValue OakSaplingBlock;
    protected ForgeConfigSpec.IntValue SpruceSaplingBlock;
    protected ForgeConfigSpec.IntValue BirchSaplingBlock;
    protected ForgeConfigSpec.IntValue JungleSaplingBlock;
    protected ForgeConfigSpec.IntValue AcaciaSaplingBlock;
    protected ForgeConfigSpec.IntValue DarkOakSaplingBlock;
    protected ForgeConfigSpec.IntValue CherrySaplingBlock;
    // vinery
    protected ForgeConfigSpec.IntValue VineryCherrySaplingBlock;
    protected ForgeConfigSpec.IntValue VineryAppleTreeSaplingBlock;


    public BlockConfig(ForgeConfigSpec.Builder builder) {
        builder.push("Vanilla").comment("Chance for grow up", "Tips: 50 is means 50%");
        {
            // Trees
            OakSaplingBlock = builder.defineInRange("OakSaplingBlock", defaultValue, minValue, maxValue);
            SpruceSaplingBlock = builder.defineInRange("SpruceSaplingBlock", defaultValue, minValue, maxValue);
            BirchSaplingBlock = builder.defineInRange("BirchSaplingBlock", defaultValue, minValue, maxValue);
            JungleSaplingBlock = builder.defineInRange("JungleSaplingBlock", defaultValue, minValue, maxValue);
            AcaciaSaplingBlock = builder.defineInRange("AcaciaSaplingBlock", defaultValue, minValue, maxValue);
            DarkOakSaplingBlock = builder.defineInRange("DarkOakSaplingBlock", defaultValue, minValue, maxValue);
            CherrySaplingBlock = builder.defineInRange("CherrySaplingBlock", defaultValue, minValue, maxValue);
        }
        builder.pop();


        if (ModList.get().isLoaded("vinery")) {
            builder.push("vinery").comment("vinery Tree config");
            {
                VineryCherrySaplingBlock = builder.defineInRange("CherrySaplingBlock", defaultValue, minValue, maxValue);
                VineryAppleTreeSaplingBlock = builder.defineInRange("AppleTreeSaplingBlock", defaultValue, minValue, maxValue);
            }
            builder.pop();
        }

//        if (ModList.get().isLoaded("alexsmobs")) {
//            builder.push("alexmobs").comment("Entitles config");
//
//            builder.pop();
//        }
    }

}

