package net.ragnars.cyanleaf.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.ragnars.cyanleaf.init.ModItems;
import net.ragnars.cyanleaf.reference.Reference;

public class CreativeTabCL {
    public  static final CreativeTabs CL_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.cyanLeaf;
        }
    };
}
