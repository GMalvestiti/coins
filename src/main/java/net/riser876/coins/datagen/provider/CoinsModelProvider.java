package net.riser876.coins.datagen.provider;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.riser876.coins.registry.CoinsItem;

public class CoinsModelProvider extends FabricModelProvider {

    public CoinsModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemGenerated(itemModelGenerators, CoinsItem.GOLD_COIN);
        itemGenerated(itemModelGenerators, CoinsItem.IRON_COIN);
        itemGenerated(itemModelGenerators, CoinsItem.COPPER_COIN);
    }

    private static void itemGenerated(ItemModelGenerators itemModelGenerator, Item item) {
        itemModelGenerator.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }
}
