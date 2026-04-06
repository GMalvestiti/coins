package net.riser876.coins;

import net.riser876.coins.registry.CoinsItem;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(Coins.MOD_ID)
public class Coins {

    public static final String MOD_ID = "coins";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Coins(IEventBus modEventBus, ModContainer modContainer) {
        try {
            CoinsItem.init(modEventBus);
            Coins.LOGGER.info("[Coins] Mod loaded.");
        } catch (Exception e) {
            Coins.LOGGER.error("[Coins] Failed to load.", e);
        }
    }
}
