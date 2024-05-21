package net.astrubale.testmod.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.text.Texts;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_TEST = "key.category.testmod.test";
    public static final String KEY_DRINK_WATER = "key.testmod.drink_water";

    public static KeyBinding drinkingKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(drinkingKey.wasPressed()) {
                // This happens when our custom key is pressed
                client.player.sendMessage(Text.literal("Hello, I pressed a Key!"));
            }
        });
    }

    public static void register() {
        drinkingKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_DRINK_WATER,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                KEY_CATEGORY_TEST
        ));

        registerKeyInputs();
    }

}
