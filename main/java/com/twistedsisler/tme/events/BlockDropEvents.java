package com.twistedsisler.tme.events;

import java.util.Random;

import com.twistedsisler.tme.init.ModBlocks;
import com.twistedsisler.tme.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockDropEvents
{
	private final Random random = new Random();
	
	@SubscribeEvent
	public void onBlockHarvest(BlockEvent.HarvestDropsEvent event)
	{
		/*
	    if (event.getState().getBlock() == ModBlocks.oreAluminum && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkAluminum));
	    }
    
	    if (event.getState().getBlock() == ModBlocks.oreTin && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkTin));
	    }
	    */
	    
	    if (event.getState().getBlock() == ModBlocks.ORE_COPPER && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.CHUNK_COPPER));
	    }
	    
	    /*
	    if (event.getState().getBlock() == Blocks.IRON_ORE && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkIron));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreSilver && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkSilver));
	    }
	    
	    if (event.getState().getBlock() == Blocks.GOLD_ORE && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkGold));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreDarkIron && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkDarkIron));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreMolten && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkMolten));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreAncientSlime && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkAncientSlime));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreDemonite && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkDemonite));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreMysterium && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkMysterium));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreMythril && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkMythril));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreSolarium && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkSolarium));
	    }
	    
	    if (event.getState().getBlock() == ModBlocks.oreLunarium && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkLunarium));
	    }
	    
	    if (event.getState().getBlock() == Blocks.IRON_ORE && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkIron));
	    }
	    
	    if (event.getState().getBlock() == Blocks.REDSTONE_ORE && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	      event.getDrops().clear();
	      event.getDrops().add(new ItemStack(ModItems.chunkRedstone));
	    }
	    */
	    
	    /*
	    if (event.getState().getBlock() == Blocks.DIAMOND_ORE && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	    	   event.getDrops().clear();
	    	   event.getDrops().add(new ItemStack(ModItems.shardsDiamond));
	    	   if (this.random.nextInt(3) == 0)
	           {
	               event.getDrops().add(new ItemStack(ModItems.shardsDiamond));
	           }
	           if (this.random.nextInt(3) == 0)
	           {
	               event.getDrops().add(new ItemStack(ModItems.shardsDiamond));
	           }
	           if (this.random.nextInt(7) == 0)
	           {
	               event.getDrops().add(new ItemStack(ModItems.flawedDiamond));
	           }
	      	   if (this.random.nextInt(20) == 0)
	           {
	           	   event.getDrops().add(new ItemStack(Items.DIAMOND));
	      	   }
	    }
	    */
	    
	    /*
	    if (event.getState().getBlock() == ModBlocks.oreDiamondPink && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	    	  event.getDrops().clear();
		      event.getDrops().add(new ItemStack(ModItems.shardsDiamondPink));
		      if (this.random.nextInt(3) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.shardsDiamondPink));
		      }
		      if (this.random.nextInt(3) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.shardsDiamondPink));
		      }
		      if (this.random.nextInt(7) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.flawedDiamondPink));
		      }
		      if (this.random.nextInt(20) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.flawlessDiamondPink));
		      }
	    }
	    */
	    
	    /*
	    if (event.getState().getBlock() == ModBlocks.oreNetherite && event.getHarvester().getName().contains("gameboy91") != true)
	    {
	    	  event.getDrops().clear();
		      event.getDrops().add(new ItemStack(ModItems.shardsNetherite));
		      if (this.random.nextInt(3) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.shardsNetherite));
		      }
		      if (this.random.nextInt(3) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.shardsNetherite));
		      }
		      if (this.random.nextInt(7) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.flawedNetherite));
		      }
		      if (this.random.nextInt(20) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.flawlessNetherite));
		      }
	    }
	    */

	    /*
	    if (event.getState().getBlock() == ModBlocks.oreJade)
	    {
	    	  event.getDrops().clear();
		      event.getDrops().add(new ItemStack(ModItems.chunkJade, 4));
		      if (this.random.nextInt(4) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.chunkJade));
		      }
		      if (this.random.nextInt(4) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.chunkJade));
		      }
		      if (this.random.nextInt(5) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.chunkJade));
		      }
		      if (this.random.nextInt(5) == 0)
		      {
		          event.getDrops().add(new ItemStack(ModItems.chunkJade));
		      }
	    }
	    */
	    
	    /*
	    if (event.getState().getBlock() == ModBlocks.blockClayGrey)
	    {
	    	  event.getDrops().clear();
	    	  event.getDrops().add(new ItemStack(ModItems.clayGrey, 4));
	    }
	    */
	    
	    /////////////////////////
	    //VANILLA BLOCKS
	    
	    if (event.getState().getBlock() == Blocks.TALLGRASS)
	    {
	    	  event.getDrops().clear();
	    }
	    
	}
}
