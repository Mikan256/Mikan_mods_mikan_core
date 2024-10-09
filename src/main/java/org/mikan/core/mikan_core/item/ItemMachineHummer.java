package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMachineHummer extends Item {

    public ItemMachineHummer(){
        super(new Properties().tab(MikanTabinit.Mikan_tab).durability(60));
        this.setRegistryName("machine_hummer");

    }
}