package net.astrubale.testmod;

import net.astrubale.testmod.networking.ModMessages;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModMessages.registerC2SPackets();

		LOGGER.info("Hello Fabric world!");
	}
}