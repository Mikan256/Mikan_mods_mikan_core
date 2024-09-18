package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemEnderlightPowder extends Item {

    public ItemEnderlightPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("enderlight_powder");
    }
}