package net.astrubale.testmod.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.astrubale.testmod.TestMod;
import net.astrubale.testmod.util.IEntityDataSaver;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ThirstHudOverlay implements HudRenderCallback {
    private static final Identifier FILLED_THIRST = new Identifier(TestMod.MOD_ID,
            "textures/thirst/filled_thirst.png");
    private static final Identifier EMPTY_THIRST = new Identifier(TestMod.MOD_ID,
            "textures/thirst/empty_thirst.png");


    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int x = 0;
        int y = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width / 2;
            y = height;
        }

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, EMPTY_THIRST);
        for(int i = 0; i < 10; i++) {
            drawContext.drawTexture(EMPTY_THIRST,x - 94 + (i * 9),y - 54,0,0,12,12,
                    12,12);
        }

        RenderSystem.setShaderTexture(0, FILLED_THIRST);
        for(int i = 0; i < 10; i++) {
            if(((IEntityDataSaver) MinecraftClient.getInstance().player).getPersistentData().getInt("thirst") > i) {
                drawContext.drawTexture(FILLED_THIRST,x - 94 + (i * 9),y - 54,0,0,12,12,
                        12,12);
            } else {
                break;
            }
        }
    }
}