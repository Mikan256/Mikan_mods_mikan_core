package org.mikan.core.mikan_core.block;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockMikaniumOre extends OreBlock {
    public BlockMikaniumOre(){
        super(Properties.of(Material.STONE)
                .strength(5F,5F)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .sound(SoundType.STONE)
        );
        this.setRegistryName("mikanium_ore");
    }

}
