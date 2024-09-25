package org.mikan.core.mikan_core.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockParcingNakeOre extends Block {
    public BlockParcingNakeOre(){
        super(Properties.of(Material.STONE)
                .strength(15F,10F)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .sound(SoundType.STONE)
        );
        this.setRegistryName("parcing_nake_ore");
    }
}
