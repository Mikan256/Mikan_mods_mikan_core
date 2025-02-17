package org.mikan.core.mikan_core.item;

import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemManualMill extends Item {

    public ItemManualMill(){
        super(new Properties().tab(MikanTabinit.Mikan_tab).durability(30));
        this.setRegistryName("manual_mill");
    }
    //耐久力減り具合
    @Override
    public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
        return 1F;
    }
    //修復不可
    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }
    //クラフトアイテム残る
    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }
    //耐久値を消費
    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }
}