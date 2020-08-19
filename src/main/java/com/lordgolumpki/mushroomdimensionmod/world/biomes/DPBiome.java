package com.lordgolumpki.mushroomdimensionmod.world.biomes;

import com.lordgolumpki.mushroomdimensionmod.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.common.IPlantable;

public class DPBiome extends Biome {

    private static final BlockState COAL_ORE = Blocks.COAL_ORE.getDefaultState();
    private static final BlockState IRON_ORE = Blocks.IRON_ORE.getDefaultState();
    private static final BlockState GOLD_ORE = Blocks.GOLD_ORE.getDefaultState();
    private static final BlockState REDSTONE_ORE = Blocks.REDSTONE_ORE.getDefaultState();
    private static final BlockState DIAMOND_ORE = Blocks.DIAMOND_ORE.getDefaultState();
    private static final BlockState LAPIS_ORE = Blocks.LAPIS_ORE.getDefaultState();
    private static final BlockState DIRT = Blocks.DIRT.getDefaultState();
    private static final BlockState GRAVEL = Blocks.GRAVEL.getDefaultState();
    private static final BlockState GRANITE = Blocks.GRANITE.getDefaultState();
    private static final BlockState DIORITE = Blocks.DIORITE.getDefaultState();
    private static final BlockState ANDESITE = Blocks.ANDESITE.getDefaultState();
    public static final HugeTreeFeatureConfig KING_TRUMPET_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.KING_TRUMPET_STEM.get().getDefaultState()), new SimpleBlockStateProvider(BlockInit.KING_TRUMPET_BLOCK.get().getDefaultState()))).baseHeight(5).heightInterval(10).crownHeight(0).setSapling((IPlantable)BlockInit.KING_TRUMPET_GRAIN.get()).build();
    public static final BlockClusterFeatureConfig SHIITAKE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.SHIITAKE.get().getDefaultState()), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig CRIMINI_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.CRIMINI.get().getDefaultState()), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();
    public static final BlockClusterFeatureConfig CHAMPIGNON_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockInit.CHAMPIGNON.get().getDefaultState()), new SimpleBlockPlacer())).tries(64).func_227317_b_().build();

    public DPBiome(Biome.Builder biomeBuilder) {
        super(biomeBuilder);
        // Add Carvers
        addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
        addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.02F)));

        // Add Unique Features
        addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.MEGA_JUNGLE_TREE.withConfiguration(KING_TRUMPET_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.1F, 1))));
        addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(SHIITAKE_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(4, 0.25F))));
        addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(CRIMINI_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(4, 0.25F))));
        addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(CHAMPIGNON_CONFIG).withPlacement(Placement.COUNT_CHANCE_HEIGHTMAP.configure(new HeightWithChanceConfig(4, 0.25F))));

        // Add Base World Features
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, COAL_ORE, 17)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, IRON_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 64))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, GOLD_ORE, 9)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2, 0, 0, 32))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, REDSTONE_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 16))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DIAMOND_ORE, 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 0, 0, 16))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, LAPIS_ORE, 7)).withPlacement(Placement.COUNT_DEPTH_AVERAGE.configure(new DepthAverageConfig(1, 16, 16))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DIRT, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 256))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, GRAVEL, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 256))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, GRANITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, DIORITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
        addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ANDESITE, 33)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 80))));
    }

}
