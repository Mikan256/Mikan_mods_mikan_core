package org.mikan.core.mikan_core;

import net.minecraft.item.*;
import net.minecraftforge.registries.ObjectHolder;
import org.lwjgl.system.CallbackI;
import org.mikan.core.mikan_core.init.MikanCoreBlocks;
import org.mikan.core.mikan_core.init.MikanCoreItems;
import org.mikan.core.mikan_core.item.ItemAstiumGem;

public class Mikan_tab extends ItemGroup {

    //タブ作成
    public Mikan_tab() {
        super("MikanMod");
    }


    //アイコン
    @Override
    public ItemStack makeIcon(){
        return new ItemStack(MikanCoreItems.Register.MIKAN.get());

    }

}
