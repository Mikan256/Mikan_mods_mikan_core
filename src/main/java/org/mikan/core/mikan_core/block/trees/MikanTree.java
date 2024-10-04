package org.mikan.core.mikan_core.block.trees;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.mikan.core.mikan_core.world.gen.feature.MikanTreeFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class MikanTree extends Tree {


    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random randomIn, boolean p_225546_2_) {
        return MikanTreeFeature.MIKAN;
    }
}
