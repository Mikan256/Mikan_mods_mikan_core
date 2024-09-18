package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemAstiumPowder extends Item {

    public  ItemAstiumPowder(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("astium_powder");
    }
}