package net.InternationalPirate.CompetitiveNetherite.client.model.armor;

import net.InternationalPirate.CompetitiveNetherite.CompetitiveNetherite;
import net.InternationalPirate.CompetitiveNetherite.client.model.armor.InflamedNetheriteArmorModel;
import net.InternationalPirate.CompetitiveNetherite.item.ItemInflamedArmor;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class InflamedNetheriteArmorRenderer extends GeoArmorRenderer<ItemInflamedArmor> {
    public InflamedNetheriteArmorRenderer() {
        super(new InflamedNetheriteArmorModel());
    }
}
