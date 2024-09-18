package org.mikan.core.mikan_core.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import org.mikan.core.mikan_core.item.ItemAstiumGem;

import java.rmi.registry.Registry;

@ObjectHolder("mikan_core")
public class MikanCoreItems {
    @Mod.EventBusSubscriber(modid = "mikan_core",bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] item = {
                    new ItemAstiumGem(),
            };

            event.getRegistry().registerAll(item);

        }
    }
}
