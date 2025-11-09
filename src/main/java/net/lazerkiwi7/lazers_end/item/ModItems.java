package net.lazerkiwi7.lazers_end.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lazerkiwi7.lazers_end.LazersEnd;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ENDERIUM_INGOT = registerItem("enderium_ingot", new Item(new Item.Settings() .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LazersEnd.MOD_ID,"enderium_ingot")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LazersEnd.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LazersEnd.LOGGER.info("Registering Mod Items for" + LazersEnd.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(ENDERIUM_INGOT);
        });
    }
}
