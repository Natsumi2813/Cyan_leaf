package net.ragnars.cyanleaf.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.ragnars.cyanleaf.block.BlockCL;
import net.ragnars.cyanleaf.block.BlockCyanFlag;
import net.ragnars.cyanleaf.reference.Reference;

/**
 * Created by new pc on 12/03/2017.
 */

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockCL cyanFlag = new BlockCyanFlag();

    public static void init(){
        GameRegistry.registerBlock(cyanFlag, "cyanFlag");
    }
}
