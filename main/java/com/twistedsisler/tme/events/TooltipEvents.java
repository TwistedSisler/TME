package com.twistedsisler.tme.events;

import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TooltipEvents
{
	@SubscribeEvent
	public void addTooltip(ItemTooltipEvent event)
	{
		
		if (event.getItemStack().getItem() == Items.DIAMOND)
		{
			event.getToolTip().add("Flawless");
		}
		
	}
}
