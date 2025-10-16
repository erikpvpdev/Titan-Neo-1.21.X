package code.erikpvp.titanmod.item.custom.legend;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;

public class TitanBoots extends ArmorItem {

    private final double extraHealth = 1.0;

    public TitanBoots(Holder<ArmorMaterial> material, Properties properties) {
        super(material, Type.BOOTS, properties);
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

}
