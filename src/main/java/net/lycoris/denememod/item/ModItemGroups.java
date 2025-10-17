package net.lycoris.denememod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lycoris.denememod.DenemeMod;
import net.lycoris.denememod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup LYCORIS_MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(DenemeMod.MOD_ID, "lycoris_mod_item_group"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.BLACK_QUARTZ)).displayName(Text.translatable("itemgroup.denememod.lycoris_items"))
            .entries((displayContext, entries) ->
            {
                entries.add(ModItems.BLACK_QUARTZ);
                entries.add(ModItems.ZENITH);
                entries.add(ModBlocks.BLACK_QUARTZ_BLOCK);

            }).build());

    public static void registerItemGroups()
    {
        DenemeMod.LOGGER.info("Registering Item Groups for " + DenemeMod.MOD_ID);
    }
}
