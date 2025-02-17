package org.mikan.core.mikan_core.block;

import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockMikanLog extends RotatedPillarBlock {
    public BlockMikanLog(){
        super(Properties.of(Material.WOOD)
                .strength(2F,2000F)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.AXE)
                .harvestLevel(2)
                .sound(SoundType.WOOD)

        );
        this.setRegistryName("mikan_log");
    }
}
