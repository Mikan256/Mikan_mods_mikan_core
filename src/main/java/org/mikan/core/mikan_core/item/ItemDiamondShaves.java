package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemDiamondShaves extends Item {

    public ItemDiamondShaves(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("diamond_shaves");

    }
}