package com.kumoe.nuva_mod.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import satisfyu.vinery.block.grape.GrapeBush;

@Mixin({GrapeBush.class})
public abstract class GrapeBushMixin {

    @Inject(method = "randomTick",
            at = @At(value = "INVOKE", target = "Lsatisfyu/vinery/block/grape/GrapeBush;canGrowPlace(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z"), locals = LocalCapture.CAPTURE_FAILSOFT
            , remap = false)
    private void randomTickMixin(BlockState state, ServerLevel world, BlockPos pos, RandomSource random, CallbackInfo ci) {
        ForgeHooks.onCropsGrowPre(world, pos, state, true);
    }

    @Inject(method = "randomTick",
            at = @At(value = "TAIL"
            ), locals = LocalCapture.CAPTURE_FAILSOFT
            , remap = false)
    private void randomTickTailMixin(BlockState state, ServerLevel world, BlockPos pos, RandomSource random, CallbackInfo ci) {
        ForgeHooks.onCropsGrowPost(world, pos, state);
    }
}
