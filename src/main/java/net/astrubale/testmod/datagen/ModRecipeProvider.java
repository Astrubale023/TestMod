package net.astrubale.testmod.datagen;

import net.astrubale.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHESTNUT_PLANKS.asItem(), 4)
                .pattern("L")
                .input('L', ModBlocks.CHESTNUT_LOG)
                .criterion(hasItem(ModBlocks.CHESTNUT_LOG.asItem()), conditionsFromItem(ModBlocks.CHESTNUT_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.CHESTNUT_PLANKS.asItem())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHESTNUT_PLANKS.asItem(), 4)
                .pattern("L")
                .input('L', ModBlocks.STRIPPED_CHESTNUT_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem()), conditionsFromItem(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())));
    }
}