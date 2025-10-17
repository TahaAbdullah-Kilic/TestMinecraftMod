package net.lycoris.denememod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lycoris.denememod.DenemeMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ZENITH = registerItem("zenith",new Item(new Item.Settings()));
    public static final Item BLACK_QUARTZ = registerItem("black_quartz",new Item(new Item.Settings()));

    static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(DenemeMod.MOD_ID, name), item);
    }

    public static void registerModItem()
    {
        DenemeMod.LOGGER.info("Registering Mod Items for " + DenemeMod.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->
//        {
//            entries.add(ZENITH);
//        });
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->
//        {
//            entries.add(BLACK_QUARTZ);
//        });
    }
}
