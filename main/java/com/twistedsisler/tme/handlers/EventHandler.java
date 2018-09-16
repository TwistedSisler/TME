package com.twistedsisler.tme.handlers;

import com.twistedsisler.tme.events.BlockDropEvents;
import com.twistedsisler.tme.events.TooltipEvents;

import net.minecraftforge.common.MinecraftForge;

public class EventHandler
{
	public void registerEvents()
	{
		MinecraftForge.EVENT_BUS.register(new BlockDropEvents());
		MinecraftForge.EVENT_BUS.register(new TooltipEvents());
	}
}