package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemNermesPowder extends Item {

    public ItemNermesPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("nermes_powder");
    }
}