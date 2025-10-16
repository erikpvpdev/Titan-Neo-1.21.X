package code.erikpvp.titanmod.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import java.util.Random;

public class TitanSwordItem extends SwordItem {

    private static final Random RANDOM = new Random();

    public TitanSwordItem(Tier tier, Properties properties) {
        super(tier, properties.durability(6000));
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isBarVisible(ItemStack stack) {
        return false;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        return true;
    }
    @Override
    public int getEnchantmentValue() {
        return 20;
    }
}
