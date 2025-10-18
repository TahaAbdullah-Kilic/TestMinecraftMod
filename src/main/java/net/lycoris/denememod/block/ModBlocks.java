package net.lycoris.denememod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lycoris.denememod.DenemeMod;
import net.lycoris.denememod.block.custom.MagicBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block BLACK_QUARTZ_BLOCK = registerBlock("black_quartz_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block BLACK_QUARTZ_ORE = registerBlock("black_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5), AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block BLACK_QUARTZ_DEEPSLATE_ORE = registerBlock("black_quartz_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5), AbstractBlock.Settings.create().strength(5f).requiresTool()));

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLACK_QUARTZ_STAIRS = registerBlock("black_quartz_stairs",
            new StairsBlock(ModBlocks.BLACK_QUARTZ_BLOCK.getDefaultState(),AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block BLACK_QUARTZ_SLAB = registerBlock("black_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block BLACK_QUARTZ_DOOR = registerBlock("black_quartz_door",
            new DoorBlock(BlockSetType.IRON,AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block BLACK_QUARTZ_TRAPDOOR = registerBlock("black_quartz_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON,AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block BLACK_QUARTZ_FENCE = registerBlock("black_quartz_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block BLACK_QUARTZ_FENCE_GATE = registerBlock("black_quartz_fence_gate",
            new FenceGateBlock(WoodType.OAK,AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block BLACK_QUARTZ_WALL = registerBlock("black_quartz_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block BLACK_QUARTZ_BUTTON = registerBlock("black_quartz_button",
            new ButtonBlock(BlockSetType.IRON,10,AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block BLACK_QUARTZ_PRESSURE_PLATE = registerBlock("black_quartz_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON,AbstractBlock.Settings.create().strength(2f).requiresTool()));



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
