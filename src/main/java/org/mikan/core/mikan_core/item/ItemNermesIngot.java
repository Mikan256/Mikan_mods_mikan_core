package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemNermesIngot extends Item {

    public ItemNermesIngot(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("nermes_ingot");
    }
}