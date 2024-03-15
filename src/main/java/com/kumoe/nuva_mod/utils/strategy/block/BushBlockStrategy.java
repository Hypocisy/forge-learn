package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;

import java.util.Map;

public class BushBlockStrategy implements ChanceSettingBlockStrategy {
    public static Map<Class<? extends BushBlock>, Integer> bushBlockClsMap;

    @Override
    public Integer getChance(Class<? extends Block> block) {
        return bushBlockClsMap.get(block);
    }
}
