package com.twistedsisler.tme.blocks;

import com.twistedsisler.tme.Main;
import com.twistedsisler.tme.init.ModBlocks;
import com.twistedsisler.tme.init.ModCreativeTabs;
import com.twistedsisler.tme.init.ModItems;
import com.twistedsisler.tme.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBasic extends Block implements IHasModel
{
	public BlockBasic(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModCreativeTabs.BLOCKS_TAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
