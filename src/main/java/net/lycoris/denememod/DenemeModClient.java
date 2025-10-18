package net.lycoris.denememod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.lycoris.denememod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class DenemeModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_QUARTZ_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_QUARTZ_TRAPDOOR, RenderLayer.getCutout());
    }
}
