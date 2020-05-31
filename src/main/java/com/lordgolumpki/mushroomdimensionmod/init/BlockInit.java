package com.lordgolumpki.mushroomdimensionmod.init;

import com.lordgolumpki.mushroomdimensionmod.MushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.objects.blocks.ModMushroomBlock;
import com.lordgolumpki.mushroomdimensionmod.objects.blocks.ModSaplingBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
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
    public static final RegistryObject<Block> LEAFY_DIRT = BLOCKS.register("leafy_dirt", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.DIRT).hardnessAndResistance(0.5F).sound(SoundType.GROUND)));
    public static final RegistryObject<Block> CHAMPIGNON = BLOCKS.register("champignon", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> SHITAKE = BLOCKS.register("shitake", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> CRIMINI = BLOCKS.register("crimini", () -> new ModMushroomBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT).lightValue(1)));
    public static final RegistryObject<Block> KING_TRUMPET_BLOCK = BLOCKS.register("king_trumpet_block", () -> new HugeMushroomBlock(Block.Properties.from(Blocks.BROWN_MUSHROOM_BLOCK)));
    public static final RegistryObject<Block> KING_TRUMPET_STEM = BLOCKS.register("king_trumpet_stem", () -> new RotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> KING_TRUMPET_GRAIN = BLOCKS.register("king_trumpet_grain", () -> new ModSaplingBlock(null, Block.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> MUSHROOM_PLANKS = BLOCKS.register("mushroom_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));

    // Register Block Items
    public static final RegistryObject<Item> TOPSOIL_ITEM = BLOCK_ITEMS.register("topsoil", () -> new BlockItem(TOPSOIL.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> DECAY_ITEM = BLOCK_ITEMS.register("decay", () -> new BlockItem(DECAY.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> MOSS_ITEM = BLOCK_ITEMS.register("moss", () -> new BlockItem(MOSS.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> LEAFY_DIRT_ITEM = BLOCK_ITEMS.register("leafy_dirt", () -> new BlockItem(LEAFY_DIRT.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PSYCHEDELIC_DIRT_ITEM = BLOCK_ITEMS.register("psychedelic_dirt", () -> new BlockItem(PSYCHEDELIC_DIRT.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> CHAMPIGNON_ITEM = BLOCK_ITEMS.register("champignon", () -> new BlockItem(CHAMPIGNON.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2F).build())));
    public static final RegistryObject<Item> SHITAKE_ITEM = BLOCK_ITEMS.register("shitake", () -> new BlockItem(SHITAKE.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2F).build())));
    public static final RegistryObject<Item> CRIMINI_ITEM = BLOCK_ITEMS.register("crimini", () -> new BlockItem(CRIMINI.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2F).build())));
    public static final RegistryObject<Item> KING_TRUMPET_BLOCK_ITEM = BLOCK_ITEMS.register("king_trumpet_block", () -> new BlockItem(KING_TRUMPET_BLOCK.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> KING_TRUMPET_STEM_ITEM = BLOCK_ITEMS.register("king_trumpet_stem", () -> new BlockItem(KING_TRUMPET_STEM.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> KING_TRUMPET_GRAIN_ITEM = BLOCK_ITEMS.register("king_trumpet_grain", () -> new BlockItem(KING_TRUMPET_GRAIN.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> MUSHROOM_PLANKS_ITEM = BLOCK_ITEMS.register("mushroom_planks", () -> new BlockItem(MUSHROOM_PLANKS.get(), new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));

}
