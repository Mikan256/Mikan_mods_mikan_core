package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemZionimPowder extends Item {

    public ItemZionimPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("zionim_powder");
    }
}