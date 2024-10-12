package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemParcinglightIngot extends Item {

    public ItemParcinglightIngot(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("parcinglight_ingot");
    }
}