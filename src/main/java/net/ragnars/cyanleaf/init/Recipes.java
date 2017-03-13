package net.ragnars.cyanleaf.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by new pc on 13/03/2017.
 */
public class Recipes {
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.cyanLeaf), " s ", "sss", " s ", 's', new ItemStack(Items.stick));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.cyanFlag), new ItemStack(Items.diamond), new ItemStack(Blocks.wool), new ItemStack(ModItems.cyanLeaf));
    }
}
