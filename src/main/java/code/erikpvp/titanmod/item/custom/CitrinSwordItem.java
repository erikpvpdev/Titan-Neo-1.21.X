package code.erikpvp.titanmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class CitrinSwordItem extends SwordItem {
    private static final Random RANDOM = new Random();

    public CitrinSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair) {
        return true;
    }
    public void appendHoverText(ItemStack stack, @Nullable Level level,
                                List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.literal("§a25% Poison Chance"));
    }
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // 25% chance
        if (RANDOM.nextFloat() < 0.25f) {
            target.addEffect(new MobEffectInstance(MobEffects.POISON, 80, 0)); // 4 seconds, amplifier 0
        }

        return super.hurtEnemy(stack, target, attacker);
    }
}
