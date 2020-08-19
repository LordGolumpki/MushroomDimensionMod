package com.lordgolumpki.mushroomdimensionmod.world.dimension;

import com.google.common.collect.ImmutableSet;
import com.lordgolumpki.mushroomdimensionmod.init.BiomeInit;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MushroomDimensionBiomeProvider extends BiomeProvider {

    private static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.DELECTABLE_PLAINS_BIOME.get(), BiomeInit.TRUFFLE_WOODS_BIOME.get(), BiomeInit.DECAYING_WASTELANDS_BIOME.get(), BiomeInit.PETRIFIED_DESERT_BIOME.get(), BiomeInit.PSYCHEDELIC_WOODS_BIOME.get(), BiomeInit.LUMINESCENT_CANOPY_BIOME.get());
    private Random rand;
    private final double biomeSize = 64.0D;
    private VoronoiGenerator biomeNoise;

    public MushroomDimensionBiomeProvider(MushroomDimensionBiomeProviderSettings settings) {
        super(biomeList);
        rand = new Random();
        this.biomeNoise = new VoronoiGenerator();
        this.biomeNoise.setSeed((int) settings.getSeed());
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return getBiome(new LinkedList<Biome>(biomeList),
                biomeNoise.getValue((double) x / biomeSize, (double) y / biomeSize, (double) z / biomeSize));
    }

    public Biome getBiome(List<Biome> biomeList, double noiseVal) {
        for (int i = biomeList.size(); i >= 0; i--) {
            if (noiseVal > (2.0f / biomeList.size()) * i - 1)
                return biomeList.get(i);
        }
        return biomeList.get(biomeList.size() - 1);
    }

}
