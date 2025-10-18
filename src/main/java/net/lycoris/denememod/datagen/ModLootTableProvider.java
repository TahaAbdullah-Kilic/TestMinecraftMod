package net.lycoris.denememod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lycoris.denememod.block.ModBlocks;
import net.lycoris.denememod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLACK_QUARTZ_BLOCK);
        addDrop(ModBlocks.MAGIC_BLOCK);

        addDrop(ModBlocks.BLACK_QUARTZ_ORE,oreDrops(ModBlocks.BLACK_QUARTZ_ORE,ModItems.BLACK_QUARTZ));
        addDrop(ModBlocks.BLACK_QUARTZ_DEEPSLATE_ORE,oreDrops(ModBlocks.BLACK_QUARTZ_DEEPSLATE_ORE,ModItems.BLACK_QUARTZ));

        addDrop(ModBlocks.BLACK_QUARTZ_STAIRS);
        addDrop(ModBlocks.BLACK_QUARTZ_SLAB,slabDrops(ModBlocks.BLACK_QUARTZ_SLAB));
        addDrop(ModBlocks.BLACK_QUARTZ_DOOR,doorDrops(ModBlocks.BLACK_QUARTZ_DOOR));
        addDrop(ModBlocks.BLACK_QUARTZ_TRAPDOOR);
        addDrop(ModBlocks.BLACK_QUARTZ_WALL);
        addDrop(ModBlocks.BLACK_QUARTZ_FENCE);
        addDrop(ModBlocks.BLACK_QUARTZ_FENCE_GATE);
        addDrop(ModBlocks.BLACK_QUARTZ_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_QUARTZ_BUTTON);
    }
}
