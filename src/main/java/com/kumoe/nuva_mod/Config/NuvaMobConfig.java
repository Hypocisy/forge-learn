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

public final class NuvaMobConfig {
    public static final Map<Class<? extends AgeableMob>, Integer> alexmobMap = new HashMap<>();
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
    public static MobConfig config = NuvaMod.getInstance().getMobConfig();

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
            crab = config.CRAB.get();
            crabberDelightMobMap.put(CrabEntity.class, crab);
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for Crabbers delight Config.\n" + var);
        }
    }

    private static void initVineryMobsConfig() {
        try {
            wanderingTraderVillager = config.WANDERING_TRADER_VILLAGER.get();
            wanderingWineMakerVillager = config.WANDERING_WINE_MAKER_VILLAGER.get();

            vineryMobMap.put(WanderingTrader.class, wanderingTraderVillager);
            vineryMobMap.put(WanderingWinemakerEntity.class, wanderingWineMakerVillager);
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for Crabbers delight Config.\n" + var);
        }
    }

    private static void initGeneralSettings() {
        try {
            enableDebug = config.enableDebug.get();
        } catch (Exception var) {
            NuvaMod.LOGGER.warn("An exception was caused trying to load the config for GeneralSettings.\n" + var);
        }
    }

    private static void initVanillaMobsConfig() {
        try {
            axolotl = config.AXOLOTL.get();
            caimal = config.CAMEL.get();
            frog = config.FROG.get();
            goat = config.GOAT.get();
            horse = config.HORSE.get();
            sniffer = config.SNIFFER.get();
            bee = config.BEE.get();
            cat = config.CAT.get();
            chicken = config.CHICKEN.get();
            cow = config.COW.get();
            fox = config.FOX.get();
            mushroomCow = config.MUSHROOM_COW.get();
            ocelot = config.OCELOT.get();
            panda = config.PANDA.get();
            parrot = config.PARROT.get();
            pig = config.PIG.get();
            polar_bear = config.POLAR_BEAR.get();
            rabbit = config.RABBIT.get();
            sheep = config.SHEEP.get();
            turtle = config.TURTLE.get();
            wolf = config.WOLF.get();
            villager = config.VILLAGER.get();
            allay = config.ALLAY.get();

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
            alligator_snapping_turtle = config.ALLIGATOR_SNAPPING_TURTLE.get();
            anaconda = config.ANACONDA.get();
            anteater = config.ANTEATER.get();
            bald_eagle = config.BALD_EAGLE.get();
            banana_slug = config.BANANA_SLUG.get();
            bison = config.BISON.get();
            blue_jay = config.BLUE_JAY.get();
            cachalot_whale = config.CACHALOT_WHALE.get();
            caiman = config.CAIMAN.get();
            capuchin_monkey = config.CAPUCHIN_MONKEY.get();
            cockroach = config.COCKROACH.get();
            cosmaw = config.COSMAW.get();
            crocodile = config.CROCODILE.get();
            crow = config.CROW.get();
            elephant = config.ELEPHANT.get();
            emu = config.EMU.get();
            endergrade = config.ENDERGRADE.get();
            enderiophage = config.ENDERIOPHAGE.get();
            flutter = config.FLUTTER.get();
            fly = config.FLY.get();
            froststalker = config.FROSTSTALKER.get();
            gazelle = config.GAZELLE.get();
            gelada_monkey = config.GELADA_MONKEY.get();
            gorilla = config.GORILLA.get();
            grizzly_bear = config.GRIZZLY_BEAR.get();
            hummingbird = config.HUMMINGBIRD.get();
            jerboa = config.JERBOA.get();
            kangaroo = config.KANGAROO.get();
            komodo_dragon = config.KOMODO_DRAGON.get();
            laviathan = config.LAVIATHAN.get();
            leafcutter_ant = config.LEAFCUTTER_ANT.get();
            maned_wolf = config.MANED_WOLF.get();
            mantis_shrimp = config.MANTIS_SHRIMP.get();
            mimic_octopus = config.MIMIC_OCTOPUS.get();
            moose = config.MOOSE.get();
            mudskipper = config.MUDSKIPPER.get();
            mungus = config.MUNGUS.get();
            orca = config.ORCA.get();
            platypus = config.PLATYPUS.get();
            potoo = config.POTOO.get();
            raccoon = config.RACCOON.get();
            rain_frog = config.RAIN_FROG.get();
            rattlesnake = config.RATTLESNAKE.get();
            rhinoceros = config.RHINOCEROS.get();
            roadrunner = config.ROADRUNNER.get();
            seagull = config.SEAGULL.get();
            seal = config.SEAL.get();
            shoebill = config.SHOEBILL.get();
            skunk = config.SKUNK.get();
            snow_leopard = config.SNOW_LEOPARD.get();
            spectre = config.SPECTRE.get();
            sugar_glider = config.SUGAR_GLIDER.get();
            sunbird = config.SUNBIRD.get();
            tarantula_hawk = config.TARANTULA_HAWK.get();
            tasmanian_devil = config.TASMANIAN_DEVIL.get();
            terrapin = config.TERRAPIN.get();
            tiger = config.TIGER.get();
            toucan = config.TOUCAN.get();
            tusklin = config.TUSKLIN.get();
            warped_toad = config.WARPED_TOAD.get();
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
