package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMikaniumIngot extends Item {

    public ItemMikaniumIngot(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("mikanium_ingot");
    }
}