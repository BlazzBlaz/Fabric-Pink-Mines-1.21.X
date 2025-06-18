package net.blaz.pinkmines.item;

import net.blaz.pinkmines.ThePinkMines;
import net.blaz.pinkmines.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_MINES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ThePinkMines.MOD_ID, "pink_mines_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.KUNZITE))
                    .displayName(Text.translatable("itemgroup.thepinkmines.pink_mines_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.KUNZITE);
                    }).build());

    public static final ItemGroup PINK_MINES_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ThePinkMines.MOD_ID, "pink_mines_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.KUNZITE_ORE))
                    .displayName(Text.translatable("itemgroup.thepinkmines.pink_mines_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.KUNZITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_KUNZITE_ORE);
                        entries.add(ModBlocks.KUNZITE_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        ThePinkMines.LOGGER.info("Registering Item Groups for " + ThePinkMines.MOD_ID);
    }
}
