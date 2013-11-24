package assets.dyedcobblestone.common.cobblestone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class WhiteCobblestone extends Block {
	
	public WhiteCobblestone(int par1, Material par2Material) {
		super(par1, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0f);
		this.setResistance(10.0f);
		this.setStepSound(soundStoneFootstep);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("dyedcobblestone:whitecobblestone");
	}

}
