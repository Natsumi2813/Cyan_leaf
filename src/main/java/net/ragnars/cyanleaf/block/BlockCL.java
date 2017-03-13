package net.ragnars.cyanleaf.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.ragnars.cyanleaf.creativetab.CreativeTabCL;
import net.ragnars.cyanleaf.reference.Reference;

/**
 * Created by new pc on 12/03/2017.
 */
public class BlockCL extends Block
{
    public BlockCL(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabCL.CL_TAB);
    }

    public BlockCL()
    {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
