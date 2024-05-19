package net.astrubale.testmod.datagen;

import net.astrubale.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.CHESTNUT_LOG).log(ModBlocks.CHESTNUT_LOG).wood(ModBlocks.CHESTNUT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CHESTNUT_LOG).log(ModBlocks.STRIPPED_CHESTNUT_LOG).wood(ModBlocks.STRIPPED_CHESTNUT_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHESTNUT_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHESTNUT_LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.CHESTNUT_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}