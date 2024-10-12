package org.mikan.core.mikan_core.init;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.mikan.core.mikan_core.item.*;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;


@ObjectHolder("mikan_core")
public class MikanCoreItems {
    @Mod.EventBusSubscriber(modid = "mikan_core",bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] item = {
                    //ここにアイテム登録
                    new ItemMikan(),
                    new ItemAstiumGem(),
                    new ItemAstiumPowder(),
                    new ItemEnderlightGem(),
                    new ItemEnderlightPowder(),
                    new ItemForciniumGem(),
                    new ItemForciniumPowder(),
                    new ItemHandCompressor(),
                    new ItemMachineHummer(),
                    new ItemMikaniumIngot(),
                    new ItemMikanJuice100(),
                    new ItemMikanJuice800(),
                    new ItemMikanJuice6400(),
                    new ItemMikanTorch(),
                    new ItemMineralPressurizedConcentrator(),
                    new ItemNerumesIngot(),
                    new ItemNerumesPowder(),
                    new ItemPacingPowder(),
                    new ItemParcingNakeIngot(),
                    new ItemZionimGem(),
                    new ItemZionimPowder(),
                    new ItemDiamondShaves(),
                    new ItemManualMill(),
                    new ItemWoodGear(),
                    new ItemStoneGear(),
                    new ItemIronGear(),
                    new ItemGoldGear(),
                    new ItemDiamondGear(),
                    new ItemForneusIngot(),
                    new ItemForneusPowder(),
                    new ItemHellusIngot(),
                    new ItemHellusPowder(),
                    new ItemParcinglightIngot(),
                    new ItemParcinglightPowder(),
                    new ItemZeoidIngot(),
                    new ItemZeoidPowder()
            };
            //アイテム登録処理
            event.getRegistry().registerAll(item);

        }
        //参照用登録
        public static final RegistryObject<Item> ASTIUM_GEM = RegistryObject.of(new ResourceLocation("mikan_core:astium_gem"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> ASTIUM_POWDER = RegistryObject.of(new ResourceLocation("mikan_core:astium_powder"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> DIAMOND_GEAR = RegistryObject.of(new ResourceLocation("mikan_core:diamond_gear"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> DIAMOND_SHAVES = RegistryObject.of(new ResourceLocation("mikan_core:diamond_shaves"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> ENDERLIGHT_GEM = RegistryObject.of(new ResourceLocation("mikan_core:enderlight_gem"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> ENDERLIGHT_POWDER = RegistryObject.of(new ResourceLocation("mikan_core:enderlight_powder"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> FORCINIUM_GEM = RegistryObject.of(new ResourceLocation("mikan_core:forcinium_gem"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> FORCINIUM_POWDER = RegistryObject.of(new ResourceLocation("mikan_core:forcinium_powder"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> FORNEUS_INGOT = RegistryObject.of(new ResourceLocation("mikan_core:forneus_ingot"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> FORNEUS_POWDER = RegistryObject.of(new ResourceLocation("mikan_core:forneus_powder"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> GOLD_GEAR = RegistryObject.of(new ResourceLocation("mikan_core:gold_gear"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> HAND_COMPRESSOR = RegistryObject.of(new ResourceLocation("mikan_core:hand_compressor"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> HELLUS_INGOT = RegistryObject.of(new ResourceLocation("mikan_core:hellus_ingot"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> IRON_GEAR = RegistryObject.of(new ResourceLocation("mikan_core:iron_gear"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MACHINE_HUMMER = RegistryObject.of(new ResourceLocation("mikan_core:machine_hummer"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MANUAL_MILL = RegistryObject.of(new ResourceLocation("mikan_core:manual_mill"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MIKAN = RegistryObject.of(new ResourceLocation("mikan_core:mikan"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MIKAN_JUICE_100 = RegistryObject.of(new ResourceLocation("mikan_core:mikan_juice_100"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MIKAN_JUICE_800 = RegistryObject.of(new ResourceLocation("mikan_core:mikan_juice_800"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MIKAN_JUICE_6400 = RegistryObject.of(new ResourceLocation("mikan_core:mikan_juice_6400"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MIKAN_TORCH = RegistryObject.of(new ResourceLocation("mikan_core:mikan_torch"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MIKANIUM_INGOT = RegistryObject.of(new ResourceLocation("mikan_core:mikanium_ingot"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MINERAL_PRESSURIZED_CONCENTRATOR = RegistryObject.of(new ResourceLocation("mikan_core:mineral_pressurized_concentrator"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> NERUMES_INGOT = RegistryObject.of(new ResourceLocation("mikan_core:nerumes_ingot"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> NERUMES_POWDER = RegistryObject.of(new ResourceLocation("mikan_core:nerumes_powder"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> PARCING_NAKE_INGOT = RegistryObject.of(new ResourceLocation("mikan_core:parcing_nake_ingot"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> PARCING_POWDER = RegistryObject.of(new ResourceLocation("mikan_core:parcing_powder"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> STONE_GEAR = RegistryObject.of(new ResourceLocation("mikan_core:stone_gear"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> WOOD_GEAR = RegistryObject.of(new ResourceLocation("mikan_core:wood_gear.json"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> ZEOID_INGOT = RegistryObject.of(new ResourceLocation("mikan_core:zeoid_ingot"),ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> ZEOID_POWDER = RegistryObject.of(new ResourceLocation("mikan_core:zeoid_powder"),ForgeRegistries.ITEMS);



    }
}
