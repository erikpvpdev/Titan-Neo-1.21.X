package code.erikpvp.titanmod.event;

import code.erikpvp.titanmod.TitanMod;
import code.erikpvp.titanmod.item.custom.legend.TitanBoots;
import code.erikpvp.titanmod.item.custom.legend.TitanChestplate;
import code.erikpvp.titanmod.item.custom.legend.TitanHelmet;
import code.erikpvp.titanmod.item.custom.legend.TitanLeggings;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = TitanMod.MOD_ID)
public class TitanArmorEventHandler {

    private static final ResourceLocation MODIFIER_ID = ResourceLocation.tryParse("titanmod:extra_health");

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Pre event) {
        Player player = event.getEntity();
        if (player == null || MODIFIER_ID == null) return;

        double bonusHealth = 0;

        for (ItemStack armor : player.getArmorSlots()) {
            if (armor.getItem() instanceof TitanHelmet helmet) bonusHealth += helmet.getExtraHealth();
            else if (armor.getItem() instanceof TitanChestplate chest) bonusHealth += chest.getExtraHealth();
            else if (armor.getItem() instanceof TitanLeggings legs) bonusHealth += legs.getExtraHealth();
            else if (armor.getItem() instanceof TitanBoots boots) bonusHealth += boots.getExtraHealth();
        }

        AttributeModifier existing = player.getAttribute(Attributes.MAX_HEALTH).getModifier(MODIFIER_ID);
        if (existing != null) player.getAttribute(Attributes.MAX_HEALTH).removeModifier(existing);

        if (bonusHealth > 0) {
            AttributeModifier modifier = new AttributeModifier(MODIFIER_ID, bonusHealth, AttributeModifier.Operation.ADD_VALUE);
            player.getAttribute(Attributes.MAX_HEALTH).addTransientModifier(modifier);
        }
    }
}
