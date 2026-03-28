package net.giaristondo.mallorcamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.giaristondo.mallorcamod.MallorcaMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item SOBRASSADA = registerItem("sobrassada", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MallorcaMod.MOD_ID,"sobrassada")))));
    public static final Item PEBRE_BORD = registerItem("pebre_bord", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MallorcaMod.MOD_ID,"pebre_bord")))));
    public static final Item PEBRE_BO = registerItem("pebre_bo", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MallorcaMod.MOD_ID,"pebre_bo")))));
    public static final Item SAL = registerItem("sal", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MallorcaMod.MOD_ID,"sal")))));
    public static final Item BUDELL = registerItem("budell", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MallorcaMod.MOD_ID,"budell")))));

    private static Item registerItem(String name,  Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(MallorcaMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        MallorcaMod.LOGGER.info("Registrant items del mod " + MallorcaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SOBRASSADA);
            entries.add(PEBRE_BORD);
            entries.add(PEBRE_BO);
            entries.add(SAL);
            entries.add(BUDELL);
        });
    }
}
