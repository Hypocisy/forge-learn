package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;

import java.util.Map;

public class CropBlockStrategy implements ChanceSettingBlockStrategy {
    public static Map<Class<? extends CropBlock>, Integer> cropBlockClsMap;

    @Override
    public Integer getChance(Class<? extends Block> block) {
        return cropBlockClsMap.get(block);
    }
}
