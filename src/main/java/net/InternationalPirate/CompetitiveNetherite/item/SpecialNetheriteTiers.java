package net.InternationalPirate.CompetitiveNetherite.item;

import net.InternationalPirate.CompetitiveNetherite.CompetitiveNetherite;
import net.InternationalPirate.CompetitiveNetherite.util.CNTags;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class SpecialNetheriteTiers {
    public static final Tier NETHERITE_TIER_INFLAMED = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3000, 9f, 8f, 20, CNTags.Blocks.NEEDS_SPECIAL_NETHERITE, ()-> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(CompetitiveNetherite.MODID, "inflamed"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier NETHERITE_TIER_STRANGE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3500, 9f, 8f, 20, CNTags.Blocks.NEEDS_SPECIAL_NETHERITE, ()-> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(CompetitiveNetherite.MODID, "strange"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier NETHERITE_TIER_CHARMED = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 9f, 8f, 20, CNTags.Blocks.NEEDS_SPECIAL_NETHERITE, ()-> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(CompetitiveNetherite.MODID, "charmed"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier NETHERITE_TIER_HARDENED = TierSortingRegistry.registerTier(
            new ForgeTier(5, 8800, 9f, 8f, 15, CNTags.Blocks.NEEDS_SPECIAL_NETHERITE, ()-> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(CompetitiveNetherite.MODID, "hardened"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier NETHERITE_TIER_SOULSTEALER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2100, 8f, 8f, 21, CNTags.Blocks.NEEDS_SPECIAL_NETHERITE, ()-> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(CompetitiveNetherite.MODID, "soulstealer"), List.of(Tiers.NETHERITE), List.of());
}


