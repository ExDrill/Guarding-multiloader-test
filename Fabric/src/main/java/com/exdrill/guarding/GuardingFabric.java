package com.exdrill.guarding;

import com.chocohead.mm.api.ClassTinkerers;
import com.exdrill.guarding.config.Config;
import com.exdrill.guarding.registry.GuardingEnchantments;
import com.exdrill.guarding.registry.GuardingParticles;
import com.exdrill.guarding.registry.ModItems;
import com.exdrill.guarding.registry.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceConditions;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

import java.security.Guard;

public class GuardingFabric implements ModInitializer {

    public static final EnchantmentCategory GUARDING_SHIELD = ClassTinkerers.getEnum(EnchantmentCategory.class, "GUARDING_SHIELD");
    public static final ResourceLocation PARRY = new ResourceLocation(Guarding.MOD_ID, "parry");
    public static Config config;

    public void onInitialize() {
        GuardingParticles.register();
        config = Config.run();
        ModSounds.register();
        ModItems.register();
        GuardingEnchantments.init();
        ResourceConditions.register(new ResourceLocation(Guarding.MOD_ID, "experimental"), (jsonObject -> config.enableExperimentalFeatures()));

        // Stats
        Registry.register(Registry.CUSTOM_STAT, new ResourceLocation(Guarding.MOD_ID, "parry"), PARRY);
        Stats.CUSTOM.get(PARRY, StatFormatter.DEFAULT);
    }
}
