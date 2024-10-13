package org.mikan.core.mikan_core.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import org.mikan.core.mikan_core.init.MikanTabinit;

import java.util.List;

public class ItemMikan extends Item {

    public ItemMikan(){
        super(new Properties().tab(MikanTabinit.Mikan_tab).food(new Food.Builder().nutrition(6).saturationMod(2.0F).build()));
        this.setRegistryName("mikan");
    }

    //説明欄追加
    @Override
    public void appendHoverText(ItemStack p_77624_1_,  World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        p_77624_3_.add(this.getDisplayName().withStyle(TextFormatting.GRAY));
    }
    //langファイルから参照
    private IFormattableTextComponent getDisplayName() {
        return new TranslationTextComponent(this.getDescriptionId() + ".desc");
    }

}

