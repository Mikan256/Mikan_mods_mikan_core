package org.mikan.core.mikan_core.block;

import net.minecraft.block.*;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;



public class BlockMikanLeave extends LeavesBlock {
    public BlockMikanLeave(){
        super(Properties.of(Material.LEAVES)
                .strength(0.2F,0.2F)
                .sound(SoundType.GRASS)
                .noOcclusion()


        );
        this.setRegistryName("mikan_leave");
    }
}
