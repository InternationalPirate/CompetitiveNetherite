package net.InternationalPirate.CompetitiveNetherite.util;

import net.InternationalPirate.CompetitiveNetherite.CompetitiveNetherite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CNTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SPECIAL_NETHERITE = tag("needs_special_netherite");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CompetitiveNetherite.MODID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(CompetitiveNetherite.MODID, name));
        }
    }
}
