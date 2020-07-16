package com.NetUserGet.VoidResoruces.init;

import java.util.ArrayList;
import java.util.List;

import com.NetUserGet.VoidResoruces.blocks.BlockBase;
import com.NetUserGet.VoidResoruces.blocks.Void_Block;
import com.NetUserGet.VoidResoruces.blocks.Void_Ore;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block VOID_BLOCK = new Void_Block("void_block", Material.IRON);
	public static final Block VOID_ORE = new Void_Ore("void_ore", Material.ROCK);
}
