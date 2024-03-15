package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StemGrownBlock;

import java.util.Map;

public class StemGrownBlockStrategy implements ChanceSettingBlockStrategy {
    public static Map<Class<? extends StemGrownBlock>, Integer> stemGrownBlockClsMap;
    @Override
    public Integer getChance(Class<? extends Block> block) {
        return stemGrownBlockClsMap.get(block);
    }
}
