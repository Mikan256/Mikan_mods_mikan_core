package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemHellusPowder extends Item {

    public ItemHellusPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("hellus_powder");
    }
}