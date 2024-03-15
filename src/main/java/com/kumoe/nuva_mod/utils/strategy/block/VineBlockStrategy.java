package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.VineBlock;

import java.util.Map;

public class VineBlockStrategy implements ChanceSettingBlockStrategy {
    public static Map<Class<? extends VineBlock>, Integer> vineBlockClsMap;

    @Override
    public Integer getChance(Class<? extends Block> block) {
        return vineBlockClsMap.get(block);
    }
}
