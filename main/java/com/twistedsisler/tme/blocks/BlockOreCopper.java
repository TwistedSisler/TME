package com.twistedsisler.tme.blocks;

import java.util.Random;

import com.twistedsisler.tme.init.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOreCopper extends BlockOre
{

	public BlockOreCopper(String name, Material material)
	{
		super(name, material);
		
		setHarvestLevel("pickaxe", 1);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
       return ModItems.CHUNK_COPPER;
    }
	
	@Override
	public int quantityDropped(Random rand)
	{
		int min = 1;
		int max = 1;
		
		return rand.nextInt(max) + min;
	}

}
