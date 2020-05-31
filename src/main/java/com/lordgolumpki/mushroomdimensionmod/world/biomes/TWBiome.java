package com.lordgolumpki.mushroomdimensionmod.world.biomes;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;

public class TWBiome extends Biome {

    private static final BlockState OAK_LOG = Blocks.OAK_LOG.getDefaultState();
    private static final BlockState OAK_LEAVES = Blocks.OAK_LEAVES.getDefaultState();
    private static final BlockState BIRCH_LOG = Blocks.BIRCH_LOG.getDefaultState();
    private static final BlockState BIRCH_LEAVES = Blocks.BIRCH_LEAVES.getDefaultState();
    public static final TreeFeatureConfig OAK_TREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable) Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig field_230129_h_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BIRCH_LOG), new SimpleBlockStateProvider(BIRCH_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig field_230132_o_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig field_230131_m_ = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(OAK_LOG), new SimpleBlockStateProvider(OAK_LEAVES), new BlobFoliagePlacer(0, 0))).decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();

    public TWBiome(Builder biomeBuilder) {
        super(biomeBuilder);
        // Add Biome Features
        addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
        addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.NORMAL_TREE.withConfiguration(field_230129_h_).withChance(0.2F), Feature.FANCY_TREE.withConfiguration(field_230131_m_).withChance(0.1F)), Feature.NORMAL_TREE.withConfiguration(field_230132_o_))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
    }

}
