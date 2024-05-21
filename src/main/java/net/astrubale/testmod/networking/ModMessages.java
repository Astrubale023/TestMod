package net.astrubale.testmod.networking;

import net.astrubale.testmod.TestMod;
import net.astrubale.testmod.networking.packet.DrinkingC2SPacket;
import net.astrubale.testmod.networking.packet.ThirstSyncDataS2CPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier DRINKING_ID = new Identifier(TestMod.MOD_ID, "drinking");
    public static final Identifier THIRST_SYNC_ID = new Identifier(TestMod.MOD_ID, "thirst_sync");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(DRINKING_ID, DrinkingC2SPacket::receive);
    }

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(THIRST_SYNC_ID, ThirstSyncDataS2CPacket::receive);
    }
}
