package com.lordgolumpki.mushroomdimensionmod.objects.blocks;

import com.lordgolumpki.mushroomdimensionmod.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class ModDesertBushBlock extends BushBlock {

    public ModDesertBushBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == BlockInit.GLASS_SAND.get() || block == Blocks.SAND || block == Blocks.RED_SAND;
    }

}
