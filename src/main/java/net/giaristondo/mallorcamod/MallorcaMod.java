package net.giaristondo.mallorcamod;

import net.fabricmc.api.ModInitializer;

import net.giaristondo.mallorcamod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallorcaMod implements ModInitializer {
	public static final String MOD_ID = "mallorca-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

        LOGGER.info("Mallorca Mod inicialitzat correctament!");
	}
}