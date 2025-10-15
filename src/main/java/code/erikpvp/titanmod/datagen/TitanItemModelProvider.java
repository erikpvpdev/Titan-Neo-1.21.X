package code.erikpvp.titanmod.datagen;

import code.erikpvp.titanmod.TitanMod;
import code.erikpvp.titanmod.item.TitanItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class TitanItemModelProvider extends ItemModelProvider {
    public TitanItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TitanMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(TitanItems.CITRIN_INGOT.get());
        basicItem(TitanItems.RAW_CITRIN.get());
        basicItem(TitanItems.HANDLE.get());
        basicItem(TitanItems.NETHER_SHARD.get());
        basicItem(TitanItems.NETHER_INGOT.get());
        basicItem(TitanItems.CRYSTAL.get());
        basicItem(TitanItems.TITAN_POWDER.get());
        basicItem(TitanItems.TITAN_INGOT.get());
    }
}
