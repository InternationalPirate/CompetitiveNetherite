package net.InternationalPirate.CompetitiveNetherite.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;

public class ItemInflamedShovel extends ShovelItem {
    public ItemInflamedShovel(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, LivingEntity pTarget, @NotNull LivingEntity pAttacker) {
        pTarget.setSecondsOnFire(5);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
