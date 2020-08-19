package com.lordgolumpki.mushroomdimensionmod.objects.blocks;

import com.lordgolumpki.mushroomdimensionmod.MushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.init.DimensionInit;
import com.lordgolumpki.mushroomdimensionmod.world.dimension.BiMushroomDimension;
import com.lordgolumpki.mushroomdimensionmod.world.dimension.MushroomDimensionFrame;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.EndPortalBlock;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModPortalBlock extends Block {

    public ModPortalBlock(Properties builder) {
        super(builder);
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (!worldIn.isRemote && !entityIn.isPassenger() && !entityIn.isBeingRidden() && entityIn.isNonBoss() && VoxelShapes.compare(VoxelShapes.create(entityIn.getBoundingBox().offset((double)(-pos.getX()), (double)(-pos.getY()), (double)(-pos.getZ()))), state.getShape(worldIn, pos), IBooleanFunction.AND)) {
            entityIn.changeDimension(worldIn.dimension.getType() == DimensionType.byName(MushroomDimension.MUSHROOM_DIM_TYPE) ? DimensionType.OVERWORLD : DimensionType.byName(MushroomDimension.MUSHROOM_DIM_TYPE));
        }

    }

}
