package net.lycoris.denememod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lycoris.denememod.block.ModBlocks;
import net.lycoris.denememod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool blackQuartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_QUARTZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_QUARTZ_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_QUARTZ_ORE);

        blackQuartzPool.stairs(ModBlocks.BLACK_QUARTZ_STAIRS);
        blackQuartzPool.slab(ModBlocks.BLACK_QUARTZ_SLAB);
        blackQuartzPool.button(ModBlocks.BLACK_QUARTZ_BUTTON);
        blackQuartzPool.pressurePlate(ModBlocks.BLACK_QUARTZ_PRESSURE_PLATE);
        blackQuartzPool.fence(ModBlocks.BLACK_QUARTZ_FENCE);
        blackQuartzPool.fenceGate(ModBlocks.BLACK_QUARTZ_FENCE_GATE);
        blackQuartzPool.wall(ModBlocks.BLACK_QUARTZ_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_QUARTZ_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLACK_QUARTZ_TRAPDOOR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BLACK_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZENITH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOLAR_FLARE, Models.GENERATED);
    }
}
