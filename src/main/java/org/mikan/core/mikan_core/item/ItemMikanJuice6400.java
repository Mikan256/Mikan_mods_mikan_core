package org.mikan.core.mikan_core.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMikanJuice6400 extends Item {

    //食べ物の追加とエフェクトの追加
    public ItemMikanJuice6400(){
        super(new Properties().tab(MikanTabinit.Mikan_tab).food(new Food.Builder().alwaysEat().nutrition(999).saturationMod(999.0F).effect(new EffectInstance(Effects.DAMAGE_RESISTANCE,1200,3),1F).build()));
        this.setRegistryName("mikan_juice_6400");
    }

    //飲み物の音に変更
    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }
}