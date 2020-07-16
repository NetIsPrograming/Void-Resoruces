package com.NetUserGet.VoidResoruces.Items.Tools;

import com.NetUserGet.VoidResoruces.Main;
import com.NetUserGet.VoidResoruces.init.ModItems;
import com.NetUserGet.VoidResoruces.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{

	public ToolSword (String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName (name);
		setRegistryName (name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this); 
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "Inventory");
	}

}
