package net.InternationalPirate.CompetitiveNetherite.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;

public class ItemInflamedShovel extends ShovelItem {
    public ItemInflamedShovel(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, new Item.Properties().fireResistant());
    }
    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, @NotNull LivingEntity pTarget, @NotNull LivingEntity pAttacker) {
        if (pTarget instanceof Blaze || pTarget instanceof MagmaCube || pTarget instanceof Ghast || pTarget instanceof WitherSkeleton || pTarget instanceof ZombifiedPiglin || pTarget instanceof Strider || pTarget instanceof Zoglin) {
            pTarget.hurt(pAttacker.damageSources().generic(), 27);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        if (pTarget instanceof Piglin || pTarget instanceof PiglinBrute || pTarget instanceof Hoglin) {
            pTarget.hurt(pAttacker.damageSources().generic(), 27);
            pTarget.setSecondsOnFire(11);
            return super.hurtEnemy(pStack, pTarget, pAttacker);
        }
        pTarget.setSecondsOnFire(11);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
