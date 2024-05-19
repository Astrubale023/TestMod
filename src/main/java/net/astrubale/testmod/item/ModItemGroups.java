package net.astrubale.testmod.item;

import net.astrubale.testmod.TestMod;
import net.astrubale.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModBlocks.CHESTNUT_WOOD.asItem())).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.CHESTNUT_LOG);
                        entries.add(ModBlocks.CHESTNUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);
                        entries.add(ModBlocks.CHESTNUT_PLANKS);
                        entries.add(ModBlocks.CHESTNUT_LEAVES);


                    }).build());


    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registering Item Groups for " + TestMod.MOD_ID);
    }
}