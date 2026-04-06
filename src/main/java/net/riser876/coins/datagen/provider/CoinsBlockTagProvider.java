package net.riser876.coins.datagen.provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.riser876.coins.Coins;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class CoinsBlockTagProvider extends BlockTagsProvider {

    public CoinsBlockTagProvider(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> lookupProvider
    ) {
        super(output, lookupProvider, Coins.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {

    }
}
