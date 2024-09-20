package org.mikan.core.mikan_core.init;


import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.mikan.core.mikan_core.block.BlockAstiumOre;

@ObjectHolder("mikan_core")
public class MikanCoreBlocks {
    //ブロックアイテム用初期化
    public static final BlockAstiumOre ASTIUM_ORE = null;

    @Mod.EventBusSubscriber(modid = "mikan_core",bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerBlock(final RegistryEvent.Register<Block> event){
            final Block[] blocks = {
                    //ここにブロック登録
                    new BlockAstiumOre(),
            };
            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItem (final RegistryEvent.Register<Item> event){
            final BlockItem[] items = {
                    //ブロックアイテム登録
                    new BlockItem(ASTIUM_ORE, new Item.Properties().tab(MikanTabinit.Mikan_tab))

            };
            //ブロックアイテムのアイテム変換とアイテム登録処理
            for(BlockItem item : items){
                final Block block = item.getBlock();
                final ResourceLocation location = Preconditions.checkNotNull(block.getRegistryName(),"None RegistryName");
                event.getRegistry().register(item.setRegistryName(location));
            }

    }

    }
}
