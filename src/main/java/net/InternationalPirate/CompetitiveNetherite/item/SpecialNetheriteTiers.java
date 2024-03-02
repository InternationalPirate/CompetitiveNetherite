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
            new ResourceLocation(CompetitiveNetherite.MODID, "infernal_pyre"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier NETHERITE_TIER_STRANGE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3500, 9f, 8f, 20, CNTags.Blocks.NEEDS_SPECIAL_NETHERITE, ()-> Ingredient.of(Items.NETHERITE_INGOT)),
            new ResourceLocation(CompetitiveNetherite.MODID, "strange_heart"), List.of(Tiers.NETHERITE), List.of());
}


