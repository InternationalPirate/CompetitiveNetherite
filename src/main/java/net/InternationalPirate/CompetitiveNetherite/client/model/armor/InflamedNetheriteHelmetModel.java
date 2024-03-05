package net.InternationalPirate.CompetitiveNetherite.client.model.armor;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class InflamedNetheriteHelmetModel {
    public InflamedNetheriteHelmetModel(ModelPart part) {
        super();
    }
    public static MeshDefinition addPieces(CubeDeformation deformation) {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        return meshdefinition;
    }
}
