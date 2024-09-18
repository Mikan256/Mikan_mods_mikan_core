package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemEnderlightGem extends Item {

    public ItemEnderlightGem(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("enderlight_gem");
    }
}