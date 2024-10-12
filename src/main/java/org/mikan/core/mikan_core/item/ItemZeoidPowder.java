package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemZeoidPowder extends Item {

    public ItemZeoidPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("zeoid_powder");
    }
}