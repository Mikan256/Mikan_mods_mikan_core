package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMikanJuice6400 extends Item {

    public ItemMikanJuice6400(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("mikan_juice_6400");
    }
}