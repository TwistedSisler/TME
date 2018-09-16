package com.twistedsisler.tme.creativetabs;

import com.twistedsisler.tme.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BlocksTab extends CreativeTabs
{
	public BlocksTab()
	{
		super("blocks_tab");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.ORE_COPPER);
	}
}
