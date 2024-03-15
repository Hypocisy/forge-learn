package com.kumoe.nuva_mod.utils.strategy;

import net.minecraft.world.level.block.Block;

public interface ChanceSettingBlockStrategy {
    Integer getChance(Class<? extends Block> block);
}
