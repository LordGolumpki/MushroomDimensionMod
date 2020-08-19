package com.lordgolumpki.mushroomdimensionmod.objects.blocks;

import com.lordgolumpki.mushroomdimensionmod.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;
import java.util.Random;

public class ModOreBlock extends OreBlock {

    public ModOreBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected int getExperience(Random rand) {
        if (this == BlockInit.CRYSTALLIZED_SHIITAKE_ORE.get()) {
            return MathHelper.nextInt(rand, 2, 5);
        } else if (this == BlockInit.PETRIFIED_MUSHROOM_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else {
            return 0;
        }
    }

}
