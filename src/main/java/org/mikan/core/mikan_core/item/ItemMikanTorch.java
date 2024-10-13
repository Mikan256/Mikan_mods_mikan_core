package org.mikan.core.mikan_core.item;

import net.minecraft.command.impl.EffectCommand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.fml.LogicalSidedProvider;
import org.mikan.core.mikan_core.init.MikanTabinit;

public class ItemMikanTorch extends Item {

    public ItemMikanTorch(){
        super(new Properties().tab(MikanTabinit.Mikan_tab));
        this.setRegistryName("mikan_torch");
    }
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClientSide && entity instanceof  PlayerEntity){
            PlayerEntity player = (PlayerEntity) entity;
            player.clearFire();
            player.addEffect(new EffectInstance(Effects.SATURATION,20,0,false,false));

        }
        super.inventoryTick(stack, world, entity, slot, selected);

    }

}