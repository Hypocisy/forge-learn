package com.kumoe.nuva_mod.utils.strategy;

import com.kumoe.nuva_mod.Config.NuvaConfig;
import net.minecraft.world.entity.AgeableMob;

public class CrabberDelightMobStrategy implements AgeSettingStrategy {
    @Override
    public Integer getAge(Class<? extends AgeableMob> ageableClass) {
        return NuvaConfig.crabberDelightMobMap.get(ageableClass);
    }
}