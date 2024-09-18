package org.mikan.core.mikan_core;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Mikan_tab extends ItemGroup {


    public Mikan_tab() {
        super("MikanMod");
    }

    @Override
    public ItemStack makeIcon(){
        ItemStack itemStack = new ItemStack(Blocks.TNT);
        return itemStack;
    }
}
