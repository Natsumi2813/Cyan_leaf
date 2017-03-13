package net.ragnars.cyanleaf.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.ragnars.cyanleaf.item.ItemCL;
import net.ragnars.cyanleaf.item.ItemCyanLeaf;
import net.ragnars.cyanleaf.item.ItemCyanLeafSword;
import net.ragnars.cyanleaf.reference.Reference;

/**
 * Created by new pc on 12/03/2017.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemCL cyanLeaf = new ItemCyanLeaf();
    public static final ItemCL cyanLeafSword = new ItemCyanLeafSword();

    public static void init(){
        GameRegistry.registerItem(cyanLeaf, "cyanLeaf");
        GameRegistry.registerItem(cyanLeafSword, "cyanLeafSword");
    }
}
