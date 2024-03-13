package com.kumoe.nuva_mod.Config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public final class ConfigHolder {
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final Config COMMON;

    static {
        Pair<Config, ForgeConfigSpec> specPair = (new ForgeConfigSpec.Builder()).configure(Config::new);
        COMMON = specPair.getLeft();
        COMMON_SPEC = specPair.getRight();
    }

    public ConfigHolder() {
    }
}
