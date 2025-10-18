package code.erikpvp.titanmod.item.custom.legend;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class TitanHelmet extends ArmorItem {

    private final double extraHealth = 2.0;

    public TitanHelmet(Holder<ArmorMaterial> material, Item.Properties properties) {
        super(material, Type.HELMET, properties);
    }

    public double getExtraHealth() {
        return extraHealth;
    }

    @Override
    public boolean isBarVisible(net.minecraft.world.item.ItemStack stack) {
        return false;
    }

    @Override
    public boolean isEnchantable(net.minecraft.world.item.ItemStack stack) {
        return true;
    }

    @Override
    public boolean isValidRepairItem(net.minecraft.world.item.ItemStack toRepair, net.minecraft.world.item.ItemStack repair) {
        return false;
    }
    @Override
    public int getEnchantmentValue() {
        return 20;
    }
    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
