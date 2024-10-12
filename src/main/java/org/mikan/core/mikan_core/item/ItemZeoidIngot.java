package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemZeoidIngot extends Item {

    public ItemZeoidIngot(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("zeoid_ingot");
    }
}