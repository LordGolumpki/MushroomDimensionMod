package com.lordgolumpki.mushroomdimensionmod.init;

import com.lordgolumpki.mushroomdimensionmod.MushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.objects.items.PortalIgnitionItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.Supplier;

public class ItemInit {

    // Create Register
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MushroomDimension.MOD_ID);

    // Register Items
    // Items
    public static final RegistryObject<Item> PETRIFIED_MUSHROOM = ITEMS.register("petrified_mushroom", () -> new Item(new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> KING_TRUMPET = ITEMS.register("king_trumpet", () -> new Item(new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance).food(new Food.Builder().hunger(6).saturation(1.2F).build())));
    public static final RegistryObject<Item> FLINT_AND_MUSHROOM = ITEMS.register("flint_and_mushroom", () -> new PortalIgnitionItem(new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    // Tools
    public static final RegistryObject<Item> PETRIFIED_SWORD = ITEMS.register("petrified_sword", () -> new SwordItem(ModItemTier3.ITEM_TIER_3, 10, -2.4F, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PETRIFIED_PICKAXE = ITEMS.register("petrified_pickaxe", () -> new PickaxeItem(ModItemTier3.ITEM_TIER_3, 8, -2.8F, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PETRIFIED_SHOVEL = ITEMS.register("petrified_shovel", () -> new ShovelItem(ModItemTier3.ITEM_TIER_3, 7, -3.0F, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PETRIFIED_AXE = ITEMS.register("petrified_axe", () -> new AxeItem(ModItemTier3.ITEM_TIER_3, 12, -3.0F, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PETRIFIED_HOE = ITEMS.register("petrified_hoe", () -> new HoeItem(ModItemTier3.ITEM_TIER_3, 0.0F, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    // Armor
    public static final RegistryObject<Item> PETRIFIED_HELMET = ITEMS.register("petrified_helmet", () -> new ArmorItem(ModArmorTier3.ARMOR_TIER_3, EquipmentSlotType.HEAD, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PETRIFIED_CHESTPLATE = ITEMS.register("petrified_chestplate", () -> new ArmorItem(ModArmorTier3.ARMOR_TIER_3, EquipmentSlotType.CHEST, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PETRIFIED_LEGGINGS = ITEMS.register("petrified_leggings", () -> new ArmorItem(ModArmorTier3.ARMOR_TIER_3, EquipmentSlotType.LEGS, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));
    public static final RegistryObject<Item> PETRIFIED_BOOTS = ITEMS.register("petrified_boots", () -> new ArmorItem(ModArmorTier3.ARMOR_TIER_3, EquipmentSlotType.FEET, new Item.Properties().group(MushroomDimension.MushroomDimensionItemGroup.instance)));

    // Mod Item Tiers
    public enum ModItemTier3 implements IItemTier {
        ITEM_TIER_3(4, 3000, 5.0F, -1.0F, 250, () -> {
            return Ingredient.fromItems(ItemInit.PETRIFIED_MUSHROOM.get());
        });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private ModItemTier3(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }

    // Mod Armor Tiers
    public enum ModArmorTier3 implements IArmorMaterial {
        ARMOR_TIER_3(MushroomDimension.MOD_ID + ":petrified", 5, new int[] {4,7,9,4}, 250, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, () -> {
            return Ingredient.fromItems(ItemInit.PETRIFIED_MUSHROOM.get());
        });

        private static final int[] MAX_DAMAGE_ARRAY = new int[] {120,140,160,120};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent sountEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        private ModArmorTier3(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountIn;
            this.enchantability = enchantabilityIn;
            this.sountEvent = soundEventIn;
            this.toughness = toughnessIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) { return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor; }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) { return this.damageReductionAmountArray[slotIn.getIndex()]; }

        @Override
        public int getEnchantability() { return this.enchantability; }

        @Override
        public SoundEvent getSoundEvent() { return this.sountEvent; }

        @Override
        public Ingredient getRepairMaterial() { return this.repairMaterial.getValue(); }

        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName() { return this.name; }

        @Override
        public float getToughness() { return this.toughness; }
    }

}
