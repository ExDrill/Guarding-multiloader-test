package com.exdrill.guarding.mixin;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ShieldItem.class)
public class ShieldItemMixin extends Item {

    public ShieldItemMixin(Item.Properties settings) {
        super(settings);
    }

    public int getEnchantmentValue() {
        return 15;
    }
}
