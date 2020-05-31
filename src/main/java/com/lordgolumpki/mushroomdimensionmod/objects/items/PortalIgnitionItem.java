package com.lordgolumpki.mushroomdimensionmod.objects.items;

import com.lordgolumpki.mushroomdimensionmod.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import java.util.List;

public class PortalIgnitionItem extends Item {

    // Create Constructor
    public PortalIgnitionItem(Properties properties) {
        super(properties);
    }

    // Give Glowy Effect
    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    // Give Dynamic Description
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("Create a portal frame of mushroom stem blocks and ignite it with this to create a portal to the Mushroom Dimension"));
        }
        else {
            tooltip.add(new StringTextComponent("Hold SHIFT for more information"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

}
