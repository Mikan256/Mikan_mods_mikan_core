package org.mikan.core.mikan_core;

import net.minecraft.item.*;
import org.mikan.core.mikan_core.init.ItemTestInit;

public class Mikan_tab extends ItemGroup {

    //タブ作成
    public Mikan_tab() {
        super("MikanMod");
    }

    //アイコン
    @Override
    public ItemStack makeIcon(){
        return new ItemStack(ItemTestInit.Items.TEST.get());
    }
}
