package code.erikpvp.titanmod.util;

import code.erikpvp.titanmod.TitanMod;
import code.erikpvp.titanmod.block.TitanBlocks;
import code.erikpvp.titanmod.item.TitanItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TitanCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TitanMod.MOD_ID);

    public static final Supplier<CreativeModeTab> LEGEND_ITEMS_TAB = CREATIVE_MODE_TAB.register("titan_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(TitanItems.CRYSTAL.get()))
                    .title(Component.translatable("creativetab.titanmod.titan_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(TitanItems.RAW_CITRIN);
                        output.accept(TitanItems.CITRIN_INGOT);
                        output.accept(TitanItems.CRYSTAL);
                        output.accept(TitanItems.TITAN_INGOT);
                        output.accept(TitanItems.TITAN_POWDER);
                        output.accept(TitanItems.NETHER_SHARD);
                        output.accept(TitanItems.NETHER_INGOT);
                        output.accept(TitanItems.HANDLE);
                        output.accept(TitanBlocks.CITRIN_BLOCK);
                        output.accept(TitanBlocks.CITRIN_ORE);
                        output.accept(TitanBlocks.DEEPSLATE_CITRIN_ORE);
                        output.accept(TitanBlocks.TITAN_ORE);
                        output.accept(TitanBlocks.DEEPSLATE_TITAN_ORE);
                        output.accept(TitanBlocks.NETHER_ORE);
                        output.accept(TitanBlocks.NETHER_BLOCK);
                        output.accept(TitanBlocks.TITAN_BLOCK);
                        output.accept(TitanItems.TITAN_SWORD);
                        output.accept(TitanItems.CITRIN_SWORD);
                        output.accept(TitanItems.NETHER_SWORD);
                        output.accept(TitanItems.CITRIN_HELMET);
                        output.accept(TitanItems.CITRIN_CHESTPLATE);
                        output.accept(TitanItems.CITRIN_LEGGINGS);
                        output.accept(TitanItems.CITRIN_BOOTS);
                        output.accept(TitanItems.TITAN_HELMET);
                        output.accept(TitanItems.TITAN_CHESTPLATE);
                        output.accept(TitanItems.TITAN_LEGGINGS);
                        output.accept(TitanItems.TITAN_BOOTS);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
