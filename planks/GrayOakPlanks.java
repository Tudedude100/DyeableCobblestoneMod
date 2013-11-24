package assets.dyedcobblestone.common.planks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class GrayOakPlanks extends Block {
	
	public GrayOakPlanks(int par1, Material par2Material) {
		super(par1, Material.wood);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0f);
		this.setResistance(5.0f);
		this.setStepSound(soundWoodFootstep);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("dyedcobblestone:planks_oak_gray");
	}

}
