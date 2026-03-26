package net.riser876.coins.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.riser876.coins.registry.CoinsItem;
import net.riser876.coins.registry.CoinsTag;

import java.util.concurrent.CompletableFuture;

public class CoinsItemTagProvider extends FabricTagsProvider.ItemTagsProvider {

    public CoinsItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        valueLookupBuilder(CoinsTag.GOLD_COIN).add(CoinsItem.GOLD_COIN);
        valueLookupBuilder(CoinsTag.IRON_COIN).add(CoinsItem.IRON_COIN);
        valueLookupBuilder(CoinsTag.COPPER_COIN).add(CoinsItem.COPPER_COIN);

        valueLookupBuilder(CoinsTag.COINS)
                .addOptionalTag(CoinsTag.GOLD_COIN)
                .addOptionalTag(CoinsTag.IRON_COIN)
                .addOptionalTag(CoinsTag.COPPER_COIN);
    }
}
