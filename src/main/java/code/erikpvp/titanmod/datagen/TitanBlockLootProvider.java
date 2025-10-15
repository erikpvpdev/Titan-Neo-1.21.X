package code.erikpvp.titanmod.datagen;

import code.erikpvp.titanmod.block.TitanBlocks;
import code.erikpvp.titanmod.item.TitanItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class TitanBlockLootProvider extends BlockLootSubProvider {
    protected TitanBlockLootProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(TitanBlocks.CITRIN_BLOCK.get());

        add(TitanBlocks.CITRIN_ORE.get(),
                block -> createOreDrop(TitanBlocks.CITRIN_ORE.get(), TitanItems.RAW_CITRIN.get()));

        add(TitanBlocks.TITAN_ORE.get(),
                        block -> createOreDrop(TitanBlocks.TITAN_ORE.get(), TitanItems.CRYSTAL.get()));

        add(TitanBlocks.DEEPSLATE_CITRIN_ORE.get(),
                block -> createOreDrop(TitanBlocks.CITRIN_ORE.get(), TitanItems.RAW_CITRIN.get()));

        add(TitanBlocks.DEEPSLATE_TITAN_ORE.get(),
                block -> createOreDrop(TitanBlocks.DEEPSLATE_TITAN_ORE.get(), TitanItems.CRYSTAL.get()));

        add(TitanBlocks.NETHER_ORE.get(),
                block -> createOreDrop(TitanBlocks.NETHER_ORE.get(), TitanItems.NETHER_SHARD.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return TitanBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
