package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemParcingNakeIngot extends Item {

    public ItemParcingNakeIngot(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("parcing_nake_ingot");
    }
}