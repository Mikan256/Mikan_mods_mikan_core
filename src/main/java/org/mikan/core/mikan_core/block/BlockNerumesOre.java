package org.mikan.core.mikan_core.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockNerumesOre extends Block {
    public BlockNerumesOre(){
        super(Properties.of(Material.STONE)
                .strength(8F,10F)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .sound(SoundType.STONE)
        );
        this.setRegistryName("nerumes_ore");
    }
}
