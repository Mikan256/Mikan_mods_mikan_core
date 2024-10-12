package org.mikan.core.mikan_core.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.stats.Stats;
import net.minecraft.util.DrinkHelper;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import org.mikan.core.mikan_core.init.MikanTabinit;

import java.util.function.Supplier;

public class ItemMikanJuice100 extends Item {

    public ItemMikanJuice100(){
        super(new Properties().tab(MikanTabinit.Mikan_tab).food(new Food.Builder().alwaysEat().nutrition(6).saturationMod(2.0F).effect(new EffectInstance(Effects.NIGHT_VISION,600,1),1F).build()));
        this.setRegistryName("mikan_juice_100");
    }
    @Override
    public SoundEvent getEatingSound() {
        return SoundEvents.GENERIC_DRINK;
    }


}