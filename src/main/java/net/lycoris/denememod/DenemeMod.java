package net.lycoris.denememod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.lycoris.denememod.block.ModBlocks;
import net.lycoris.denememod.item.ModItemGroups;
import net.lycoris.denememod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DenemeMod implements ModInitializer {
	public static final String MOD_ID = "denememod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void LOGGER() {
    }

    @Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItem();
        ModBlocks.registerModBlock();

        FuelRegistry.INSTANCE.add(ModItems.SOLAR_FLARE,100000);
	}
}