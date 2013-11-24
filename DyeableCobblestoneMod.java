package assets.dyedcobblestone.common;

import assets.dyedcobblestone.common.cobblestone.*;
import assets.dyedcobblestone.common.glass.*;
import assets.dyedcobblestone.common.planks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;

@Mod(modid = DyedCobblestone.modID, name = "Dyable Cobblestone", version = "2.1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DyedCobblestone {

	public static final String modID = "dyedCobblestone";
	
	//Block Declarations
	
	//Cobblestone
	public static Block blackCobblestone;
	public static Block brownCobblestone;
	public static Block cyanCobblestone;
	public static Block blueCobblestone;
	public static Block greenCobblestone;
	public static Block grayCobblestone;
	public static Block limeCobblestone;
	public static Block lightBlueCobblestone;
	public static Block lightGrayCobblestone;
	public static Block magentaCobblestone;
	public static Block orangeCobblestone;
	public static Block pinkCobblestone;
	public static Block purpleCobblestone;
	public static Block redCobblestone;
	public static Block whiteCobblestone;
	public static Block yellowCobblestone;
	
	//Glass
	public static Block blackGlass;
	public static Block brownGlass;
	public static Block blueGlass;
	public static Block cyanGlass;
	public static Block greenGlass;
	public static Block grayGlass;
	public static Block limeGlass;
	public static Block lightBlueGlass;
	public static Block lightGrayGlass;
	public static Block magentaGlass;
	public static Block orangeGlass;
	public static Block pinkGlass;
	public static Block purpleGlass;
	public static Block redGlass;
	public static Block whiteGlass;
	public static Block yellowGlass;
	
	//Planks
	public static Block blackOakPlanks;
	public static Block blueOakPlanks;
	public static Block brownOakPlanks;
	public static Block cyanOakPlanks;
	public static Block greenOakPlanks;
	public static Block grayOakPlanks;
	public static Block limeOakPlanks;
	public static Block lightBlueOakPlanks;
	public static Block lightGrayOakPlanks;
	public static Block magentaOakPlanks;
	public static Block orangeOakPlanks;
	public static Block pinkOakPlanks;
	public static Block purpleOakPlanks;
	public static Block redOakPlanks;
	public static Block whiteOakPlanks;
	public static Block yellowOakPlanks;
	
	@EventHandler
	public void load(FMLInitializationEvent event){
		
		//Block Constructors
		
		//Cobblestone
		blackCobblestone = new BlackCobblestone(800, Material.rock).setUnlocalizedName("blackCobblestone");
		brownCobblestone = new BrownCobblestone(801, Material.rock).setUnlocalizedName("brownCobblestone");
		cyanCobblestone = new CyanCobblestone(802, Material.rock).setUnlocalizedName("cyanCobblestone");
		blueCobblestone = new DarkBlueCobblestone(803, Material.rock).setUnlocalizedName("darkBlueCobblestone");
		greenCobblestone = new GreenCobblestone(804, Material.rock).setUnlocalizedName("greenCobblestone");
		grayCobblestone = new GrayCobblestone(805, Material.rock).setUnlocalizedName("grayCobblestone");
		limeCobblestone = new LimeCobblestone(806, Material.rock).setUnlocalizedName("limeCobblestone");
		lightBlueCobblestone = new LightBlueCobblestone(807, Material.rock).setUnlocalizedName("lightBlueCobblestone");
		lightGrayCobblestone = new LightGrayCobblestone(808, Material.rock).setUnlocalizedName("lightGrayCobblestone");
		magentaCobblestone = new MagentaCobblestone(809, Material.rock).setUnlocalizedName("magentaCobblestone");
		orangeCobblestone = new OrangeCobblestone(810, Material.rock).setUnlocalizedName("orangeCobblestone");
		pinkCobblestone = new PinkCobblestone(811, Material.rock).setUnlocalizedName("pinkCobblestone");
		purpleCobblestone = new PurpleCobblestone(812, Material.rock).setUnlocalizedName("purpleCobblestone");
		redCobblestone = new RedCobblestone(813, Material.rock).setUnlocalizedName("redCobblestone");
		whiteCobblestone = new WhiteCobblestone(814, Material.rock).setUnlocalizedName("whiteCobblestone");
		yellowCobblestone = new YellowCobblestone(815, Material.rock).setUnlocalizedName("yellowCobblestone");
		
		//Glass
		blackGlass = new BlackGlass(816, Material.glass).setUnlocalizedName("blackGlass");
		brownGlass = new BrownGlass(817, Material.glass).setUnlocalizedName("brownGlass");
		blueGlass = new BlueGlass(818, Material.glass).setUnlocalizedName("blueGlass");
		cyanGlass = new CyanGlass(819, Material.glass).setUnlocalizedName("cyanGlass");
		greenGlass = new GreenGlass(820, Material.glass).setUnlocalizedName("greenGlass");
		grayGlass = new GrayGlass(821, Material.glass).setUnlocalizedName("grayGlass");
		limeGlass = new LimeGlass(822, Material.glass).setUnlocalizedName("limeGlass");
		lightBlueGlass = new LightBlueGlass(823, Material.glass).setUnlocalizedName("lightBlueGlass");
		lightGrayGlass = new LightGrayGlass(824, Material.glass).setUnlocalizedName("lightGraGlass");
		magentaGlass = new MagentaGlass(825, Material.glass).setUnlocalizedName("magentaGlass");
		orangeGlass = new OrangeGlass(826, Material.glass).setUnlocalizedName("orangeGlass");
		pinkGlass = new PinkGlass(827, Material.glass).setUnlocalizedName("pinkGlass");
		purpleGlass = new PurpleGlass(828, Material.glass).setUnlocalizedName("purpleGlass");
		redGlass = new RedGlass(829, Material.glass).setUnlocalizedName("redGlass");
		whiteGlass = new WhiteGlass(830, Material.glass).setUnlocalizedName("whiteGlass");
		yellowGlass = new YellowGlass(831, Material.glass).setUnlocalizedName("yellowGlass");
		
		//Planks
		blackOakPlanks = new BlackOakPlanks(832, Material.wood).setUnlocalizedName("blackOakPlanks");
		blueOakPlanks = new BlueOakPlanks(833, Material.wood).setUnlocalizedName("blueOakPlanks");
		brownOakPlanks = new BlueOakPlanks(834, Material.wood).setUnlocalizedName("brownOakPlanks");
		cyanOakPlanks = new CyanOakPlanks(835, Material.wood).setUnlocalizedName("cyanOakPlanks");
		greenOakPlanks = new GreenOakPlanks(836, Material.glass).setUnlocalizedName("greenOakPlanks");
		grayOakPlanks = new GrayOakPlanks(837, Material.wood).setUnlocalizedName("grayOakPlanks");
		limeOakPlanks = new LimeOakPlanks(838, Material.wood).setUnlocalizedName("limeOakPlanks");
		lightBlueOakPlanks = new LightBlueOakPlanks(839, Material.wood).setUnlocalizedName("lightBlueOakPlanks");
		lightGrayOakPlanks = new LightGrayOakPlanks(840, Material.wood).setUnlocalizedName("lightGraOakPlanks");
		magentaOakPlanks = new MagentaOakPlanks(841, Material.wood).setUnlocalizedName("magentaOakPlanks");
		orangeOakPlanks = new OrangeOakPlanks(842, Material.wood).setUnlocalizedName("orangeOakPlanks");
		pinkOakPlanks = new PinkOakPlanks(843, Material.wood).setUnlocalizedName("pinkOakPlanks");
		purpleOakPlanks = new PurpleOakPlanks(844, Material.wood).setUnlocalizedName("purpleOakPlanks");
		redOakPlanks = new RedOakPlanks(845, Material.wood).setUnlocalizedName("redOakPlanks");
		whiteOakPlanks = new WhiteOakPlanks(846, Material.wood).setUnlocalizedName("whiteOakPlanks");
		yellowOakPlanks = new YellowOakPlanks(847, Material.wood).setUnlocalizedName("yellowOakPlanks");
		
		//Block Declarations
		
		//Cobblestone
		registerBlock(blackCobblestone, "Black Cobblestone", blackCobblestone.getUnlocalizedName());
		registerBlock(brownCobblestone, "Brown Cobblestone", brownCobblestone.getUnlocalizedName());
		registerBlock(cyanCobblestone, "Cyan Cobblestone", cyanCobblestone.getUnlocalizedName());
		registerBlock(blueCobblestone, "Blue Cobblestone", blueCobblestone.getUnlocalizedName());
		registerBlock(greenCobblestone, "Green Cobblestone", greenCobblestone.getUnlocalizedName());
		registerBlock(grayCobblestone, "Gray Cobblestone", grayCobblestone.getUnlocalizedName());
		registerBlock(limeCobblestone, "Lime Cobblestone", limeCobblestone.getUnlocalizedName());
		registerBlock(lightBlueCobblestone, "Light Blue Cobblestone", lightBlueCobblestone.getUnlocalizedName());
		registerBlock(lightGrayCobblestone, "Light Gray Cobblestone", lightGrayCobblestone.getUnlocalizedName());
		registerBlock(magentaCobblestone, "Magenta Cobblestone", magentaCobblestone.getUnlocalizedName());
		registerBlock(orangeCobblestone, "Orange Cobblestone", orangeCobblestone.getUnlocalizedName());
		registerBlock(pinkCobblestone, "Pink Cobblestone", pinkCobblestone.getUnlocalizedName());
		registerBlock(purpleCobblestone, "Purple Cobblestone", purpleCobblestone.getUnlocalizedName());
		registerBlock(redCobblestone, "Red Cobblestone", redCobblestone.getUnlocalizedName());
		registerBlock(whiteCobblestone, "White Cobblestone", whiteCobblestone.getUnlocalizedName());
		registerBlock(yellowCobblestone, "Yellow Cobblestone", yellowCobblestone.getUnlocalizedName());
		
		//Glass
		registerBlock(blackGlass, "Black Glass", blackGlass.getUnlocalizedName());
		registerBlock(brownGlass, "Brown Glass", brownGlass.getUnlocalizedName());
		registerBlock(cyanGlass, "Cyan Glass", cyanGlass.getUnlocalizedName());
		registerBlock(blueGlass, "Blue Glass", blueGlass.getUnlocalizedName());
		registerBlock(greenGlass, "Green Glass", greenGlass.getUnlocalizedName());
		registerBlock(grayGlass, "Gray Glass", grayGlass.getUnlocalizedName());
		registerBlock(limeGlass, "Lime Glass", limeGlass.getUnlocalizedName());
		registerBlock(lightBlueGlass, "Light Blue Glass", lightBlueGlass.getUnlocalizedName());
		registerBlock(lightGrayGlass, "Light Gray Glass", lightGrayGlass.getUnlocalizedName());
		registerBlock(magentaGlass, "Magenta Glass", magentaGlass.getUnlocalizedName());
		registerBlock(orangeGlass, "Orange Glass", orangeGlass.getUnlocalizedName());
		registerBlock(pinkGlass, "Pink Glass", pinkGlass.getUnlocalizedName());
		registerBlock(purpleGlass, "Purple Glass", purpleGlass.getUnlocalizedName());
		registerBlock(redGlass, "Red Glass", redGlass.getUnlocalizedName());
		registerBlock(whiteGlass, "White Glass", whiteGlass.getUnlocalizedName());
		registerBlock(yellowGlass, "Yellow Glass", yellowGlass.getUnlocalizedName());
		
		//Planks
		registerBlock(blackOakPlanks, "Black Oak Planks", blackOakPlanks.getUnlocalizedName());
		registerBlock(brownOakPlanks, "Brown Oak Planks", brownOakPlanks.getUnlocalizedName());
		registerBlock(cyanOakPlanks, "Cyan Oak Planks", cyanOakPlanks.getUnlocalizedName());
		registerBlock(blueOakPlanks, "Blue Oak Planks", blueOakPlanks.getUnlocalizedName());
		registerBlock(greenOakPlanks, "Green Oak Planks", greenOakPlanks.getUnlocalizedName());
		registerBlock(grayOakPlanks, "Gray Oak Planks", grayOakPlanks.getUnlocalizedName());
		registerBlock(limeOakPlanks, "Lime Oak Planks", limeOakPlanks.getUnlocalizedName());
		registerBlock(lightBlueOakPlanks, "Light Blue Oak Planks", lightBlueOakPlanks.getUnlocalizedName());
		registerBlock(lightGrayOakPlanks, "Light Gray Oak Planks", lightGrayOakPlanks.getUnlocalizedName());
		registerBlock(magentaOakPlanks, "Magenta Oak Planks", magentaOakPlanks.getUnlocalizedName());
		registerBlock(orangeOakPlanks, "Orange Oak Planks", orangeOakPlanks.getUnlocalizedName());
		registerBlock(pinkOakPlanks, "Pink Oak Planks", pinkOakPlanks.getUnlocalizedName());
		registerBlock(purpleOakPlanks, "Purple Oak Planks", purpleOakPlanks.getUnlocalizedName());
		registerBlock(redOakPlanks, "Red Oak Planks", redOakPlanks.getUnlocalizedName());
		registerBlock(whiteOakPlanks, "White Oak Planks", whiteOakPlanks.getUnlocalizedName());
		registerBlock(yellowOakPlanks, "Yellow Oak Planks", yellowOakPlanks.getUnlocalizedName());
		
		//Crafting Recipes
		
		//Cobblestone
		GameRegistry.addShapelessRecipe(new ItemStack(blackCobblestone, 1), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(brownCobblestone, 1), new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(cyanCobblestone, 1), new ItemStack(Item.dyePowder, 1, 6), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(blueCobblestone, 1), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(greenCobblestone, 1), new ItemStack(Item.dyePowder, 1, 2), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(grayCobblestone, 1), new ItemStack(Item.dyePowder, 1, 8), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(limeCobblestone, 1), new ItemStack(Item.dyePowder, 1, 10), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(lightBlueCobblestone, 1), new ItemStack(Item.dyePowder, 1, 12), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(lightGrayCobblestone, 1), new ItemStack(Item.dyePowder, 1, 7), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(magentaCobblestone, 1), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(orangeCobblestone, 1), new ItemStack(Item.dyePowder, 1, 14), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(pinkCobblestone, 1), new ItemStack(Item.dyePowder, 1, 9), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(purpleCobblestone, 1), new ItemStack(Item.dyePowder, 1, 5), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(redCobblestone, 1), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteCobblestone, 1), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Block.cobblestone));
		GameRegistry.addShapelessRecipe(new ItemStack(yellowCobblestone, 1), new ItemStack(Item.dyePowder, 1, 11), new ItemStack(Block.cobblestone));
		
		//Glass
		GameRegistry.addShapelessRecipe(new ItemStack(blackGlass, 1), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(brownGlass, 1), new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(cyanGlass, 1), new ItemStack(Item.dyePowder, 1, 6), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(blueGlass, 1), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(greenGlass, 1), new ItemStack(Item.dyePowder, 1, 2), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(grayGlass, 1), new ItemStack(Item.dyePowder, 1, 8), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(limeGlass, 1), new ItemStack(Item.dyePowder, 1, 10), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(lightBlueGlass, 1), new ItemStack(Item.dyePowder, 1, 12), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(lightGrayGlass, 1), new ItemStack(Item.dyePowder, 1, 7), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(magentaGlass, 1), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(orangeGlass, 1), new ItemStack(Item.dyePowder, 1, 14), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(pinkGlass, 1), new ItemStack(Item.dyePowder, 1, 9), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(purpleGlass, 1), new ItemStack(Item.dyePowder, 1, 5), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(redGlass, 1), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteGlass, 1), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Block.glass));
		GameRegistry.addShapelessRecipe(new ItemStack(yellowGlass, 1), new ItemStack(Item.dyePowder, 1, 11), new ItemStack(Block.glass));
		
		//Planks
		GameRegistry.addShapelessRecipe(new ItemStack(blackOakPlanks, 8), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Block.planks, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(brownOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 3), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(cyanOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 6), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(blueOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(greenOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 2), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(grayOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 8), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(limeOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 10), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(lightBlueOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 12), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(lightGrayOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 7), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(magentaOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 13), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(orangeOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 14), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(pinkOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 9), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(purpleOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 5), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(redOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Block.planks));
		GameRegistry.addShapelessRecipe(new ItemStack(yellowOakPlanks, 1), new ItemStack(Item.dyePowder, 1, 11), new ItemStack(Block.planks));
	}
	
	public static void registerBlock(Block block, String name, String unlocalizedName){
		GameRegistry.registerBlock(block, DyedCobblestone.modID + unlocalizedName);
		LanguageRegistry.addName(block, name);
	}
	
}