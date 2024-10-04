package org.mikan.core.mikan_core.init;

import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class MikanCoreWorldgen {

    public static void biomegen(final BiomeLoadingEvent event){

    }

    public static void oregenerate(BiomeGenerationSettingsBuilder builder, RuleTest test, BlockState state, int size, int range, int count){
        builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(test,state,size)).range(range).squared().count(count));
    }
}
