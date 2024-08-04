package net.bastionhub.foodstuffs;

import net.bastionhub.foodstuffs.block.ModBlocks;
import net.bastionhub.foodstuffs.item.ModItemGroups;
import net.bastionhub.foodstuffs.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foodstuffs implements ModInitializer {
	public static final String MOD_ID = "foodstuffs";
	public static final Logger LOGGER = LoggerFactory.getLogger("foodstuffs");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroups.registerItemGroups();
	}
}