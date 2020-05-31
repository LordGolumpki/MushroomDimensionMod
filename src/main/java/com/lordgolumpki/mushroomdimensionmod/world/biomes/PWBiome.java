package com.lordgolumpki.mushroomdimensionmod.world.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.ProbabilityConfig;

public class PWBiome extends Biome {

    public PWBiome(Builder biomeBuilder) {
        super(biomeBuilder);
        // Add Biome Features
        addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
    }

}
