package org.mikan.core.mikan_core.block;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;
import org.mikan.core.mikan_core.init.MikanCoreBlocks;

import java.util.Random;

public class BlockNerumesOre extends OreBlock {
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
