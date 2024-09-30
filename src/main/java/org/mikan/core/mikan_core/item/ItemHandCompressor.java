package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemHandCompressor extends Item {

    public ItemHandCompressor(){
        super(new Properties().tab(MikanTabinit.Mikan_tab)
                .durability(60)

        );

        this.setRegistryName("hand_compressor");

    }
}