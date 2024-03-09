package net.InternationalPirate.CompetitiveNetherite.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemInflamedPickaxe extends PickaxeItem {
    public ItemInflamedPickaxe(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Item.Properties().fireResistant());
    }
    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, @NotNull LivingEntity pTarget, @NotNull LivingEntity pAttacker) {
        if (pTarget instanceof Blaze || pTarget instanceof MagmaCube || pTarget instanceof Ghast || pTarget instanceof WitherSkeleton || pTarget instanceof ZombifiedPiglin || pTarget instanceof Strider || pTarget instanceof Zoglin) {
            pTarget.hurt(pAttacker.damageSources().generic(), 24);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof Piglin || pTarget instanceof PiglinBrute || pTarget instanceof Hoglin) {
            pTarget.hurt(pAttacker.damageSources().generic(), 24);
            pTarget.setSecondsOnFire(11);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        pTarget.setSecondsOnFire(11);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.competitivenetherite.inflamed.tools_0").withStyle(ChatFormatting.RED).withStyle(ChatFormatting.BOLD));
        pTooltipComponents.add(Component.translatable("tooltip.competitivenetherite.inflamed.tools_1").withStyle(ChatFormatting.YELLOW));
    }
}
