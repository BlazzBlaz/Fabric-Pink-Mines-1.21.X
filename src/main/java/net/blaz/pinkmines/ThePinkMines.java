package net.blaz.pinkmines;

import net.blaz.pinkmines.block.ModBlocks;
import net.blaz.pinkmines.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class ThePinkMines implements ModInitializer {
	public static final String MOD_ID = "the-pink-mines";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}