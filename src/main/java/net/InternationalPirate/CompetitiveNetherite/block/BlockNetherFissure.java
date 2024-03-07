package net.InternationalPirate.CompetitiveNetherite.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BlockNetherFissure extends Block {
    public BlockNetherFissure(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        pEntity.setSecondsOnFire(20);
        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}


