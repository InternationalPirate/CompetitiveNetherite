package net.InternationalPirate.CompetitiveNetherite.item;

import net.InternationalPirate.CompetitiveNetherite.CompetitiveNetherite;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CNItemList {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CompetitiveNetherite.MODID);

    //GENERAL ITEM LIST
    public static final RegistryObject<Item> ALLUDING_GUST = ITEMS.register("alluding_gust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNAL_PYRE = ITEMS.register("infernal_pyre",
            () -> new ItemInfernalPyre(new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_HEART = ITEMS.register("strange_heart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GALE_BOTTLED = ITEMS.register("gale_bottled",
            () -> new ItemGaleBottled(new Item.Properties()));

    //NEW UPGRADE TEMPLATE LIST
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_INFLAMED = ITEMS.register("upgrade_template_inflamed",
            () -> new ItemInflamedUpgradeTemplate(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_STRANGE = ITEMS.register("upgrade_template_strange",
            () -> new ItemStrangeUpgradeTemplate(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_CHARMED = ITEMS.register("upgrade_template_charmed",
            () -> new ItemCharmedUpgradeTemplate(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_HARDENED = ITEMS.register("upgrade_template_hardened",
            () -> new ItemHardenedUpgradeTemplate(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_SOULSTEALER = ITEMS.register("upgrade_template_soulstealer",
            () -> new ItemSoulstealerUpgradeTemplate(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_WINDSWEPT = ITEMS.register("upgrade_template_windswept",
            () -> new ItemWindsweptUpgradeTemplate(new Item.Properties()));

    //TOOL AND WEAPON LIST
    public static final RegistryObject<Item> INFLAMED_NETHERITE_SWORD = ITEMS.register("inflamed_netherite_sword",
            () -> new ItemInflamedSword(SpecialNetheriteTiers.NETHERITE_TIER_INFLAMED, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_AXE = ITEMS.register("inflamed_netherite_axe",
            () -> new ItemInflamedAxe(SpecialNetheriteTiers.NETHERITE_TIER_INFLAMED, 5, -3f, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_PICKAXE = ITEMS.register("inflamed_netherite_pickaxe",
            () -> new ItemInflamedPickaxe(SpecialNetheriteTiers.NETHERITE_TIER_INFLAMED, -2, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_SHOVEL = ITEMS.register("inflamed_netherite_shovel",
            () -> new ItemInflamedShovel(SpecialNetheriteTiers.NETHERITE_TIER_INFLAMED, 1, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_HOE = ITEMS.register("inflamed_netherite_hoe",
            () -> new ItemInflamedHoe(SpecialNetheriteTiers.NETHERITE_TIER_INFLAMED, -5, 0, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_SWORD = ITEMS.register("strange_netherite_sword",
            () -> new ItemStrangeSword(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_AXE = ITEMS.register("strange_netherite_axe",
            () -> new ItemStrangeAxe(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, 6, -3f, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_PICKAXE = ITEMS.register("strange_netherite_pickaxe",
            () -> new ItemStrangePickaxe(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, -1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_SHOVEL = ITEMS.register("strange_netherite_shovel",
            () -> new ItemStrangeShovel(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, 0, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_HOE = ITEMS.register("strange_netherite_hoe",
            () -> new ItemStrangeHoe(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, -6, 0, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_SWORD = ITEMS.register("charmed_netherite_sword",
            () -> new ItemCharmedSword(SpecialNetheriteTiers.NETHERITE_TIER_CHARMED, 1, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_AXE = ITEMS.register("charmed_netherite_axe",
            () -> new ItemCharmedAxe(SpecialNetheriteTiers.NETHERITE_TIER_CHARMED, 3, -3f, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_PICKAXE = ITEMS.register("charmed_netherite_pickaxe",
            () -> new ItemCharmedPickaxe(SpecialNetheriteTiers.NETHERITE_TIER_CHARMED, -2, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_SHOVEL = ITEMS.register("charmed_netherite_shovel",
            () -> new ItemCharmedShovel(SpecialNetheriteTiers.NETHERITE_TIER_CHARMED, -1, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_HOE = ITEMS.register("charmed_netherite_hoe",
            () -> new ItemCharmedHoe(SpecialNetheriteTiers.NETHERITE_TIER_CHARMED, -8, 0, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_SWORD = ITEMS.register("hardened_netherite_sword",
            () -> new ItemHardenedSword(SpecialNetheriteTiers.NETHERITE_TIER_HARDENED, 16, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_AXE = ITEMS.register("hardened_netherite_axe",
            () -> new ItemHardenedAxe(SpecialNetheriteTiers.NETHERITE_TIER_HARDENED, 26, -3.5f, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_PICKAXE = ITEMS.register("hardened_netherite_pickaxe",
            () -> new ItemHardenedPickaxe(SpecialNetheriteTiers.NETHERITE_TIER_HARDENED, 10, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_SHOVEL = ITEMS.register("hardened_netherite_shovel",
            () -> new ItemHardenedShovel(SpecialNetheriteTiers.NETHERITE_TIER_HARDENED, 9, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_HOE = ITEMS.register("hardened_netherite_hoe",
            () -> new ItemHardenedHoe(SpecialNetheriteTiers.NETHERITE_TIER_HARDENED, 1, -3, new Item.Properties()));
    public static final RegistryObject<Item> SOULSTEALER_NETHERITE_SWORD = ITEMS.register("soulstealer_netherite_sword",
            () -> new ItemSoulstealerSword(SpecialNetheriteTiers.NETHERITE_TIER_SOULSTEALER, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> SOULSTEALER_NETHERITE_AXE = ITEMS.register("soulstealer_netherite_axe",
            () -> new ItemSoulstealerAxe(SpecialNetheriteTiers.NETHERITE_TIER_SOULSTEALER, 4, -3.3f, new Item.Properties()));
    public static final RegistryObject<Item> SOULSTEALER_NETHERITE_PICKAXE = ITEMS.register("soulstealer_netherite_pickaxe",
            () -> new ItemSoulstealerPickaxe(SpecialNetheriteTiers.NETHERITE_TIER_SOULSTEALER, -3, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> SOULSTEALER_NETHERITE_SHOVEL = ITEMS.register("soulstealer_netherite_shovel",
            () -> new ItemSoulstealerShovel(SpecialNetheriteTiers.NETHERITE_TIER_SOULSTEALER, -2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> SOULSTEALER_NETHERITE_HOE = ITEMS.register("soulstealer_netherite_hoe",
            () -> new ItemSoulstealerHoe(SpecialNetheriteTiers.NETHERITE_TIER_SOULSTEALER, -3, -3.2f, new Item.Properties()));


    //ARMOR LIST
    public static final RegistryObject<Item> INFLAMED_NETHERITE_HELMET = ITEMS.register("armor_inflamed_netherite_helmet",
            () -> new ItemInflamedArmor(CNArmorMaterials.INFLAMED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_CHESTPLATE = ITEMS.register("armor_inflamed_netherite_chestplate",
            () -> new ItemInflamedArmor(CNArmorMaterials.INFLAMED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_LEGGINGS = ITEMS.register("armor_inflamed_netherite_leggings",
            () -> new ItemInflamedArmor(CNArmorMaterials.INFLAMED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_BOOTS = ITEMS.register("armor_inflamed_netherite_boots",
            () -> new ItemInflamedArmor(CNArmorMaterials.INFLAMED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CHARMED_NETHERITE_HELMET = ITEMS.register("armor_charmed_netherite_helmet",
            () -> new ItemCNArmor(CNArmorMaterials.CHARMED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_CHESTPLATE = ITEMS.register("armor_charmed_netherite_chestplate",
            () -> new ItemCNArmor(CNArmorMaterials.CHARMED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_LEGGINGS = ITEMS.register("armor_charmed_netherite_leggings",
            () -> new ItemCNArmor(CNArmorMaterials.CHARMED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_BOOTS = ITEMS.register("armor_charmed_netherite_boots",
            () -> new ItemCNArmor(CNArmorMaterials.CHARMED, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_HELMET = ITEMS.register("armor_hardened_netherite_helmet",
            () -> new ItemCNArmor(CNArmorMaterials.HARDENED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_CHESTPLATE = ITEMS.register("armor_hardened_netherite_chestplate",
            () -> new ItemCNArmor(CNArmorMaterials.HARDENED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_LEGGINGS = ITEMS.register("armor_hardened_netherite_leggings",
            () -> new ItemCNArmor(CNArmorMaterials.HARDENED   , ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_BOOTS = ITEMS.register("armor_hardened_netherite_boots",
            () -> new ItemCNArmor(CNArmorMaterials.HARDENED, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
