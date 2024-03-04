package net.InternationalPirate.CompetitiveNetherite.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import org.jetbrains.annotations.NotNull;

public class ItemStrangeHoe extends HoeItem {

    public ItemStrangeHoe(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack pStack, @NotNull LivingEntity pTarget, @NotNull LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200), pAttacker);
        pTarget.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 2), pAttacker);
        pTarget.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1200), pAttacker);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
