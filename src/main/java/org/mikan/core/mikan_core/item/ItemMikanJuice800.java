package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMikanJuice800 extends Item {

    public ItemMikanJuice800(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("mikan_juice_800");
    }
}