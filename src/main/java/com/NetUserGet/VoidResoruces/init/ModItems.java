package com.NetUserGet.VoidResoruces.init;

import java.util.ArrayList;
import java.util.List;

import com.NetUserGet.VoidResoruces.Items.ItemBase;
import com.NetUserGet.VoidResoruces.Items.Tools.ToolPickaxe;
import com.NetUserGet.VoidResoruces.Items.Tools.ToolSword;
import com.NetUserGet.VoidResoruces.Items.armor.ArmorBase;
import com.NetUserGet.VoidResoruces.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	/* DO NOT TOUCH!
	 *  MY CODE! */
	
	// Materials 
	public static final ToolMaterial MATERIAL_VOID_BLOCK = EnumHelper.addToolMaterial("material_void", 3, 16000, 24.0F, 16.5F, 22);
	public static final ArmorMaterial ARMOR_MATERIAL_VOID_INGOT = EnumHelper.addArmorMaterial("armor_material_void", Reference.MOD_ID + ":void_ingot", 15, 
			new int[] {8, 8, 16, 8,}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item VOID_INGOT = new ItemBase("void_ingot");
	public static final Item VOID_FRAGMENTS = new ItemBase("void_fragments");
	public static final Item VOID_DUST = new ItemBase("void_dust");
	//Skeleton for a new Item!: public static final Item ITEM_ID = new ItemBase("item_id"); Devs only
	
	//Tools
	public static final ItemSword VOID_SWORD = new ToolSword("void_sword", MATERIAL_VOID_BLOCK);
	public static final ItemPickaxe VOID_PICKAXE = new ToolPickaxe("void_pickaxe", MATERIAL_VOID_BLOCK);
	
	//Armor
	public static final Item VOID_HELMET = new ArmorBase("void_helmet", ARMOR_MATERIAL_VOID_INGOT, 1, EntityEquipmentSlot.HEAD);
	public static final Item VOID_CHESTPLATE = new ArmorBase("void_chestplate", ARMOR_MATERIAL_VOID_INGOT, 1, EntityEquipmentSlot.CHEST);
	public static final Item VOID_LEGGINGS = new ArmorBase("void_leggings", ARMOR_MATERIAL_VOID_INGOT, 2, EntityEquipmentSlot.LEGS);
	public static final Item VOID_BOOTS = new ArmorBase("void_boots", ARMOR_MATERIAL_VOID_INGOT, 1, EntityEquipmentSlot.FEET);
}
	
