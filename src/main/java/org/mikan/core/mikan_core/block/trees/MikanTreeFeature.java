package org.mikan.core.mikan_core.block.trees;

import com.mojang.serialization.Codec;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeature;
import org.mikan.core.mikan_core.init.MikanCoreBlocks;

import java.util.Random;

public class MikanTreeFeature extends TreeFeature {

    public MikanTreeFeature(Codec<BaseTreeFeatureConfig> codec){
        super(codec);

    }

    protected boolean BaseTreeFeatureConfig(IWorld world, Random random, BlockPos pos, BaseTreeFeatureConfig config){
        for(int y = 0;y<5; y++){
            world.setBlock(pos.above(y), MikanCoreBlocks.Register.MIKAN_LOG.get().defaultBlockState(), 3);
        }
        for (int y = 3; y <= 5; y++) {
            for (int x = -2; x <= 2; x++) {
                for (int z = -2; z <= 2; z++) {
                    if (Math.abs(x) + Math.abs(z) <= 2) {
                        world.setBlock(pos.offset(x, y, z), MikanCoreBlocks.Register.MIKAN_LOG.get().defaultBlockState(), 3);
                    }
                }
            }
        }
        return true;
    }
}