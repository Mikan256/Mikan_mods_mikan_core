package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemStoneGear extends Item {

    public ItemStoneGear(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("stone_gear");
    }
}
