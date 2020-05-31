package com.lordgolumpki.mushroomdimensionmod.objects.blocks;

import com.lordgolumpki.mushroomdimensionmod.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MushroomBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class ModMushroomBlock extends MushroomBlock {

    public ModMushroomBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.down();
        BlockState blockstate = worldIn.getBlockState(blockpos);
        Block block = blockstate.getBlock();
        if (block != Blocks.MYCELIUM && block != Blocks.PODZOL && block != BlockInit.TOPSOIL.get() && block != BlockInit.DECAY.get() && block != BlockInit.MOSS.get() && block != BlockInit.PSYCHEDELIC_DIRT.get() && block != BlockInit.LEAFY_DIRT.get()) {
            return worldIn.getLightSubtracted(pos, 0) < 13 && blockstate.canSustainPlant(worldIn, blockpos, net.minecraft.util.Direction.UP, this);
        } else {
            return true;
        }
    }

}
