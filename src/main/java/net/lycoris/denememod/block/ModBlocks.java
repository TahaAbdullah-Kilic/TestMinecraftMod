package net.lycoris.denememod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lycoris.denememod.DenemeMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLACK_QUARTZ_BLOCK = registerBlock("black_quartz_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    static Block registerBlock(String name,Block block)
    {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(DenemeMod.MOD_ID,name),block);
    }
    static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(DenemeMod.MOD_ID, name),new BlockItem(block,new Item.Settings()));
    }

    public static void registerModBlock()
    {
        DenemeMod.LOGGER.info("Registering Mod Blocks for " + DenemeMod.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries ->
//        {
//            entries.add(BLACK_QUARTZ_BLOCK);
//        });
    }
}
