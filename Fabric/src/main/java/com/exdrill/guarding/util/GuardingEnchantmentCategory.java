package com.exdrill.guarding.util;

import com.exdrill.guarding.mixin.EnchantmentCategoryMixin;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;

public class GuardingEnchantmentCategory extends EnchantmentCategoryMixin {

    public boolean canEnchant(Item item) {
        return item instanceof ShieldItem;
    }
}
