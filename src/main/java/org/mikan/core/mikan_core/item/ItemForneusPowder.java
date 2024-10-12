package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemForneusPowder extends Item {

    public ItemForneusPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("forneus_powder");
    }
}