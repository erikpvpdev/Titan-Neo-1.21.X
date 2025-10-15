package code.erikpvp.titanmod.item;

import code.erikpvp.titanmod.TitanMod;
import code.erikpvp.titanmod.item.custom.CitrinSwordItem;
import code.erikpvp.titanmod.item.custom.NetherSwordItem;
import code.erikpvp.titanmod.item.custom.TitanArmorMaterials;
import code.erikpvp.titanmod.item.custom.TitanSwordItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.List;

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

    public static final DeferredItem<SwordItem> CITRIN_SWORD = ITEMS.register("citrin_sword",
            () -> new CitrinSwordItem(TitanToolTiers.CITRIN, new Item.Properties()
                    .attributes(SwordItem.createAttributes(TitanToolTiers.CITRIN, 2, 9996f))));

    public static final DeferredItem<SwordItem> TITAN_SWORD = ITEMS.register("titan_sword",
            () -> new TitanSwordItem(TitanToolTiers.TITAN, new Item.Properties()
                    .attributes(SwordItem.createAttributes(TitanToolTiers.TITAN, 5, 9996f))));

    public static final DeferredItem<SwordItem> NETHER_SWORD = ITEMS.register("nether_sword",
            () -> new NetherSwordItem(TitanToolTiers.NETHER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(TitanToolTiers.NETHER, 2, 9996f))));

    public static final DeferredItem<Item> CITRIN_HELMET = ITEMS.register("citrin_helmet",
            () -> new ArmorItem(TitanArmorMaterials.CITRIN_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(12))));
    public static final DeferredItem<Item> CITRIN_CHESTPLATE = ITEMS.register("citrin_chestplate",
            () -> new ArmorItem(TitanArmorMaterials.CITRIN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(12))));
    public static final DeferredItem<Item> CITRIN_LEGGINGS = ITEMS.register("citrin_leggings",
            () -> new ArmorItem(TitanArmorMaterials.CITRIN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(12))));
    public static final DeferredItem<Item> CITRIN_BOOTS = ITEMS.register("citrin_boots",
            () -> new ArmorItem(TitanArmorMaterials.CITRIN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(12))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
