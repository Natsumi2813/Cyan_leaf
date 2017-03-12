package net.ragnars.cyanleaf;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.ragnars.cyanleaf.init.ModBlocks;
import net.ragnars.cyanleaf.init.ModItems;
import net.ragnars.cyanleaf.reference.Reference;
import net.ragnars.cyanleaf.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class CyanLeaf
{

    @Mod.Instance("LetsModReboot")
     public static CyanLeaf instance;

    @Mod.EventHandler
     public void preInit(FMLPreInitializationEvent event)
     {
         LogHelper.info("Pre Initialization Complete!");
         ModItems.init();

         ModBlocks.init();
     }

     @Mod.EventHandler
     public void init(FMLInitializationEvent event)
     {
         LogHelper.info("Initialization Complete!");
     }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
