package com.kumoe.nuva_mod.utils.strategy.mob;

import com.kumoe.nuva_mod.Config.NuvaMobConfig;
import com.kumoe.nuva_mod.utils.strategy.AgeSettingStrategy;
import net.minecraft.world.entity.AgeableMob;

public class AlexMobStrategy implements AgeSettingStrategy {
    @Override
    public Integer getAge(Class<? extends AgeableMob> ageableClass) {
        return NuvaMobConfig.alexmobMap.get(ageableClass);
    }
}