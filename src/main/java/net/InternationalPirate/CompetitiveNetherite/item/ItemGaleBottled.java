package net.InternationalPirate.CompetitiveNetherite.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemGaleBottled extends Item {
    public ItemGaleBottled(Properties pProperties) {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
    }

    @Override
    public void inventoryTick(@NotNull ItemStack pStack, @NotNull Level pLevel, @NotNull Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
        if (pEntity instanceof Player && pSlotId >= 0 && pSlotId <= 8) {
            if (!((Player) pEntity).hasEffect(MobEffects.MOVEMENT_SPEED))
                ((Player) pEntity).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2));
            if (!((Player) pEntity).hasEffect(MobEffects.JUMP))
                ((Player) pEntity).addEffect(new MobEffectInstance(MobEffects.JUMP, 200, 2));
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        pTooltipComponents.add(Component.translatable("You feel light on your feet...").withStyle(ChatFormatting.GRAY));
    }

}
