package net.ragnars.cyanleaf.client.gui;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import java.util.Set;

/**
 * Created by new pc on 13/03/2017.
 */
public class GuiFactory implements IModGuiFactory{
     @Override
     public void initialize(Minecraft minecraftInstance)
     {

                    }

     @Override
     public Class<? extends GuiScreen> mainConfigGuiClass()
     {
         return ModGuiConfig.class;
     }

     @Override
     public Set<IModGuiFactory.RuntimeOptionCategoryElement> runtimeGuiCategories()
     {
         return null;
     }

     @Override
     public IModGuiFactory.RuntimeOptionGuiHandler getHandlerFor(IModGuiFactory.RuntimeOptionCategoryElement element)
     {
         return null;
     }
}
