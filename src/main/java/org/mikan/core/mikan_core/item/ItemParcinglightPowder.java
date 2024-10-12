package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemParcinglightPowder extends Item {

    public ItemParcinglightPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("parcinglight_powder");
    }
}