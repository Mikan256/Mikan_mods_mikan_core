package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemGoldGear extends Item {

    public ItemGoldGear(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("gold_gear");
    }
}
