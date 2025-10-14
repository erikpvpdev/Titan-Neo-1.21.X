package code.erikpvp.titanmod.item;

import code.erikpvp.titanmod.TitanMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TitanItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TitanMod.MOD_ID);

    public static final DeferredItem<Item> RAW_CITRIN = ITEMS.register("raw_citrin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CITRIN_INGOT = ITEMS.register("citrin_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> CRYSTAL = ITEMS.register("crystal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TITAN_INGOT = ITEMS.register("titan_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TITAN_POWDER = ITEMS.register("titan_powder",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NETHER_SHARD = ITEMS.register("nether_shard",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> NETHER_INGOT = ITEMS.register("nether_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HANDLE = ITEMS.register("handle",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
