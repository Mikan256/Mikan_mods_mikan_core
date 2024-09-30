package org.mikan.core.mikan_core.block;

import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import org.mikan.core.mikan_core.block.trees.MikanTree;

public class BlockMikanSapling extends SaplingBlock {
    public BlockMikanSapling(){
        super(new MikanTree(), Properties.of(Material.PLANT)
                .sound(SoundType.GRASS)
                .strength(0F,0F)
                .noCollission()
                .randomTicks()

        );
        this.setRegistryName("mikan_sapling");
    }
}
