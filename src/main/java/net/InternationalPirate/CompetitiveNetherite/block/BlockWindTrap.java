package net.InternationalPirate.CompetitiveNetherite.block;


import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

//LITERALLY WHAT THE FUCK AM I DOING WIPWIPWIP
public class BlockWindTrap extends Block {
    public BlockWindTrap(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity)  {
        this.bounceUp(pEntity);
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    @Override
    public void fallOn(Level pLevel, BlockState pState, BlockPos pPos, Entity pEntity, float pFallDistance) {
        this.bounceUp(pEntity);
        pEntity.causeFallDamage(pFallDistance, 0f, pLevel.damageSources().fall());
    }

    private void bounceUp(Entity pEntity) {
        Vec3 $$1 = pEntity.getDeltaMovement();
        if ($$1.y < 0.0) {
            double $$2 = pEntity instanceof LivingEntity ? 1.0 : 0.8;
            pEntity.setDeltaMovement($$1.x, -$$1.y * $$2, $$1.z);
        }
    }
}


