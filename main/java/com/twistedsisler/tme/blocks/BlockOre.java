package com.twistedsisler.tme.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOre extends BlockBasic
{

	public BlockOre(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(5.0F);
		
	}

}
