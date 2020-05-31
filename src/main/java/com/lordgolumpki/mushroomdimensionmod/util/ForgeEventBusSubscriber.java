package com.lordgolumpki.mushroomdimensionmod.util;

import com.lordgolumpki.mushroomdimensionmod.MushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.init.DimensionInit;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MushroomDimension.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusSubscriber {

    @SubscribeEvent
    public static void registerDimensions(final RegisterDimensionsEvent event) {
        if(DimensionType.byName(MushroomDimension.MUSHROOM_DIM_TYPE) == null) {
            DimensionManager.registerDimension(MushroomDimension.MUSHROOM_DIM_TYPE, DimensionInit.MUSHROOM_DIM.get(), null, true);
        }
        MushroomDimension.LOGGER.info("Dimension Registered");
    }

}
