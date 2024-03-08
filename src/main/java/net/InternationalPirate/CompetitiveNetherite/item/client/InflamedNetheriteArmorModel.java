package net.InternationalPirate.CompetitiveNetherite.item.client;

import net.InternationalPirate.CompetitiveNetherite.CompetitiveNetherite;
import net.InternationalPirate.CompetitiveNetherite.item.ItemInflamedArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class InflamedNetheriteArmorModel extends GeoModel<ItemInflamedArmor> {

    @Override
    public ResourceLocation getModelResource(ItemInflamedArmor itemInflamedArmor) {
        return new ResourceLocation(CompetitiveNetherite.MODID, "geo/inflamednetheritearmor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ItemInflamedArmor itemInflamedArmor) {
        return new ResourceLocation(CompetitiveNetherite.MODID, "textures/models/armor/inflamed_netherite_layer.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ItemInflamedArmor itemInflamedArmor) {
        return new ResourceLocation(CompetitiveNetherite.MODID, "animations/inflamednetheritearmor.animation.json");
    }
}
