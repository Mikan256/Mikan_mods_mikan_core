package org.mikan.core.mikan_core.world.gen;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import org.mikan.core.mikan_core.block.trees.MikanTree;
import org.mikan.core.mikan_core.world.gen.feature.MikanTreeFeature;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class TreeGeneration {
    public static void generateTrees(final BiomeLoadingEvent event){
        MikanTree mikanTree = new MikanTree();
        Random random = new Random();

        RegistryKey<Biome> key = RegistryKey.create(Registry.BIOME_REGISTRY,event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.MUSHROOM)){
            List<Supplier<ConfiguredFeature<?,?>>> base = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);

            base.add(() -> MikanTreeFeature.MIKAN.decorated(Features.Placements.HEIGHTMAP).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(1,0.25F,1))));
        }

    }
}
