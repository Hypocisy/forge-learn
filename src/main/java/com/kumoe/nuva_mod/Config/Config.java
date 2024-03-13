package com.kumoe.nuva_mod.Config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModList;

public class Config {

    protected final int minValue = 0;
    protected final int defaultValue = 6000;
    protected ForgeConfigSpec.IntValue WANDERING_TRADER_VILLAGER;
    protected ForgeConfigSpec.IntValue WANDERING_WINE_MAKER_VILLAGER;
    protected ForgeConfigSpec.IntValue CRAB;
    protected ForgeConfigSpec.IntValue ALLIGATOR_SNAPPING_TURTLE;
    protected ForgeConfigSpec.BooleanValue enableDebug;
    protected ForgeConfigSpec.IntValue ANACONDA;
    protected ForgeConfigSpec.IntValue ANTEATER;
    protected ForgeConfigSpec.IntValue BALD_EAGLE;
    protected ForgeConfigSpec.IntValue BANANA_SLUG;
    protected ForgeConfigSpec.IntValue BISON;
    protected ForgeConfigSpec.IntValue BLUE_JAY;
    protected ForgeConfigSpec.IntValue CACHALOT_WHALE;
    protected ForgeConfigSpec.IntValue CAIMAN;
    protected ForgeConfigSpec.IntValue CAPUCHIN_MONKEY;
    protected ForgeConfigSpec.IntValue COCKROACH;
    protected ForgeConfigSpec.IntValue COSMAW;
    protected ForgeConfigSpec.IntValue CROCODILE;
    protected ForgeConfigSpec.IntValue CROW;
    protected ForgeConfigSpec.IntValue ELEPHANT;
    protected ForgeConfigSpec.IntValue EMU;
    protected ForgeConfigSpec.IntValue ENDERGRADE;
    protected ForgeConfigSpec.IntValue ENDERIOPHAGE;
    protected ForgeConfigSpec.IntValue FLUTTER;
    protected ForgeConfigSpec.IntValue FLY;
    protected ForgeConfigSpec.IntValue FROSTSTALKER;
    protected ForgeConfigSpec.IntValue GAZELLE;
    protected ForgeConfigSpec.IntValue GELADA_MONKEY;
    protected ForgeConfigSpec.IntValue GORILLA;
    protected ForgeConfigSpec.IntValue GRIZZLY_BEAR;
    protected ForgeConfigSpec.IntValue HUMMINGBIRD;
    protected ForgeConfigSpec.IntValue JERBOA;
    protected ForgeConfigSpec.IntValue KANGAROO;
    protected ForgeConfigSpec.IntValue KOMODO_DRAGON;
    protected ForgeConfigSpec.IntValue LAVIATHAN;
    protected ForgeConfigSpec.IntValue LEAFCUTTER_ANT;
    protected ForgeConfigSpec.IntValue MANED_WOLF;
    protected ForgeConfigSpec.IntValue MANTIS_SHRIMP;
    protected ForgeConfigSpec.IntValue MIMIC_OCTOPUS;
    protected ForgeConfigSpec.IntValue MOOSE;
    protected ForgeConfigSpec.IntValue MUDSKIPPER;
    protected ForgeConfigSpec.IntValue MUNGUS;
    protected ForgeConfigSpec.IntValue ORCA;
    protected ForgeConfigSpec.IntValue PLATYPUS;
    protected ForgeConfigSpec.IntValue POTOO;
    protected ForgeConfigSpec.IntValue RACCOON;
    protected ForgeConfigSpec.IntValue RAIN_FROG;
    protected ForgeConfigSpec.IntValue RATTLESNAKE;
    protected ForgeConfigSpec.IntValue RHINOCEROS;
    protected ForgeConfigSpec.IntValue ROADRUNNER;
    protected ForgeConfigSpec.IntValue SEAGULL;
    protected ForgeConfigSpec.IntValue SEAL;
    protected ForgeConfigSpec.IntValue SHOEBILL;
    protected ForgeConfigSpec.IntValue SKUNK;
    protected ForgeConfigSpec.IntValue SNOW_LEOPARD;
    protected ForgeConfigSpec.IntValue SPECTRE;
    protected ForgeConfigSpec.IntValue SUGAR_GLIDER;
    protected ForgeConfigSpec.IntValue SUNBIRD;
    protected ForgeConfigSpec.IntValue TARANTULA_HAWK;
    protected ForgeConfigSpec.IntValue TASMANIAN_DEVIL;
    protected ForgeConfigSpec.IntValue TERRAPIN;
    protected ForgeConfigSpec.IntValue TIGER;
    protected ForgeConfigSpec.IntValue TOUCAN;
    protected ForgeConfigSpec.IntValue TUSKLIN;
    protected ForgeConfigSpec.IntValue WARPED_TOAD;
    protected ForgeConfigSpec.IntValue AXOLOTL;
    protected ForgeConfigSpec.IntValue CAMEL;
    protected ForgeConfigSpec.IntValue FROG;
    protected ForgeConfigSpec.IntValue GOAT;
    protected ForgeConfigSpec.IntValue HORSE;
    protected ForgeConfigSpec.IntValue SNIFFER;
    protected ForgeConfigSpec.IntValue BEE;
    protected ForgeConfigSpec.IntValue CAT;
    protected ForgeConfigSpec.IntValue CHICKEN;
    protected ForgeConfigSpec.IntValue COW;
    protected ForgeConfigSpec.IntValue FOX;
    protected ForgeConfigSpec.IntValue MUSHROOM_COW;
    protected ForgeConfigSpec.IntValue OCELOT;
    protected ForgeConfigSpec.IntValue PANDA;
    protected ForgeConfigSpec.IntValue PARROT;
    protected ForgeConfigSpec.IntValue PIG;
    protected ForgeConfigSpec.IntValue POLAR_BEAR;
    protected ForgeConfigSpec.IntValue RABBIT;
    protected ForgeConfigSpec.IntValue SHEEP;
    protected ForgeConfigSpec.IntValue TURTLE;
    protected ForgeConfigSpec.IntValue WOLF;
    protected ForgeConfigSpec.IntValue VILLAGER;
    protected ForgeConfigSpec.IntValue ALLAY;

    protected Config(ForgeConfigSpec.Builder builder) {
        builder.push("General settings");
        {
            enableDebug = builder.comment("Show debug info to player?").define("enableDebug", false);
        }
        builder.pop();

        builder.push("Vanilla").comment("Entitles config");
        {
            ALLAY = builder.comment("How much time(sec) due Allay mature").defineInRange("Allay", defaultValue, minValue, Integer.MAX_VALUE);
            AXOLOTL = builder.comment("How much time(sec) due Axolotl mature").defineInRange("Axolotl", defaultValue, minValue, Integer.MAX_VALUE);
            CAMEL = builder.comment("How much time(sec) due Camel mature").defineInRange("Camel", defaultValue, minValue, Integer.MAX_VALUE);
            FROG = builder.comment("How much time(sec) due Frog mature").defineInRange("Frog", defaultValue, minValue, Integer.MAX_VALUE);
            GOAT = builder.comment("How much time(sec) due Goat mature").defineInRange("Goat", defaultValue, minValue, Integer.MAX_VALUE);
            HORSE = builder.comment("How much time(sec) due Horse mature").defineInRange("Horse", defaultValue, minValue, Integer.MAX_VALUE);
            SNIFFER = builder.comment("How much time(sec) due Sniffer mature").defineInRange("Sniffer", defaultValue, minValue, Integer.MAX_VALUE);
            BEE = builder.comment("How much time(sec) due Bee mature").defineInRange("Bee", defaultValue, minValue, Integer.MAX_VALUE);
            CAT = builder.comment("How much time(sec) due Cat mature").defineInRange("Cat", defaultValue, minValue, Integer.MAX_VALUE);
            CHICKEN = builder.comment("How much time(sec) due Chicken mature").defineInRange("Chicken", defaultValue, minValue, Integer.MAX_VALUE);
            COW = builder.comment("How much time(sec) due Cow mature").defineInRange("Cow", defaultValue, minValue, Integer.MAX_VALUE);
            FOX = builder.comment("How much time(sec) due Fox mature").defineInRange("Fox", defaultValue, minValue, Integer.MAX_VALUE);
            MUSHROOM_COW = builder.comment("How much time(sec) due MushroomCow mature").defineInRange("MushroomCow", defaultValue, minValue, Integer.MAX_VALUE);
            OCELOT = builder.comment("How much time(sec) due Ocelot mature").defineInRange("Ocelot", defaultValue, minValue, Integer.MAX_VALUE);
            PANDA = builder.comment("How much time(sec) due Panda mature").defineInRange("Panda", defaultValue, minValue, Integer.MAX_VALUE);
            PARROT = builder.comment("How much time(sec) due Parrot mature").defineInRange("Parrot", defaultValue, minValue, Integer.MAX_VALUE);
            PIG = builder.comment("How much time(sec) due Pig mature").defineInRange("Pig", defaultValue, minValue, Integer.MAX_VALUE);
            POLAR_BEAR = builder.comment("How much time(sec) due PolarBear mature").defineInRange("PolarBear", defaultValue, minValue, Integer.MAX_VALUE);
            RABBIT = builder.comment("How much time(sec) due Rabbit mature").defineInRange("Rabbit", defaultValue, minValue, Integer.MAX_VALUE);
            SHEEP = builder.comment("How much time(sec) due Sheep mature").defineInRange("Sheep", defaultValue, minValue, Integer.MAX_VALUE);
            TURTLE = builder.comment("How much time(sec) due Turtle mature").defineInRange("Turtle", defaultValue, minValue, Integer.MAX_VALUE);
            WOLF = builder.comment("How much time(sec) due Wolf mature").defineInRange("Wolf", defaultValue, minValue, Integer.MAX_VALUE);
            VILLAGER = builder.comment("How much time(sec) due Villager mature").defineInRange("villager", defaultValue, minValue, Integer.MAX_VALUE);
        }
        builder.pop();

        if (ModList.get().isLoaded("crabbersdelight")) {
            builder.push("crabbersdelight").comment("Entitles config");
            {
                CRAB = builder.comment("How much time(sec) due crab mature").defineInRange("Crab", defaultValue, minValue, Integer.MAX_VALUE);
            }
            builder.pop();
        }

        if (ModList.get().isLoaded("vinery")) {
            builder.push("vinery").comment("Entitles config");
            {
                WANDERING_WINE_MAKER_VILLAGER = builder.comment("How much time(sec) due crab mature").defineInRange("WanderingWinemakerVillager", defaultValue, minValue, Integer.MAX_VALUE);
                WANDERING_TRADER_VILLAGER = builder.comment("How much time(sec) due crab mature").defineInRange("WanderingTraderVillager", defaultValue, minValue, Integer.MAX_VALUE);
            }
            builder.pop();
        }

        if (ModList.get().isLoaded("alexsmobs")) {
            builder.push("alexmobs").comment("Entitles config");
            ALLIGATOR_SNAPPING_TURTLE = builder.comment("How much time(sec) due EntityAlligatorSnappingTurtle mature").defineInRange("AlligatorSnappingTurtle", defaultValue, minValue, Integer.MAX_VALUE);
            ANACONDA = builder.comment("How much time(sec) due EntityAnaconda mature").defineInRange("Anaconda", defaultValue, minValue, Integer.MAX_VALUE);
            ANTEATER = builder.comment("How much time(sec) due EntityAnteater mature").defineInRange("Anteater", defaultValue, minValue, Integer.MAX_VALUE);
            BALD_EAGLE = builder.comment("How much time(sec) due EntityBaldEagle mature").defineInRange("BaldEagle", defaultValue, minValue, Integer.MAX_VALUE);
            BANANA_SLUG = builder.comment("How much time(sec) due EntityBananaSlug mature").defineInRange("BananaSlug", defaultValue, minValue, Integer.MAX_VALUE);
            BISON = builder.comment("How much time(sec) due EntityBison mature").defineInRange("Bison", defaultValue, minValue, Integer.MAX_VALUE);
            BLUE_JAY = builder.comment("How much time(sec) due EntityBlueJay mature").defineInRange("BlueJay", defaultValue, minValue, Integer.MAX_VALUE);
            CACHALOT_WHALE = builder.comment("How much time(sec) due EntityCachalotWhale mature").defineInRange("CachalotWhale", defaultValue, minValue, Integer.MAX_VALUE);
            CAIMAN = builder.comment("How much time(sec) due EntityCaiman mature").defineInRange("Caiman", defaultValue, minValue, Integer.MAX_VALUE);
            CAPUCHIN_MONKEY = builder.comment("How much time(sec) due EntityCapuchinMonkey mature").defineInRange("CapuchinMonkey", defaultValue, minValue, Integer.MAX_VALUE);
            COCKROACH = builder.comment("How much time(sec) due EntityCockroach mature").defineInRange("Cockroach", defaultValue, minValue, Integer.MAX_VALUE);
            COSMAW = builder.comment("How much time(sec) due EntityCosmaw mature").defineInRange("Cosmaw", defaultValue, minValue, Integer.MAX_VALUE);
            CROCODILE = builder.comment("How much time(sec) due EntityCrocodile mature").defineInRange("Crocodile", defaultValue, minValue, Integer.MAX_VALUE);
            CROW = builder.comment("How much time(sec) due EntityCrow mature").defineInRange("Crow", defaultValue, minValue, Integer.MAX_VALUE);
            ELEPHANT = builder.comment("How much time(sec) due EntityElephant mature").defineInRange("Elephant", defaultValue, minValue, Integer.MAX_VALUE);
            EMU = builder.comment("How much time(sec) due EntityEmu mature").defineInRange("Emu", defaultValue, minValue, Integer.MAX_VALUE);
            ENDERGRADE = builder.comment("How much time(sec) due EntityEndergrade mature").defineInRange("Endergrade", defaultValue, minValue, Integer.MAX_VALUE);
            ENDERIOPHAGE = builder.comment("How much time(sec) due EntityEnderiophage mature").defineInRange("Enderiophage", defaultValue, minValue, Integer.MAX_VALUE);
            FLUTTER = builder.comment("How much time(sec) due EntityFlutter mature").defineInRange("Flutter", defaultValue, minValue, Integer.MAX_VALUE);
            FLY = builder.comment("How much time(sec) due EntityFly mature").defineInRange("Fly", defaultValue, minValue, Integer.MAX_VALUE);
            FROSTSTALKER = builder.comment("How much time(sec) due EntityFroststalker mature").defineInRange("Froststalker", defaultValue, minValue, Integer.MAX_VALUE);
            GAZELLE = builder.comment("How much time(sec) due EntityGazelle mature").defineInRange("Gazelle", defaultValue, minValue, Integer.MAX_VALUE);
            GELADA_MONKEY = builder.comment("How much time(sec) due EntityGeladaMonkey mature").defineInRange("GeladaMonkey", defaultValue, minValue, Integer.MAX_VALUE);
            GORILLA = builder.comment("How much time(sec) due EntityGorilla mature").defineInRange("Gorilla", defaultValue, minValue, Integer.MAX_VALUE);
            GRIZZLY_BEAR = builder.comment("How much time(sec) due EntityGrizzlyBear mature").defineInRange("GrizzlyBear", defaultValue, minValue, Integer.MAX_VALUE);
            HUMMINGBIRD = builder.comment("How much time(sec) due EntityHummingbird mature").defineInRange("Hummingbird", defaultValue, minValue, Integer.MAX_VALUE);
            JERBOA = builder.comment("How much time(sec) due EntityJerboa mature").defineInRange("Jerboa", defaultValue, minValue, Integer.MAX_VALUE);
            KANGAROO = builder.comment("How much time(sec) due EntityKangaroo mature").defineInRange("Kangaroo", defaultValue, minValue, Integer.MAX_VALUE);
            KOMODO_DRAGON = builder.comment("How much time(sec) due EntityKomodoDragon mature").defineInRange("KomodoDragon", defaultValue, minValue, Integer.MAX_VALUE);
            LAVIATHAN = builder.comment("How much time(sec) due EntityLaviathan mature").defineInRange("Laviathan", defaultValue, minValue, Integer.MAX_VALUE);
            LEAFCUTTER_ANT = builder.comment("How much time(sec) due EntityLeafcutterAnt mature").defineInRange("LeafcutterAnt", defaultValue, minValue, Integer.MAX_VALUE);
            MANED_WOLF = builder.comment("How much time(sec) due EntityManedWolf mature").defineInRange("ManedWolf", defaultValue, minValue, Integer.MAX_VALUE);
            MANTIS_SHRIMP = builder.comment("How much time(sec) due EntityMantisShrimp mature").defineInRange("MantisShrimp", defaultValue, minValue, Integer.MAX_VALUE);
            MIMIC_OCTOPUS = builder.comment("How much time(sec) due EntityMimicOctopus mature").defineInRange("MimicOctopus", defaultValue, minValue, Integer.MAX_VALUE);
            MOOSE = builder.comment("How much time(sec) due EntityMoose mature").defineInRange("Moose", defaultValue, minValue, Integer.MAX_VALUE);
            MUDSKIPPER = builder.comment("How much time(sec) due EntityMudskipper mature").defineInRange("Mudskipper", defaultValue, minValue, Integer.MAX_VALUE);
            MUNGUS = builder.comment("How much time(sec) due EntityMungus mature").defineInRange("Mungus", defaultValue, minValue, Integer.MAX_VALUE);
            ORCA = builder.comment("How much time(sec) due EntityOrca mature").defineInRange("Orca", defaultValue, minValue, Integer.MAX_VALUE);
            PLATYPUS = builder.comment("How much time(sec) due EntityPlatypus mature").defineInRange("Platypus", defaultValue, minValue, Integer.MAX_VALUE);
            POTOO = builder.comment("How much time(sec) due EntityPotoo mature").defineInRange("Potoo", defaultValue, minValue, Integer.MAX_VALUE);
            RACCOON = builder.comment("How much time(sec) due EntityRaccoon mature").defineInRange("Raccoon", defaultValue, minValue, Integer.MAX_VALUE);
            RAIN_FROG = builder.comment("How much time(sec) due EntityRainFrog mature").defineInRange("RainFrog", defaultValue, minValue, Integer.MAX_VALUE);
            RATTLESNAKE = builder.comment("How much time(sec) due EntityRattlesnake mature").defineInRange("Rattlesnake", defaultValue, minValue, Integer.MAX_VALUE);
            RHINOCEROS = builder.comment("How much time(sec) due EntityRhinoceros mature").defineInRange("Rhinoceros", defaultValue, minValue, Integer.MAX_VALUE);
            ROADRUNNER = builder.comment("How much time(sec) due EntityRoadrunner mature").defineInRange("Roadrunner", defaultValue, minValue, Integer.MAX_VALUE);
            SEAGULL = builder.comment("How much time(sec) due EntitySeagull mature").defineInRange("Seagull", defaultValue, minValue, Integer.MAX_VALUE);
            SEAL = builder.comment("How much time(sec) due EntitySeal mature").defineInRange("Seal", defaultValue, minValue, Integer.MAX_VALUE);
            SHOEBILL = builder.comment("How much time(sec) due EntityShoebill mature").defineInRange("Shoebill", defaultValue, minValue, Integer.MAX_VALUE);
            SKUNK = builder.comment("How much time(sec) due EntitySkunk mature").defineInRange("Skunk", defaultValue, minValue, Integer.MAX_VALUE);
            SNOW_LEOPARD = builder.comment("How much time(sec) due EntitySnowLeopard mature").defineInRange("SnowLeopard", defaultValue, minValue, Integer.MAX_VALUE);
            SPECTRE = builder.comment("How much time(sec) due EntitySpectre mature").defineInRange("Spectre", defaultValue, minValue, Integer.MAX_VALUE);
            SUGAR_GLIDER = builder.comment("How much time(sec) due EntitySugarGlider mature").defineInRange("SugarGlider", defaultValue, minValue, Integer.MAX_VALUE);
            SUNBIRD = builder.comment("How much time(sec) due EntitySunbird mature").defineInRange("Sunbird", defaultValue, minValue, Integer.MAX_VALUE);
            TARANTULA_HAWK = builder.comment("How much time(sec) due EntityTarantulaHawk mature").defineInRange("TarantulaHawk", defaultValue, minValue, Integer.MAX_VALUE);
            TASMANIAN_DEVIL = builder.comment("How much time(sec) due EntityTasmanianDevil mature").defineInRange("TasmanianDevil", defaultValue, minValue, Integer.MAX_VALUE);
            TERRAPIN = builder.comment("How much time(sec) due EntityTerrapin mature").defineInRange("Terrapin", defaultValue, minValue, Integer.MAX_VALUE);
            TIGER = builder.comment("How much time(sec) due EntityTiger mature").defineInRange("Tiger", defaultValue, minValue, Integer.MAX_VALUE);
            TOUCAN = builder.comment("How much time(sec) due EntityToucan mature").defineInRange("Toucan", defaultValue, minValue, Integer.MAX_VALUE);
            TUSKLIN = builder.comment("How much time(sec) due EntityTusklin mature").defineInRange("Tusklin", defaultValue, minValue, Integer.MAX_VALUE);
            WARPED_TOAD = builder.comment("How much time(sec) due EntityWarpedToad mature").defineInRange("WarpedToad", defaultValue, minValue, Integer.MAX_VALUE);
            builder.pop();
        }
    }

}

