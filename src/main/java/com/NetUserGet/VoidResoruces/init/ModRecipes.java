package com.NetUserGet.VoidResoruces.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	
	
	public static void init() 
	{
		GameRegistry.addSmelting(ModItems.VOID_DUST, new ItemStack(ModItems.VOID_INGOT), 1.5f);
	}
}
