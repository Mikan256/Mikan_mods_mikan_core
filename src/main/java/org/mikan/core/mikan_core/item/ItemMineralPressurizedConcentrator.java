package org.mikan.core.mikan_core.item;

import net.minecraft.item.Item;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMineralPressurizedConcentrator extends Item {

    public ItemMineralPressurizedConcentrator(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("mineral_pressurized_concentrator");
    }
}