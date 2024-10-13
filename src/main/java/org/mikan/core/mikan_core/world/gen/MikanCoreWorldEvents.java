package org.mikan.core.mikan_core.world.gen;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.mikan.core.mikan_core.Mikan_core;

@Mod.EventBusSubscriber(modid = Mikan_core.MOD_ID)
public class MikanCoreWorldEvents {

    //木の生成と鉱石の生成 バイオームローディング
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        OreGeneration.generationOres(event);
        TreeGeneration.generateTrees(event);
    }
}
