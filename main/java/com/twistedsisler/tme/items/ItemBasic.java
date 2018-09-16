package com.twistedsisler.tme.items;

import com.twistedsisler.tme.Main;
import com.twistedsisler.tme.init.ModCreativeTabs;
import com.twistedsisler.tme.init.ModItems;
import com.twistedsisler.tme.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBasic extends Item implements IHasModel
{

	public ItemBasic(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModCreativeTabs.ITEMS_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
