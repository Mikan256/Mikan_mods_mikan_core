package org.mikan.core.mikan_core.block;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;
import org.mikan.core.mikan_core.init.MikanCoreBlocks;

import java.util.Random;

public class BlockZionimOre extends OreBlock {
    public BlockZionimOre(){
        super(Properties.of(Material.STONE)
                .strength(15F,10F)
                .requiresCorrectToolForDrops()
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
                .sound(SoundType.STONE)
        );
        this.setRegistryName("zionim_ore");
    }
    //経験値設定
    protected int xpOnDrop(Random p_220281_1_) {
        if (this == MikanCoreBlocks.Register.ZIONIM_ORE.get()){
            return MathHelper.nextInt(p_220281_1_, 2, 25);
        }
        return 0;
    }
}
