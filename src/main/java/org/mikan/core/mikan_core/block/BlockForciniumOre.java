package org.mikan.core.mikan_core.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockForciniumOre extends Block {
    public BlockForciniumOre(){
        super(Properties.of(Material.STONE)
                .strength(10F,10F)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .sound(SoundType.STONE)
        );
        this.setRegistryName("forcinium_ore");
    }
}
