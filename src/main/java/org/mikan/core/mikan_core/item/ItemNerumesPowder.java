package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemNerumesPowder extends Item {

    public ItemNerumesPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("nerumes_powder");
    }
}