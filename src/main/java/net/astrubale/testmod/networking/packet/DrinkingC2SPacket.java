package net.astrubale.testmod.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

public class DrinkingC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworking handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        // Everythiing here happens ONLY on the server!
    }
}
