package com.lordgolumpki.mushroomdimensionmod.util;

import com.lordgolumpki.mushroomdimensionmod.MushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MushroomDimension.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.CHAMPIGNON.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SHITAKE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.CRIMINI.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.KING_TRUMPET_GRAIN.get(), RenderType.getCutout());
    }

}
