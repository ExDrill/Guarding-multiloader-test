package com.exdrill.guarding.registry;

import com.exdrill.guarding.Guarding;
import com.exdrill.guarding.GuardingFabric;
import com.exdrill.guarding.enchantment.BarbedEnchantment;
import com.exdrill.guarding.enchantment.PummelingEnchantment;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;

public class GuardingEnchantments {

    public static final Enchantment PUMMELING_ENCHANTMENT = register("pummeling", new PummelingEnchantment(Enchantment.Rarity.COMMON, GuardingFabric.GUARDING_SHIELD, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    public static final Enchantment BARBED_ENCHANTMENT = register("barbed", new BarbedEnchantment(Enchantment.Rarity.RARE, GuardingFabric.GUARDING_SHIELD, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));

    public static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new ResourceLocation(Guarding.MOD_ID, name), enchantment);
    }

    public static void init() {}
}
