package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemWoodGear extends Item {

    public ItemWoodGear(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("wood_gear");
    }
}
