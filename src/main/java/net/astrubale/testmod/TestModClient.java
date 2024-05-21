package net.astrubale.testmod;

import net.astrubale.testmod.client.ThirstHudOverlay;
import net.astrubale.testmod.event.KeyInputHandler;
import net.astrubale.testmod.networking.ModMessages;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        KeyInputHandler.register();
        ModMessages.registerS2CPackets();
        HudRenderCallback.EVENT.register(new ThirstHudOverlay());
    }
}
