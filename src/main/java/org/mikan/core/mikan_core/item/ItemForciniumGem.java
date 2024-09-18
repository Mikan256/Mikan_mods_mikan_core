package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemForciniumGem extends Item {

    public ItemForciniumGem(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("forcinium_gem");
    }
}