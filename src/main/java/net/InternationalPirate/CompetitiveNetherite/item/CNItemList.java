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
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_HEART = ITEMS.register("strange_heart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZEPHYR_BOTTLED = ITEMS.register("zephyr_bottled",
            () -> new Item(new Item.Properties()));

    //NEW UPGRADE TEMPLATE LIST
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_INFLAMED = ITEMS.register("upgrade_template_inflamed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_STRANGE = ITEMS.register("upgrade_template_strange",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_CHARMED = ITEMS.register("upgrade_template_charmed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_HARDENED = ITEMS.register("upgrade_template_hardened",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_SOULSTOLEN = ITEMS.register("upgrade_template_soulstolen",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UPGRADE_TEMPLATE_WINDSWEPT = ITEMS.register("upgrade_template_windswept",
            () -> new Item(new Item.Properties()));

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
            () -> new ItemStrangeSword(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_AXE = ITEMS.register("strange_netherite_axe",
            () -> new ItemStrangeAxe(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, 4, -3f, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_PICKAXE = ITEMS.register("strange_netherite_pickaxe",
            () -> new ItemStrangePickaxe(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, -3, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_SHOVEL = ITEMS.register("strange_netherite_shovel",
            () -> new ItemStrangeShovel(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, 0, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_NETHERITE_HOE = ITEMS.register("strange_netherite_hoe",
            () -> new ItemStrangeHoe(SpecialNetheriteTiers.NETHERITE_TIER_STRANGE, -6, 0, new Item.Properties()));

    //ARMOR LIST
    public static final RegistryObject<Item> INFLAMED_NETHERITE_HELMET = ITEMS.register("armor_inflamed_netherite_helmet",
            () -> new ArmorItem(CNArmorMaterials.INFLAMED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_CHESTPLATE = ITEMS.register("armor_inflamed_netherite_chestplate",
            () -> new ArmorItem(CNArmorMaterials.INFLAMED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_LEGGINGS = ITEMS.register("armor_inflamed_netherite_leggings",
            () -> new ArmorItem(CNArmorMaterials.INFLAMED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> INFLAMED_NETHERITE_BOOTS = ITEMS.register("armor_inflamed_netherite_boots",
            () -> new ArmorItem(CNArmorMaterials.INFLAMED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CHARMED_NETHERITE_HELMET = ITEMS.register("armor_charmed_netherite_helmet",
            () -> new ArmorItem(CNArmorMaterials.CHARMED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_CHESTPLATE = ITEMS.register("armor_charmed_netherite_chestplate",
            () -> new ArmorItem(CNArmorMaterials.CHARMED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_LEGGINGS = ITEMS.register("armor_charmed_netherite_leggings",
            () -> new ArmorItem(CNArmorMaterials.CHARMED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHARMED_NETHERITE_BOOTS = ITEMS.register("armor_charmed_netherite_boots",
            () -> new ArmorItem(CNArmorMaterials.CHARMED, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_HELMET = ITEMS.register("armor_hardened_netherite_helmet",
            () -> new ArmorItem(CNArmorMaterials.HARDENED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_CHESTPLATE = ITEMS.register("armor_hardened_netherite_chestplate",
            () -> new ArmorItem(CNArmorMaterials.HARDENED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_LEGGINGS = ITEMS.register("armor_hardened_netherite_leggings",
            () -> new ArmorItem(CNArmorMaterials.HARDENED   , ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> HARDENED_NETHERITE_BOOTS = ITEMS.register("armor_hardened_netherite_boots",
            () -> new ArmorItem(CNArmorMaterials.HARDENED, ArmorItem.Type.BOOTS, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
