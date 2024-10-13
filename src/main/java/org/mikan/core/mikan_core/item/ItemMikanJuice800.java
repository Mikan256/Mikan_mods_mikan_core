package org.mikan.core.mikan_core.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMikanJuice800 extends Item {
    //食べ物とエフェクト追加
    public ItemMikanJuice800(){
        super(new Properties().tab(MikanTabinit.Mikan_tab).food(new Food.Builder().alwaysEat().nutrition(48).saturationMod(16.0F).effect(new EffectInstance(Effects.HEAL,10,1),1F).build()));
        this.setRegistryName("mikan_juice_800");
    }

    //飲み物の音に変更
    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }
}