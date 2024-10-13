package org.mikan.core.mikan_core.world.gen;

import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;
import org.mikan.core.mikan_core.init.MikanCoreBlocks;

public enum OreType {
    //鉱脈の登録
    ASTIUM_ORE(Lazy.of(MikanCoreBlocks.Register.ASTIUM_ORE),10,5,128),
    ENDERLIGHT_ORE(Lazy.of(MikanCoreBlocks.Register.ENDERLIGHT_ORE),4,0,16),
    FORCINIUM_ORE(Lazy.of(MikanCoreBlocks.Register.FORCINIUM_ORE),8,5,32),
    MIKANIUM_ORE(Lazy.of(MikanCoreBlocks.Register.MIKANIUM_ORE),3,0,16),
    NERUMES_ORE(Lazy.of(MikanCoreBlocks.Register.NERUMES_ORE),10,5,64),
    PARCING_NAKE_ORE(Lazy.of(MikanCoreBlocks.Register.PARCING_NAKE_ORE),4,5,32),
    ZIONIM_ORE(Lazy.of(MikanCoreBlocks.Register.ZIONIM_ORE),5,5,32)
    ;



        private final Lazy<Block> block;
        private final int maxVeinSize;
        private final int minHeight;
        private final int maxHeight;

        OreType(Lazy<Block> block,int maxVeinSize, int minHeight,int maxHeight){
            this.block = block;
            this.maxVeinSize = maxVeinSize;
            this.minHeight = minHeight;
            this.maxHeight = maxHeight;
        }

        public Lazy<Block> getBlock() {
            return block;
        }

        public int getMaxVeinSize() {
            return maxVeinSize;
        }

        public int getMinHeight() {
            return minHeight;
        }

        public int getMaxHeight() {
            return maxHeight;
        }

        public static OreType get(Block block){
            for (OreType ore : values()){
                if (block == ore.block){
                    return ore;
                }
            }
            return null;
        }
    }


