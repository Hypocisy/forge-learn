package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StemBlock;

import java.util.Map;

public class StemBlockStrategy implements ChanceSettingBlockStrategy {
    public static Map<Class<? extends StemBlock>, Integer> stemBlockClsMap;
    @Override
    public Integer getChance(Class<? extends Block> block) {
        return stemBlockClsMap.get(block);
    }
}
