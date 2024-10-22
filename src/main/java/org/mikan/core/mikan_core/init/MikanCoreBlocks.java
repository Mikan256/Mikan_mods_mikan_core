package org.mikan.core.mikan_core.init;


import com.google.common.base.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import org.mikan.core.mikan_core.block.*;

@ObjectHolder("mikan_core")
public class MikanCoreBlocks {
    //ブロックアイテム用初期化
    public static final BlockAstiumOre astium_ore = null;
    public static final BlockEnderlightOre enderlight_ore = null;
    public static final BlockForciniumOre forcinium_ore = null;
    public static final BlockMikaniumOre mikanium_ore = null;
    public static final BlockMikanLeave mikan_leave= null;
    public static final BlockMikanLog mikan_log = null;
    public static final BlockMikanSapling mikan_sapling = null;
    public static final BlockNerumesOre nerumes_ore = null;
    public static final BlockParcingNakeOre parcing_nake_ore = null;
    public static final BlockZionimOre zionim_ore = null;


    @Mod.EventBusSubscriber(modid = "mikan_core",bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerBlock(final RegistryEvent.Register<Block> event){
            final Block[] blocks = {
                    //ここにブロック登録
                    new BlockAstiumOre(),
                    new BlockEnderlightOre(),
                    new BlockForciniumOre(),
                    new BlockMikaniumOre(),
                    new BlockMikanLeave(),
                    new BlockMikanLog(),
                    new BlockMikanSapling(),
                    new BlockNerumesOre(),
                    new BlockParcingNakeOre(),
                    new BlockZionimOre(),
            };
            event.getRegistry().registerAll(blocks);

            //透過ブロックの透過処理
            for(Block block : blocks){
                if (block instanceof BlockMikanLeave){
                    RenderTypeLookup.setRenderLayer(block, RenderType.cutout());
                }
                else if (block instanceof BlockMikanSapling){
                    RenderTypeLookup.setRenderLayer(block,RenderType.cutout());
                }
            }
        }

        @SubscribeEvent
        public static void registerBlockItem (final RegistryEvent.Register<Item> event){
            final BlockItem[] items = {
                    //ブロックアイテム登録

                    new BlockItem(astium_ore, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(enderlight_ore, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(forcinium_ore, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(mikanium_ore, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(mikan_leave, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(mikan_log, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(mikan_sapling, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(nerumes_ore, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(parcing_nake_ore, new Item.Properties().tab(MikanTabinit.Mikan_tab)),
                    new BlockItem(zionim_ore, new Item.Properties().tab(MikanTabinit.Mikan_tab)),


            };
            //ブロックアイテムのアイテム変換とアイテム登録処理
            for(BlockItem item : items){
                final Block block = item.getBlock();
                final ResourceLocation location = Preconditions.checkNotNull(block.getRegistryName(),"None RegistryName");
                event.getRegistry().register(item.setRegistryName(location));
            }

        }

        //参照用登録ブロック
        public static final RegistryObject<Block> ASTIUM_ORE = RegistryObject.of(new ResourceLocation("mikan_core:astium_ore"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> ENDERLIGHT_ORE = RegistryObject.of(new ResourceLocation("mikan_core:enderlight_ore"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> FORCINIUM_ORE = RegistryObject.of(new ResourceLocation("mikan_core:forcinium_ore"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> MIKANIUM_ORE = RegistryObject.of(new ResourceLocation("mikan_core:mikanium_ore"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> MIKAN_LEAVE = RegistryObject.of(new ResourceLocation("mikan_core:mikan_leave"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> MIKAN_LOG = RegistryObject.of(new ResourceLocation("mikan_core:mikan_log"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> MIKAN_SAPLING = RegistryObject.of(new ResourceLocation("mikan_core:mikan_sapling"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> NERUMES_ORE = RegistryObject.of(new ResourceLocation("mikan_core:nerumes_ore"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> PARCING_NAKE_ORE = RegistryObject.of(new ResourceLocation("mikan_core:parcing_nake_ore"), ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> ZIONIM_ORE = RegistryObject.of(new ResourceLocation("mikan_core:zionim_ore"), ForgeRegistries.BLOCKS);
        //参照用登録アイテム
        public static final RegistryObject<BlockItem> ASTIUM_ORE_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:astium_ore"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> ENDERLIGHT_ORE_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:enderlight_ore"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> FORCINIUM_ORE_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:forcinium_ore"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> MIKANIUM_ORE_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:mikanium_ore"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> MIKAN_LEAVE_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:mikan_leave"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> MIKAN_LOG_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:mikan_log"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> MIKAN_SAPLING_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:mikan_sapling"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> NERUMES_ORE_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:nerumes_ore"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> PARCING_NAKE_ORE_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:parcing_nake_ore"), ForgeRegistries.ITEMS);
        public static final RegistryObject<BlockItem> ZIONIM_ORE_ITEM = RegistryObject.of(new ResourceLocation("mikan_core:zionim_ore"), ForgeRegistries.ITEMS);
    }

}
