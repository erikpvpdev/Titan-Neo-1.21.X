package code.erikpvp.titanmod.event;

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
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import code.erikpvp.titanmod.item.custom.*;

@EventBusSubscriber
public class TitanArmorEventHandler {

    private static final ResourceLocation MODIFIER_ID = ResourceLocation.tryParse("titanmod:extra_health");

    @SubscribeEvent
    public static void onPlayerTick(PlayerEvent event) {
        // Safely get the player from the event
        if (!(event.getEntity() instanceof Player player)) return;

        if (MODIFIER_ID == null) return;

        double bonusHealth = 0;

        // Sum extra health from equipped TitanArmor pieces
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
