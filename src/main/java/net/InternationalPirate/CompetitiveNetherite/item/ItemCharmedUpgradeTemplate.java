package net.InternationalPirate.CompetitiveNetherite.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ItemCharmedUpgradeTemplate extends Item {
    public ItemCharmedUpgradeTemplate(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.competitivenetherite.charmedupgradetemplate_0").withStyle(ChatFormatting.DARK_RED));
        pTooltipComponents.add(Component.translatable("tooltip.competitivenetherite.upgradetemplate_0").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.competitivenetherite.upgradetemplate_1").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.competitivenetherite.upgradetemplate_2").withStyle(ChatFormatting.DARK_GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.competitivenetherite.upgradetemplate_3").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltip.competitivenetherite.charmedupgradetemplate_1").withStyle(ChatFormatting.RED));
    }
}
