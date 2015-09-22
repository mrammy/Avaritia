package fox.spiteful.avaritia.compat.torcherino;


import fox.spiteful.avaritia.Config;
import fox.spiteful.avaritia.compat.Compat;
import fox.spiteful.avaritia.helpers.RecipeHelper;
import fox.spiteful.avaritia.blocks.LudicrousBlocks;
import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import fox.spiteful.avaritia.items.LudicrousItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Torcherino {
	public static void lightItUp() throws Compat.ItemNotFoundException {
		Item torcherinoItem = Compat.getItem("Torcherino", "tile.torcherino");
		Item invTorcherinoItem = Compat.getItem("Torcherino", "tile.inverse_torcherino");
		Item mcTorch = Compat.getItem("minecraft", "torch");
		Item redstoneTorch = Compat.getItem("minecraft", "redstone_torch");
		ItemStack torcherino = new ItemStack(torcherinoItem, 1);
		ItemStack invTorcherino = new ItemStack(invTorcherinoItem, 1); 
		RecipeHelper.removeAnyRecipe(torcherino);
		RecipeHelper.removeAnyRecipe(invTorcherino);
		ExtremeCraftingManager.getInstance().addRecipe(torcherino, new Object[]{
			"   III   ",
			"  IIIII  ",
			"  IIXII  ",
			"  IIIII  ",
			"   III   ",
			"   NNN   ",
			"   NNN   ",
			"   NNN   ",
			"   NNN   ",
			'I', new ItemStack(mcTorch, 1, 0),
			'X', new ItemStack(LudicrousItems.resource, 1, 5),
			'N', new ItemStack(LudicrousItems.resource, 1, 4),
		});
		ExtremeCraftingManager.getInstance().addRecipe(invTorcherino, new Object[]{
			"   III   ",
			"  IIIII  ",
			"  IIXII  ",
			"  IIIII  ",
			"   III   ",
			"   NNN   ",
			"   NNN   ",
			"   NNN   ",
			"   NNN   ",
			'I', new ItemStack(redstoneTorch, 1, 0),
			'X', new ItemStack(LudicrousItems.resource, 1, 5),
			'N', new ItemStack(LudicrousItems.resource, 1, 4),
		});
	}
}