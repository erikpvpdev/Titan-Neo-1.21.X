package code.erikpvp.titanmod.item;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class TitanToolTiers {
    public static final Tier TITAN = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            6000, 4f, 3f, 28, () -> Ingredient.of(TitanItems.TITAN_INGOT));

    public static final Tier CITRIN = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            700, 4f, 3f, 28, () -> Ingredient.of(TitanItems.CITRIN_INGOT));

    public static final Tier NETHER = new SimpleTier(BlockTags.NEEDS_IRON_TOOL,
            800, 4f, 3.5f, 28, () -> Ingredient.of(TitanItems.NETHER_INGOT));

}
