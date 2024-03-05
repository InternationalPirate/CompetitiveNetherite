package net.InternationalPirate.CompetitiveNetherite.item;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class ItemInflamedArmor extends ArmorItem {
    public ItemInflamedArmor(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }
    //@Override
    //public HumanoidModel<? extends LivingEntity> getArmorModel(EquipmentSlot slot, HumanoidModel<? extends LivingEntity> _default)
    //{
        //return slot == EquipmentSlot.HEAD ? Models.ARMET : super.getArmorModel(slot, _default);
    //}
}
