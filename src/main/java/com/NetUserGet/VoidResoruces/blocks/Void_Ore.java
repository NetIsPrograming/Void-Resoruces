package com.NetUserGet.VoidResoruces.blocks;

import java.util.Random;

import com.NetUserGet.VoidResoruces.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class Void_Ore extends BlockBase {
	
	public Void_Ore(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.VOID_FRAGMENTS;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 5;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	
}
