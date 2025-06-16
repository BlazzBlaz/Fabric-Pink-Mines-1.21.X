package net.blaz.pinkmines.item;

import net.blaz.pinkmines.ThePinkMines;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item KUNZITE = registerItem("kunzite", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ThePinkMines.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ThePinkMines.LOGGER.info("Registering Mod Items for" + ThePinkMines.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(KUNZITE);
        });
    }
}
