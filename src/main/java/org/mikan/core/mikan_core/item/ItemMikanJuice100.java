package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMikanJuice100 extends Item {

    public ItemMikanJuice100(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("mikan_juice_100");
    }
}