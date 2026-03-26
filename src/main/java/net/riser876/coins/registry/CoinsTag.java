package net.riser876.coins.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.riser876.coins.Coins;

public class CoinsTag {

    public static final TagKey<Item> COINS = create(Coins.MOD_ID);
    public static final TagKey<Item> GOLD_COIN = create(CoinId.GOLD_COIN.getId());
    public static final TagKey<Item> IRON_COIN = create(CoinId.IRON_COIN.getId());
    public static final TagKey<Item> COPPER_COIN = create(CoinId.COPPER_COIN.getId());

    private static TagKey<Item> create(String path) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Coins.MOD_ID, path));
    }
}
