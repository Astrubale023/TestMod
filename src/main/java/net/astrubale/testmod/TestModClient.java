package net.astrubale.testmod;

import net.astrubale.testmod.event.KeyInputHandler;
import net.astrubale.testmod.networking.ModMessages;
import net.fabricmc.api.ClientModInitializer;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        KeyInputHandler.register();
        ModMessages.registerS2CPackets();
    }
}
