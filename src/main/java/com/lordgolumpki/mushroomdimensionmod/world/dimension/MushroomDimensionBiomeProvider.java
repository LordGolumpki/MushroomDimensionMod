package com.lordgolumpki.mushroomdimensionmod.world.dimension;

import com.google.common.collect.ImmutableSet;
import com.lordgolumpki.mushroomdimensionmod.init.BiomeInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MushroomDimensionBiomeProvider extends BiomeProvider {

    public Random rand;

    public MushroomDimensionBiomeProvider() {
        super(biomeList);
        rand = new Random();
    }

    private static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.DELECTABLE_PLAINS_BIOME.get(), BiomeInit.TRUFFLE_WOODS_BIOME.get(), BiomeInit.DECAYING_WASTELANDS_BIOME.get(), BiomeInit.PETRIFIED_DESERT_BIOME.get(), BiomeInit.PSYCHEDELIC_WOODS_BIOME.get(), BiomeInit.LUMINESCENT_CANOPY_BIOME.get());

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return BiomeInit.DELECTABLE_PLAINS_BIOME.get();
    }

}
