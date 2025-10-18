package net.lycoris.denememod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lycoris.denememod.DenemeMod;
import net.lycoris.denememod.block.ModBlocks;
import net.lycoris.denememod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> BLACK_QUARTZ_SMELTABLES = List.of(ModBlocks.BLACK_QUARTZ_ORE,ModBlocks.BLACK_QUARTZ_DEEPSLATE_ORE);

        offerSmelting(recipeExporter,BLACK_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_QUARTZ,0.5f,200,"black_quartz");
        offerBlasting(recipeExporter,BLACK_QUARTZ_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_QUARTZ,0.5f,100,"black_quartz");

        offerReversibleCompactingRecipes(recipeExporter,RecipeCategory.BUILDING_BLOCKS,ModItems.BLACK_QUARTZ,RecipeCategory.MISC,ModBlocks.BLACK_QUARTZ_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.CHISEL)
                .pattern(" q")
                .pattern("s ")
                .input('q',ModItems.BLACK_QUARTZ)
                .input('s',Items.STICK).
                criterion(hasItem(ModItems.BLACK_QUARTZ),conditionsFromItem(ModItems.BLACK_QUARTZ))
                .offerTo(recipeExporter, Identifier.of(DenemeMod.MOD_ID,"chisel_recipe"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.ZENITH)
                .pattern("q")
                .pattern("q")
                .pattern("s")
                .input('q',ModItems.BLACK_QUARTZ)
                .input('s',Items.STICK).
                criterion(hasItem(ModItems.BLACK_QUARTZ),conditionsFromItem(ModItems.BLACK_QUARTZ))
                .offerTo(recipeExporter,Identifier.of(DenemeMod.MOD_ID,"zenith_recipe"));


    }
}
