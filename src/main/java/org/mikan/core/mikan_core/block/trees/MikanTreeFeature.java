package org.mikan.core.mikan_core.block.trees;

import com.mojang.serialization.Codec;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeature;
import org.mikan.core.mikan_core.init.MikanCoreBlocks;

public class MikanTreeFeature extends TreeFeature {

    public MikanTreeFeature(Codec<BaseTreeFeatureConfig> p_i231999_1_) {
        super(p_i231999_1_);
    }

    public static boolean isFree(IWorldGenerationBaseReader p_236410_0_, BlockPos p_236410_1_) {
        return validTreePos(p_236410_0_, p_236410_1_) || p_236410_0_.isStateAtPosition(p_236410_1_, (p_236417_0_) -> {
            return p_236417_0_.is(MikanCoreBlocks.Register.MIKAN_LOG.get());
        });
    }

    public static boolean isAirOrLeaves(IWorldGenerationBaseReader p_236412_0_, BlockPos p_236412_1_) {
        return p_236412_0_.isStateAtPosition(p_236412_1_, (p_236411_0_) -> {
            return p_236411_0_.isAir() || p_236411_0_.is(BlockTags.LEAVES);
        });
    }

}