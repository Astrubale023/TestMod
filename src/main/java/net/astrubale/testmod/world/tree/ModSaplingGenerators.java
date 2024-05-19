package net.astrubale.testmod.world.tree;

import net.astrubale.testmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class ModSaplingGenerators { //1.20.4 changed from 1.20.2
    public static final SaplingGenerator CHESTNUT =
            new SaplingGenerator("chestnut", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.CHESTNUT_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}