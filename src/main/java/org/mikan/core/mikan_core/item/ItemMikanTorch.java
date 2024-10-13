package org.mikan.core.mikan_core.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.command.impl.EffectCommand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.LogicalSidedProvider;
import org.mikan.core.mikan_core.init.MikanTabinit;

import javax.annotation.Nullable;
import javax.annotation.PostConstruct;
import java.util.List;

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
    //説明欄追加
    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, ITooltipFlag p_77624_4_) {
        p_77624_3_.add(this.getDisplayName().withStyle(TextFormatting.GRAY));
    }

    //langファイルから参照
    private IFormattableTextComponent getDisplayName() {
        return new TranslationTextComponent(this.getDescriptionId() + ".desc");
    }

}