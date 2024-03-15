package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;

import java.util.Map;

public class LeavesBlockStrategy implements ChanceSettingBlockStrategy {
    public static Map<Class<? extends LeavesBlock>, Integer> leavesBlockClsMap;
    @Override
    public Integer getChance(Class<? extends Block> block) {
        return leavesBlockClsMap.get(block);
    }
}
