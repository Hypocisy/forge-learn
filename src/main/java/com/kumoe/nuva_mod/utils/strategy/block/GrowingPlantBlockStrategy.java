package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantBlock;

import java.util.Map;

public class GrowingPlantBlockStrategy implements ChanceSettingBlockStrategy {
    public static Map<Class<? extends GrowingPlantBlock>, Integer> GrowingPlantBlockClsMap;
    @Override
    public Integer getChance(Class<? extends Block> block) {
        return GrowingPlantBlockClsMap.get(block);
    }
}
