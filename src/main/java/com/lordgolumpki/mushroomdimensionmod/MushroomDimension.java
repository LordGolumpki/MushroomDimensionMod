package com.lordgolumpki.mushroomdimensionmod;

import com.lordgolumpki.mushroomdimensionmod.init.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mushdim")
@Mod.EventBusSubscriber(modid = MushroomDimension.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MushroomDimension {

    // Initialize Variables
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mushdim";
    public static MushroomDimension instance;
    public static final ResourceLocation MUSHROOM_DIM_TYPE = new ResourceLocation(MOD_ID, "mushroom_dimension");

    public MushroomDimension() {
        // Add Mod Bus
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        // Add Init Classes
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        BlockInit.BLOCK_ITEMS.register(modEventBus);
        BiomeInit.BIOMES.register(modEventBus);
        DimensionInit.MOD_DIMENSIONS.register(modEventBus);

        // Create An Instance
        instance = this;

        // Tell Forge About The Bus
        MinecraftForge.EVENT_BUS.register(this);
    }

    // Register Biomes
    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
    }

    // Do Setup Stuff
    private void setup(final FMLCommonSetupEvent event) {
    }

    // Do Client Stuff
    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    // Do Stuff When Server Starts
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    // Make Creative Tab
    public static class MushroomDimensionItemGroup extends ItemGroup {
        public static final MushroomDimensionItemGroup instance = new MushroomDimensionItemGroup(ItemGroup.GROUPS.length, "mushdimtab");

        private MushroomDimensionItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.PETRIFIED_MUSHROOM.get());
        }
    }

}
