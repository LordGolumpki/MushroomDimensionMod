package com.lordgolumpki.mushroomdimensionmod.init;

import com.lordgolumpki.mushroomdimensionmod.MushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.world.dimension.MushroomDimensionFrame;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {

    public static final DeferredRegister<ModDimension> MOD_DIMENSIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, MushroomDimension.MOD_ID);

    public static final RegistryObject<ModDimension> MUSHROOM_DIM = MOD_DIMENSIONS.register("mushroom_dim", () -> new MushroomDimensionFrame());

}
