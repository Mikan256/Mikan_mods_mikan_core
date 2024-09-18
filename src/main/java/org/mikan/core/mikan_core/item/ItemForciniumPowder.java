package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ColorHandlerEvent;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemForciniumPowder extends Item {
    public ItemForciniumPowder(){
        super(new net.minecraft.item.Item.Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("forcinium_powder");
    }
}
