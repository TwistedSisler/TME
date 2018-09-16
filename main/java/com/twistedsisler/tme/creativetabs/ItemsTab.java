package com.twistedsisler.tme.creativetabs;

import com.twistedsisler.tme.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ItemsTab extends CreativeTabs
{
	public ItemsTab()
	{
		super("items_tab");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.CHUNK_COPPER);
	}
}
