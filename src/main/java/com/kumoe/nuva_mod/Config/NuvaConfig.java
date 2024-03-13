package com.kumoe.nuva_mod.Config;

import alabaster.crabbersdelight.common.entity.CrabEntity;
import com.github.alexthe666.alexsmobs.entity.*;
import com.kumoe.nuva_mod.NuvaMod;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.config.ModConfig;
import satisfyu.vinery.entity.wanderingwinemaker.WanderingWinemakerEntity;

import java.util.HashMap;
import java.util.Map;

public final class NuvaConfig {
    public static final Map<Class<? extends Animal>, Integer> alexmobMap = new HashMap<>();
    public static final Map<Class<? extends AgeableMob>, Integer> vanillaMobMap = new HashMap<>();
    public static final Map<Class<? extends AgeableMob>, Integer> crabberDelightMobMap = new HashMap<>();
    public static final Map<Class<? extends AgeableMob>, Integer> vineryMobMap = new HashMap<>();
    public static boolean enableDebug;
    public static int anaconda;
    public static int anteater;
    public static int alligator_snapping_turtle;
    public static int bald_eagle;
    public static int banana_slug;
    public static int bison;
    public static int blue_jay;
    public static int cachalot_whale;
    public static int caiman;
    public static int capuchin_monkey;
    public static int cockroach;
    public static int cosmaw;
    public static int crocodile;
    public static int crow;
    public static int elephant;
    public static int emu;
    public static int endergrade;
    public static int enderiophage;
    public static int flutter;
    public static int fly;
    public static int froststalker;
    public static int gazelle;
    public static int gelada_monkey;
    public static int gorilla;
    public static int grizzly_bear;
    public static int hummingbird;
    public static int jerboa;
    public static int kangaroo;
    public static int komodo_dragon;
    public static int laviathan;
    public static int leafcutter_ant;
    public static int maned_wolf;
    public static int mantis_shrimp;
    public static int mimic_octopus;
    public static int moose;
    public static int mudskipper;
    public static int mungus;
    public static int orca;
    public static int platypus;
    public static int potoo;
    public static int raccoon;
    public static int rain_frog;
    public static int rattlesnake;
    public static int rhinoceros;
    public static int roadrunner;
    public static int seagull;
    public static int seal;
    public static int shoebill;
    public static int skunk;
    public static int snow_leopard;
    public static int spectre;
    public static int sugar_glider;
    public static int sunbird;
    public static int tarantula_hawk;
    public static int tasmanian_devil;
    public static int terrapin;
    public static int tiger;
    public static int toucan;
    public static int tusklin;
    public static int warped_toad;

    // Vanilla mobs
    public static int allay;
    public static int axolotl;
    public static int caimal;
    public static int frog;
    public static int goat;
    public static int horse;
    public static int sniffer;
    public static int bee;
    public static int cat;
    public static int chicken;
    public static int cow;
    public static int fox;
    public static int mushroomCow;
    public static int ocelot;
    public static int panda;
    public static int parrot;
    public static int pig;
    public static int polar_bear;
    public static int rabbit;
    public static int sheep;
    public static int turtle;
    public static int wolf;
    public static int villager;
    public static int crab;
    public static int wanderingWineMakerVillager;
    public static int wanderingTraderVillager;
    public static Config COMMON = ConfigHolder.COMMON;

    public static void bake(ModConfig config) {
        // general settings
        initGeneralSettings();
        // vanilla mobs config
        initVanillaMobsConfig();
        // alex mobs config
        if (ModList.get().isLoaded("alexsmobs")) {
            initAlexMobsConfig();
        }
        // crabbers delight mob
        if (ModList.get().isLoaded("crabbersdelight")) {
            initCrabberDelightMobsConfig();
        }
        // vinery mob
        if (ModList.get().isLoaded("vinery")) {
            initVineryMobsConfig();
        }
    }

    private static void initCrabberDelightMobsConfig() {
        try {
            crab = COMMON.CRAB.get();
            crabberDelightMobMap.put(CrabEntity.class, crab);
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for Crabbers delight Config.\n" + var);
        }
    }

    private static void initVineryMobsConfig() {
        try {
            wanderingTraderVillager = COMMON.WANDERING_TRADER_VILLAGER.get();
            wanderingWineMakerVillager = COMMON.WANDERING_WINE_MAKER_VILLAGER.get();

            vineryMobMap.put(WanderingTrader.class, wanderingTraderVillager);
            vineryMobMap.put(WanderingWinemakerEntity.class, wanderingWineMakerVillager);
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for Crabbers delight Config.\n" + var);
        }
    }

    private static void initGeneralSettings() {
        try {
            enableDebug = COMMON.enableDebug.get();
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for GeneralSettings.\n" + var);
        }
    }

    private static void initVanillaMobsConfig() {
        try {
            axolotl = COMMON.AXOLOTL.get();
            caimal = COMMON.CAMEL.get();
            frog = COMMON.FROG.get();
            goat = COMMON.GOAT.get();
            horse = COMMON.HORSE.get();
            sniffer = COMMON.SNIFFER.get();
            bee = COMMON.BEE.get();
            cat = COMMON.CAT.get();
            chicken = COMMON.CHICKEN.get();
            cow = COMMON.COW.get();
            fox = COMMON.FOX.get();
            mushroomCow = COMMON.MUSHROOM_COW.get();
            ocelot = COMMON.OCELOT.get();
            panda = COMMON.PANDA.get();
            parrot = COMMON.PARROT.get();
            pig = COMMON.PIG.get();
            polar_bear = COMMON.POLAR_BEAR.get();
            rabbit = COMMON.RABBIT.get();
            sheep = COMMON.SHEEP.get();
            turtle = COMMON.TURTLE.get();
            wolf = COMMON.WOLF.get();
            villager = COMMON.VILLAGER.get();
            allay = COMMON.ALLAY.get();

            vanillaMobMap.put(Horse.class, horse);
            vanillaMobMap.put(Axolotl.class, axolotl);
            vanillaMobMap.put(Cat.class, cat);
            vanillaMobMap.put(Chicken.class, chicken);
            vanillaMobMap.put(Cow.class, cow);
            vanillaMobMap.put(Fox.class, fox);
            vanillaMobMap.put(MushroomCow.class, mushroomCow);
            vanillaMobMap.put(Ocelot.class, ocelot);
            vanillaMobMap.put(Panda.class, panda);
            vanillaMobMap.put(Parrot.class, parrot);
            vanillaMobMap.put(Pig.class, pig);
            vanillaMobMap.put(PolarBear.class, polar_bear);
            vanillaMobMap.put(Rabbit.class, rabbit);
            vanillaMobMap.put(Sheep.class, sheep);
            vanillaMobMap.put(Turtle.class, turtle);
            vanillaMobMap.put(Wolf.class, wolf);
            vanillaMobMap.put(Goat.class, goat);
            vanillaMobMap.put(Frog.class, frog);
            vanillaMobMap.put(Sniffer.class, sniffer);
            vanillaMobMap.put(Bee.class, bee);
            vanillaMobMap.put(Villager.class, villager);
        } catch (Exception var1) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for Vanilla's mobs.\n" + var1);
        }
    }

    private static void initAlexMobsConfig() {
        try {
            alligator_snapping_turtle = COMMON.ALLIGATOR_SNAPPING_TURTLE.get();
            anaconda = COMMON.ANACONDA.get();
            anteater = COMMON.ANTEATER.get();
            bald_eagle = COMMON.BALD_EAGLE.get();
            banana_slug = COMMON.BANANA_SLUG.get();
            bison = COMMON.BISON.get();
            blue_jay = COMMON.BLUE_JAY.get();
            cachalot_whale = COMMON.CACHALOT_WHALE.get();
            caiman = COMMON.CAIMAN.get();
            capuchin_monkey = COMMON.CAPUCHIN_MONKEY.get();
            cockroach = COMMON.COCKROACH.get();
            cosmaw = COMMON.COSMAW.get();
            crocodile = COMMON.CROCODILE.get();
            crow = COMMON.CROW.get();
            elephant = COMMON.ELEPHANT.get();
            emu = COMMON.EMU.get();
            endergrade = COMMON.ENDERGRADE.get();
            enderiophage = COMMON.ENDERIOPHAGE.get();
            flutter = COMMON.FLUTTER.get();
            fly = COMMON.FLY.get();
            froststalker = COMMON.FROSTSTALKER.get();
            gazelle = COMMON.GAZELLE.get();
            gelada_monkey = COMMON.GELADA_MONKEY.get();
            gorilla = COMMON.GORILLA.get();
            grizzly_bear = COMMON.GRIZZLY_BEAR.get();
            hummingbird = COMMON.HUMMINGBIRD.get();
            jerboa = COMMON.JERBOA.get();
            kangaroo = COMMON.KANGAROO.get();
            komodo_dragon = COMMON.KOMODO_DRAGON.get();
            laviathan = COMMON.LAVIATHAN.get();
            leafcutter_ant = COMMON.LEAFCUTTER_ANT.get();
            maned_wolf = COMMON.MANED_WOLF.get();
            mantis_shrimp = COMMON.MANTIS_SHRIMP.get();
            mimic_octopus = COMMON.MIMIC_OCTOPUS.get();
            moose = COMMON.MOOSE.get();
            mudskipper = COMMON.MUDSKIPPER.get();
            mungus = COMMON.MUNGUS.get();
            orca = COMMON.ORCA.get();
            platypus = COMMON.PLATYPUS.get();
            potoo = COMMON.POTOO.get();
            raccoon = COMMON.RACCOON.get();
            rain_frog = COMMON.RAIN_FROG.get();
            rattlesnake = COMMON.RATTLESNAKE.get();
            rhinoceros = COMMON.RHINOCEROS.get();
            roadrunner = COMMON.ROADRUNNER.get();
            seagull = COMMON.SEAGULL.get();
            seal = COMMON.SEAL.get();
            shoebill = COMMON.SHOEBILL.get();
            skunk = COMMON.SKUNK.get();
            snow_leopard = COMMON.SNOW_LEOPARD.get();
            spectre = COMMON.SPECTRE.get();
            sugar_glider = COMMON.SUGAR_GLIDER.get();
            sunbird = COMMON.SUNBIRD.get();
            tarantula_hawk = COMMON.TARANTULA_HAWK.get();
            tasmanian_devil = COMMON.TASMANIAN_DEVIL.get();
            terrapin = COMMON.TERRAPIN.get();
            tiger = COMMON.TIGER.get();
            toucan = COMMON.TOUCAN.get();
            tusklin = COMMON.TUSKLIN.get();
            warped_toad = COMMON.WARPED_TOAD.get();
            alexmobMap.put(EntityAlligatorSnappingTurtle.class, alligator_snapping_turtle);
            alexmobMap.put(EntityAnaconda.class, anaconda);
            alexmobMap.put(EntityAnteater.class, anteater);
            alexmobMap.put(EntityBaldEagle.class, bald_eagle);
            alexmobMap.put(EntityBananaSlug.class, banana_slug);
            alexmobMap.put(EntityBison.class, bison);
            alexmobMap.put(EntityBlueJay.class, blue_jay);
            alexmobMap.put(EntityCachalotWhale.class, cachalot_whale);
            alexmobMap.put(EntityCaiman.class, caiman);
            alexmobMap.put(EntityCapuchinMonkey.class, capuchin_monkey);
            alexmobMap.put(EntityCockroach.class, cockroach);
            alexmobMap.put(EntityCosmaw.class, cosmaw);
            alexmobMap.put(EntityCrocodile.class, crocodile);
            alexmobMap.put(EntityCrow.class, crow);
            alexmobMap.put(EntityElephant.class, elephant);
            alexmobMap.put(EntityEmu.class, emu);
            alexmobMap.put(EntityEndergrade.class, endergrade);
            alexmobMap.put(EntityEnderiophage.class, enderiophage);
            alexmobMap.put(EntityFlutter.class, flutter);
            alexmobMap.put(EntityFly.class, fly);
            alexmobMap.put(EntityFroststalker.class, froststalker);
            alexmobMap.put(EntityGazelle.class, gazelle);
            alexmobMap.put(EntityGeladaMonkey.class, gelada_monkey);
            alexmobMap.put(EntityGorilla.class, gorilla);
            alexmobMap.put(EntityGrizzlyBear.class, grizzly_bear);
            alexmobMap.put(EntityHummingbird.class, hummingbird);
            alexmobMap.put(EntityJerboa.class, jerboa);
            alexmobMap.put(EntityKangaroo.class, kangaroo);
            alexmobMap.put(EntityKomodoDragon.class, komodo_dragon);
            alexmobMap.put(EntityLaviathan.class, laviathan);
            alexmobMap.put(EntityLeafcutterAnt.class, leafcutter_ant);
            alexmobMap.put(EntityManedWolf.class, maned_wolf);
            alexmobMap.put(EntityMantisShrimp.class, mantis_shrimp);
            alexmobMap.put(EntityMimicOctopus.class, mimic_octopus);
            alexmobMap.put(EntityMoose.class, moose);
            alexmobMap.put(EntityMudskipper.class, mudskipper);
            alexmobMap.put(EntityMungus.class, mungus);
            alexmobMap.put(EntityOrca.class, orca);
            alexmobMap.put(EntityPlatypus.class, platypus);
            alexmobMap.put(EntityPotoo.class, potoo);
            alexmobMap.put(EntityRaccoon.class, raccoon);
            alexmobMap.put(EntityRainFrog.class, rain_frog);
            alexmobMap.put(EntityRattlesnake.class, rattlesnake);
            alexmobMap.put(EntityRhinoceros.class, rhinoceros);
            alexmobMap.put(EntityRoadrunner.class, roadrunner);
            alexmobMap.put(EntitySeagull.class, seagull);
            alexmobMap.put(EntitySeal.class, seal);
            alexmobMap.put(EntityShoebill.class, shoebill);
            alexmobMap.put(EntitySkunk.class, skunk);
            alexmobMap.put(EntitySnowLeopard.class, snow_leopard);
            alexmobMap.put(EntitySpectre.class, spectre);
            alexmobMap.put(EntitySugarGlider.class, sugar_glider);
            alexmobMap.put(EntitySunbird.class, sunbird);
            alexmobMap.put(EntityTarantulaHawk.class, tarantula_hawk);
            alexmobMap.put(EntityTasmanianDevil.class, tasmanian_devil);
            alexmobMap.put(EntityTerrapin.class, terrapin);
            alexmobMap.put(EntityTiger.class, tiger);
            alexmobMap.put(EntityToucan.class, toucan);
            alexmobMap.put(EntityTusklin.class, tusklin);
            alexmobMap.put(EntityWarpedToad.class, warped_toad);

        } catch (Exception var2) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for Alex's Mobs.\n" + var2);
        }
    }
}
