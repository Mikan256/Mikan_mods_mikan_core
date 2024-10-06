package org.mikan.core.mikan_core;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mikan_core")
public class Mikan_core {

    public static final String MOD_ID = "mikan_core";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Mikan_core() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        //MinecraftForge.EVENT_BUS.register(this);

    }


    private void setup(final FMLCommonSetupEvent event) {
        // 初期化用メッセージ
        LOGGER.info("MikanCore was powered.");

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // クライアント導入処理
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // サーバー導入処理
        LOGGER.info("MikanCore導入完了");
    }
}