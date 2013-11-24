package assets.dyedcobblestone.common.glass;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class PurpleGlass extends Block {
	
	public PurpleGlass(int par1, Material par2Material) {
		super(par1, Material.glass);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.3f);
		this.setStepSound(soundGlassFootstep);
	}
	
	public int quantityDropped(Random par1Random){
		return 0;
	}
	
	@SideOnly(Side.CLIENT)
	
	public int getRenderBlockPass(){
		return 1;
	}
	
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("dyedcobblestone:purpleglass");
	}

}
