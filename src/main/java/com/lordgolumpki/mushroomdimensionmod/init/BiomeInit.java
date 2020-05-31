package com.lordgolumpki.mushroomdimensionmod.init;

import com.lordgolumpki.mushroomdimensionmod.MushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.world.biomes.*;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class BiomeInit {

    // Create Register
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, MushroomDimension.MOD_ID);

    // Register Biomes
    public static final RegistryObject<Biome> LUMINESCENT_CANOPY_BIOME = BIOMES.register("luminescent_canopy_biome", () -> new LCBiome(new Biome.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.MOSS.get().getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState())).precipitation(Biome.RainType.RAIN).category(Biome.Category.JUNGLE).depth(0.1F).scale(0.2F).temperature(0.95F).downfall(0.9F).waterColor(4159204).waterFogColor(329011).parent((String)null)));
    public static final RegistryObject<Biome> DELECTABLE_PLAINS_BIOME = BIOMES.register("delectable_plains_biome", () -> new DPBiome(new Biome.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.TOPSOIL.get().getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState())).precipitation(Biome.RainType.RAIN).category(Biome.Category.PLAINS).depth(0.125F).scale(0.05F).temperature(0.8F).downfall(0.4F).waterColor(4159204).waterFogColor(329011).parent((String)null)));
    public static final RegistryObject<Biome> DECAYING_WASTELANDS_BIOME = BIOMES.register("decaying_wastelands_biome", () -> new DWBiome(new Biome.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.DECAY.get().getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState())).precipitation(Biome.RainType.NONE).category(Biome.Category.MESA).depth(0.1F).scale(0.2F).temperature(2.0F).downfall(0.0F).waterColor(4159204).waterFogColor(329011).parent((String)null)));
    public static final RegistryObject<Biome> PSYCHEDELIC_WOODS_BIOME = BIOMES.register("psychedelic_woods_biome", () -> new PWBiome(new Biome.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.PSYCHEDELIC_DIRT.get().getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState())).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(0.1F).scale(0.2F).temperature(0.7F).downfall(0.8F).waterColor(4159204).waterFogColor(329011).parent((String)null)));
    public static final RegistryObject<Biome> TRUFFLE_WOODS_BIOME = BIOMES.register("truffle_woods_biome", () -> new TWBiome(new Biome.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(BlockInit.LEAFY_DIRT.get().getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState())).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(0.1F).scale(0.2F).temperature(0.7F).downfall(0.8F).waterColor(4159204).waterFogColor(329011).parent((String)null)));
    public static final RegistryObject<Biome> PETRIFIED_DESERT_BIOME = BIOMES.register("petrified_desert_biome", () -> new PDBiome(new Biome.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState(), Blocks.STONE.getDefaultState())).precipitation(Biome.RainType.NONE).category(Biome.Category.DESERT).depth(0.125F).scale(0.05F).temperature(2.0F).downfall(0.0F).waterColor(4159204).waterFogColor(329011).parent((String)null)));

    public static void registerBiomes() {
        registerBiome(LUMINESCENT_CANOPY_BIOME.get(), BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.OVERWORLD);
        registerBiome(DELECTABLE_PLAINS_BIOME.get(), BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(DECAYING_WASTELANDS_BIOME.get(), BiomeDictionary.Type.DEAD, BiomeDictionary.Type.OVERWORLD);
        registerBiome(PSYCHEDELIC_WOODS_BIOME.get(), BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        registerBiome(TRUFFLE_WOODS_BIOME.get(), BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        registerBiome(PETRIFIED_DESERT_BIOME.get(), BiomeDictionary.Type.SANDY, BiomeDictionary.Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }

}
