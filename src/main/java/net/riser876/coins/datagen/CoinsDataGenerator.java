package net.riser876.coins.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.riser876.coins.Coins;
import net.riser876.coins.datagen.provider.CoinsBrazilianPortugueseLanguageProvider;
import net.riser876.coins.datagen.provider.CoinsEnglishLanguageProvider;
import net.riser876.coins.datagen.provider.CoinsItemTagProvider;
import net.riser876.coins.datagen.provider.CoinsModelProvider;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Coins.MOD_ID)
public class CoinsDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.addProvider(new CoinsModelProvider(output));
        event.addProvider(new CoinsEnglishLanguageProvider(output));
        event.addProvider(new CoinsBrazilianPortugueseLanguageProvider(output));

        event.addProvider(new CoinsItemTagProvider(output, lookupProvider));
    }
}
