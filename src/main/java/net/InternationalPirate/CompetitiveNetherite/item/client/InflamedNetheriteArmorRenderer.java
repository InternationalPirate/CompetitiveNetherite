package net.InternationalPirate.CompetitiveNetherite.item.client;

import net.InternationalPirate.CompetitiveNetherite.item.client.InflamedNetheriteArmorModel;
import net.InternationalPirate.CompetitiveNetherite.item.ItemInflamedArmor;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class InflamedNetheriteArmorRenderer extends GeoArmorRenderer<ItemInflamedArmor> {
    public InflamedNetheriteArmorRenderer() {
        super(new InflamedNetheriteArmorModel());
    }
}
