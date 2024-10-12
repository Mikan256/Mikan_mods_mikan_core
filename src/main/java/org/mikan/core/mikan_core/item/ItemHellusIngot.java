package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemHellusIngot extends Item {

    public ItemHellusIngot(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("hellus_ingot");
    }
}