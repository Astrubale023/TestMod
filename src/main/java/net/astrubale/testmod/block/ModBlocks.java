package net.astrubale.testmod.block;

import net.astrubale.testmod.TestMod;
import net.astrubale.testmod.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ModBlocks {

    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));

    public static final Block CHESTNUT_SAPLING = registerBlock("chestnut_sapling",
            new SaplingBlock(ModSaplingGenerators.CHESTNUT, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering ModBlocks for " + TestMod.MOD_ID);
    }
}
