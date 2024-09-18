package org.mikan.core.mikan_core.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.mikan.core.mikan_core.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;


@ObjectHolder("mikan_core")
public class MikanCoreItems {
    @Mod.EventBusSubscriber(modid = "mikan_core",bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){
            final Item[] item = {
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
                    new ItemNermesIngot(),
                    new ItemNermesPowder(),
                    new ItemPacingPowder(),
                    new ItemParcingNakeIngot(),
                    new ItemZionimGem(),
                    new ItemZionimPowder(),
            };

            event.getRegistry().registerAll(item);

        }
    }
}
