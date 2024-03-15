package com.kumoe.nuva_mod.utils.strategy.block;

import com.kumoe.nuva_mod.Config.NuvaBlockConfig;
import com.kumoe.nuva_mod.utils.strategy.ChanceSettingBlockStrategy;
import net.minecraft.world.level.block.Block;

public class SaplingBlockStrategy implements ChanceSettingBlockStrategy {
    @Override
    public Integer getChance(Class<? extends Block> block) {
        return NuvaBlockConfig.saplingBlockMap.get(block);
    }
}
