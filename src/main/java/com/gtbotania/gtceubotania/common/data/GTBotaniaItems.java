package com.gtbotania.gtceubotania.common.data;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.gtbotania.gtceubotania.GTBotania.GTB_CREATIVE_TAB;
import static com.gtbotania.gtceubotania.common.registry.GTBRegistry.REGISTRATE;

@SuppressWarnings("all")
public class GTBotaniaItems {




    static {
        REGISTRATE.creativeModeTab(() -> GTB_CREATIVE_TAB);
    }

    public static ItemEntry<Item> RUNE_TABLET = REGISTRATE.item("rune_tablet", Item::new).lang("Rune Tablet")
            .register();
    public static ItemEntry<Item> UNFIRED_RUNE_TABLET = REGISTRATE.item("unfired_rune_tablet", Item::new).lang("Unfired Rune Tablet")
            .register();

    public static void init() {}

}
