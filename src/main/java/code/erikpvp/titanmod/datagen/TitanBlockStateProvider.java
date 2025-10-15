package code.erikpvp.titanmod.datagen;

import code.erikpvp.titanmod.TitanMod;
import code.erikpvp.titanmod.block.TitanBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class TitanBlockStateProvider extends BlockStateProvider {
    public TitanBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TitanMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(TitanBlocks.CITRIN_BLOCK);
        blockWithItem(TitanBlocks.CITRIN_ORE);
        blockWithItem(TitanBlocks.DEEPSLATE_CITRIN_ORE);
        blockWithItem(TitanBlocks.NETHER_ORE);
        blockWithItem(TitanBlocks.TITAN_ORE);
        blockWithItem(TitanBlocks.DEEPSLATE_TITAN_ORE);

    }
    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
