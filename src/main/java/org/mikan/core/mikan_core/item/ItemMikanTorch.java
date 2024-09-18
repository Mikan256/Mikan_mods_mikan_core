package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMikanTorch extends Item {

    public ItemMikanTorch(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("mikan_torch");
    }
}