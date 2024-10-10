package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemIronGear extends Item {

    public ItemIronGear(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("iron_gear");
    }
}
