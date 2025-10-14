package code.erikpvp.titanmod.block;

import code.erikpvp.titanmod.TitanMod;
import code.erikpvp.titanmod.item.TitanItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class TitanBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(TitanMod.MOD_ID);

    public static final DeferredBlock<Block> CITRIN_BLOCK = registerBlock("citrin_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CITRIN_ORE = registerBlock("citrin_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_CITRIN_ORE = registerBlock("deepslate_citrin_ore",
            () -> new DropExperienceBlock(UniformInt.of(3, 6),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> TITAN_ORE = registerBlock("titan_ore",
            () -> new DropExperienceBlock(UniformInt.of(1, 2),
                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_TITAN_ORE = registerBlock("deepslate_titan_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));

    public static final DeferredBlock<Block> NETHER_ORE = registerBlock("nether_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 4),
                    BlockBehaviour.Properties.of().strength(2.5f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        TitanItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
