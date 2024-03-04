package net.InternationalPirate.CompetitiveNetherite.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;

public class ItemInflamedAxe extends AxeItem {
    public ItemInflamedAxe(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, LivingEntity pTarget, @NotNull LivingEntity pAttacker) {
        if (pTarget instanceof Blaze) {
            pTarget.hurt(pAttacker.level().damageSources().generic(), 32);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof MagmaCube) {
            pTarget.hurt(pAttacker.level().damageSources().generic(), 32);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof Piglin) {
            pTarget.hurt(pAttacker.level().damageSources().generic(), 32);
            pTarget.setSecondsOnFire(11);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof PiglinBrute) {
            pTarget.hurt(pAttacker.level().damageSources().generic(), 32);
            pTarget.setSecondsOnFire(11);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof Hoglin) {
            pTarget.hurt(pAttacker.level().damageSources().generic(), 32);
            pTarget.setSecondsOnFire(11);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof ZombifiedPiglin) {
            pTarget.hurt(pAttacker.level().damageSources().generic(), 32);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof Zoglin) {
            pTarget.hurt(pAttacker.level().damageSources().generic(), 32);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof WitherSkeleton) {
            pTarget.hurt(pAttacker.level().damageSources().generic(), 32);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        pTarget.setSecondsOnFire(11);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}