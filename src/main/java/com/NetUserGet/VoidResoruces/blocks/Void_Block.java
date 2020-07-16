package com.NetUserGet.VoidResoruces.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Void_Block extends BlockBase 
{

	public Void_Block(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(1200.0f);
		setHarvestLevel("Pickaxe", 3);
		setLightLevel(0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}

}
