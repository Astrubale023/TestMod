package net.astrubale.testmod.world.biome;

import net.astrubale.testmod.TestMod;
import net.minecraft.util.Identifier;
import terrablender.api.Region;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {

    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(TestMod.MOD_ID, "overworld"), 4));
    }
}
