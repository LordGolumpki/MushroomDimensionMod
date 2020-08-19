package com.lordgolumpki.mushroomdimensionmod.init;

import com.lordgolumpki.mushroomdimensionmod.MushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.objects.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    // Create Registers
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MushroomDimension.MOD_ID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MushroomDimension.MOD_ID);

    // Register Blocks
    public static final RegistryObject<Block> TOPSOIL = BLOCKS.register("topsoil", () -> new MyceliumBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.BROWN).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> DECAY = BLOCKS.register("decay", () -> new MyceliumBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.GRAY).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> MOSS = BLOCKS.register("moss", () -> new MyceliumBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.GRASS).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> PSYCHEDELIC_DIRT = BLOCKS.register("psychedelic_dirt", () -> new MyceliumBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.DIRT).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> LEAFY_DIRT = BLOCKS.register("leafy_dirt", () -> new MyceliumBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.DIRT).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> GLASS_SAND = BLOCKS.register("glass_sand", () -> new SandBlock(7266020, Block.Properties.create(Material.SAND, MaterialColor.SAND).hardnessAndResistance(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> CHAMPIGNON = BLOCKS.register("champignon", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> SHIITAKE = BLOCKS.register("shiitake", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> CRIMINI = BLOCKS.register("crimini", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> KING_TRUMPET_BLOCK = BLOCKS.register("king_trumpet_block", () -> new HugeMushroomBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> KING_TRUMPET_STEM = BLOCKS.register("king_trumpet_stem", () -> new RotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> KING_TRUMPET_GRAIN = BLOCKS.register("king_trumpet_grain", () -> new ModSaplingBlock(null, Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> MUSHROOM_PLANKS = BLOCKS.register("mushroom_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MUSHROOM_DIMENSION_PORTAL = BLOCKS.register("mushroom_dimension_portal", () -> new ModPortalBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0f).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> TETRAD_CREEP = BLOCKS.register("tetrad_creep", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> LILAC_CAP = BLOCKS.register("lilac_cap", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> YELLOW_BULB = BLOCKS.register("yellow_bulb", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> ORCHID = BLOCKS.register("orchid", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> GREEN_PEPE_BLOCK = BLOCKS.register("green_pepe_block", () -> new HugeMushroomBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> GREEN_PEPE_STEM = BLOCKS.register("green_pepe_stem", () -> new RotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> GREEN_PEPE_GRAIN = BLOCKS.register("green_pepe_grain", () -> new ModSaplingBlock(null, Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> PETRIFIED_MUSHROOM_ORE = BLOCKS.register("petrified_mushroom_ore", () -> new ModOreBlock(Block.Properties.from(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> CRYSTALLIZED_SHIITAKE_ORE = BLOCKS.register("crystallized_shiitake_ore", () -> new ModOreBlock(Block.Properties.from(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> LICHEN_ORE = BLOCKS.register("lichen_ore", () -> new ModOreBlock(Block.Properties.from(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> RAGGED_BRUSH = BLOCKS.register("ragged_brush", () -> new ModDesertBushBlock(Block.Properties.create(Material.TALL_PLANTS, MaterialColor.WOOD).doesNotBlockMovement().hardnessAndResistance(0f).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> MUSHTUS = BLOCKS.register("mushtus", () -> new ModDesertBushBlock(Block.Properties.create(Material.TALL_PLANTS, MaterialColor.GRASS).doesNotBlockMovement().hardnessAndResistance(0f).sound(SoundType.PLANT)));
    public static final RegistryObject<Block> DEAD_LOG = BLOCKS.register("dead_log", () -> new RotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG)));

    // Register Block Items
    public static final RegistryObject<Item> TOPSOIL_ITEM = BLOCK_ITEMS.register("topsoil", () -> new BlockItem(TOPSOIL.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> DECAY_ITEM = BLOCK_ITEMS.register("decay", () -> new BlockItem(DECAY.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> MOSS_ITEM = BLOCK_ITEMS.register("moss", () -> new BlockItem(MOSS.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> LEAFY_DIRT_ITEM = BLOCK_ITEMS.register("leafy_dirt", () -> new BlockItem(LEAFY_DIRT.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PSYCHEDELIC_DIRT_ITEM = BLOCK_ITEMS.register("psychedelic_dirt", () -> new BlockItem(PSYCHEDELIC_DIRT.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> GLASS_SAND_ITEM = BLOCK_ITEMS.register("glass_sand", () -> new BlockItem(GLASS_SAND.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> CHAMPIGNON_ITEM = BLOCK_ITEMS.register("champignon", () -> new BlockItem(CHAMPIGNON.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(3).saturation(0.3F).build())));
    public static final RegistryObject<Item> SHIITAKE_ITEM = BLOCK_ITEMS.register("shiitake", () -> new BlockItem(SHIITAKE.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(3).saturation(0.3F).build())));
    public static final RegistryObject<Item> CRIMINI_ITEM = BLOCK_ITEMS.register("crimini", () -> new BlockItem(CRIMINI.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(3).saturation(0.3F).build())));
    public static final RegistryObject<Item> KING_TRUMPET_BLOCK_ITEM = BLOCK_ITEMS.register("king_trumpet_block", () -> new BlockItem(KING_TRUMPET_BLOCK.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> KING_TRUMPET_STEM_ITEM = BLOCK_ITEMS.register("king_trumpet_stem", () -> new BlockItem(KING_TRUMPET_STEM.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> KING_TRUMPET_GRAIN_ITEM = BLOCK_ITEMS.register("king_trumpet_grain", () -> new BlockItem(KING_TRUMPET_GRAIN.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> MUSHROOM_PLANKS_ITEM = BLOCK_ITEMS.register("mushroom_planks", () -> new BlockItem(MUSHROOM_PLANKS.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> MUSHROOM_DIMENSION_PORTAL_ITEM = BLOCK_ITEMS.register("mushroom_dimension_portal", () -> new BlockItem(MUSHROOM_DIMENSION_PORTAL.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> TETRAD_CREEP_ITEM = BLOCK_ITEMS.register("tetrad_creep", () -> new BlockItem(TETRAD_CREEP.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(3).saturation(0.3F).effect(new EffectInstance(Effects.NAUSEA, 3000, 1), 1.0F).build())));
    public static final RegistryObject<Item> LILAC_CAP_ITEM = BLOCK_ITEMS.register("lilac_cap", () -> new BlockItem(LILAC_CAP.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(3).saturation(0.3F).effect(new EffectInstance(Effects.BLINDNESS, 4000, 1), 1.0F).build())));
    public static final RegistryObject<Item> YELLOW_BULB_ITEM = BLOCK_ITEMS.register("yellow_bulb", () -> new BlockItem(YELLOW_BULB.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(3).saturation(0.3F).effect(new EffectInstance(Effects.POISON, 6000, 1), 1.0F).build())));
    public static final RegistryObject<Item> ORCHID_ITEM = BLOCK_ITEMS.register("orchid", () -> new BlockItem(ORCHID.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_PEPE_BLOCK_ITEM = BLOCK_ITEMS.register("green_pepe_block", () -> new BlockItem(GREEN_PEPE_BLOCK.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_PEPE_STEM_ITEM = BLOCK_ITEMS.register("green_pepe_stem", () -> new BlockItem(GREEN_PEPE_STEM.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> GREEN_PEPE_GRAIN_ITEM = BLOCK_ITEMS.register("green_pepe_grain", () -> new BlockItem(GREEN_PEPE_GRAIN.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PETRIFIED_MUSHROOM_ORE_ITEM = BLOCK_ITEMS.register("petrified_mushroom_ore", () -> new BlockItem(PETRIFIED_MUSHROOM_ORE.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> CRYSTALLIZED_SHIITAKE_ORE_ITEM = BLOCK_ITEMS.register("crystallized_shiitake_ore", () -> new BlockItem(CRYSTALLIZED_SHIITAKE_ORE.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> LICHEN_ORE_ITEM = BLOCK_ITEMS.register("lichen_ore", () -> new BlockItem(LICHEN_ORE.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> RAGGED_BRUSH_ITEM = BLOCK_ITEMS.register("ragged_brush", () -> new BlockItem(RAGGED_BRUSH.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> MUSHTUS_ITEM = BLOCK_ITEMS.register("mushtus", () -> new BlockItem(MUSHTUS.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> DEAD_LOG_ITEM = BLOCK_ITEMS.register("dead_log", () -> new BlockItem(DEAD_LOG.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));

}
