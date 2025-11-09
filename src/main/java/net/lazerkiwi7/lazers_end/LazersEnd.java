package net.lazerkiwi7.lazers_end;

import net.fabricmc.api.ModInitializer;

import net.lazerkiwi7.lazers_end.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LazersEnd implements ModInitializer {
	public static final String MOD_ID = "lazers_end";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}