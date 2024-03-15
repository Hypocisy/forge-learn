package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;

import java.util.Map;

public class DoublePlanetBlockStrategy implements ChanceSettingBlockStrategy {
    public static Map<Class<? extends DoublePlantBlock>, Integer> doublePlanetClsMap;

    @Override
    public Integer getChance(Class<? extends Block> block) {
        return doublePlanetClsMap.get(block);
    }
}
