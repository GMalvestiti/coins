package net.riser876.coins.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.riser876.coins.registry.CoinsItem;
import net.riser876.coins.registry.CoinsTag;

import java.util.concurrent.CompletableFuture;

public class CoinsBrazilianPortugueseLanguageProvider extends FabricLanguageProvider {

    public CoinsBrazilianPortugueseLanguageProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "pt_br", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(CoinsItem.COINS_ITEM_GROUP_KEY, "Moedas");

        translationBuilder.add(CoinsItem.GOLD_COIN, "Moeda de Ouro");
        translationBuilder.add(CoinsItem.IRON_COIN, "Moeda de Ferro");
        translationBuilder.add(CoinsItem.COPPER_COIN, "Moeda de Cobre");

        translationBuilder.add(CoinsTag.COINS, "Moedas");
        translationBuilder.add(CoinsTag.GOLD_COIN, "Moeda de Ouro");
        translationBuilder.add(CoinsTag.IRON_COIN, "Moeda de Ferro");
        translationBuilder.add(CoinsTag.COPPER_COIN, "Moeda de Cobre");
    }
}
