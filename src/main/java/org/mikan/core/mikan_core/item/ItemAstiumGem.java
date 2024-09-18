package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemAstiumGem extends Item {

    public  ItemAstiumGem(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("astium_gem");
    }
}
