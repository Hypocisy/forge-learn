package com.kumoe.nuva_mod.utils.strategy;

import net.minecraft.world.entity.AgeableMob;

public interface AgeSettingStrategy {
    Integer getAge(Class<? extends AgeableMob> ageableClass);
}
