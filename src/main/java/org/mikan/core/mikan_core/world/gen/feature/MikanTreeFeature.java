package org.mikan.core.mikan_core.world.gen.feature;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import org.mikan.core.mikan_core.init.MikanCoreBlocks;

public class MikanTreeFeature  {

    //木登録
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MIKAN = register(
            "mikan",
            Feature.TREE.configured((new BaseTreeFeatureConfig.Builder
                    (new SimpleBlockStateProvider(MikanCoreBlocks.Register.MIKAN_LOG.get().defaultBlockState()),
                            new SimpleBlockStateProvider(MikanCoreBlocks.Register.MIKAN_LEAVE.get().defaultBlockState()),
                            new BlobFoliagePlacer(FeatureSpread.fixed(2),
                                    FeatureSpread.fixed(0), 3),
                            new StraightTrunkPlacer(5, 2, 0),
                            new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
    }
    }





