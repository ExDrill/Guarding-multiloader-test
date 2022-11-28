package com.exdrill.guarding.registry;

import com.exdrill.guarding.Guarding;
import com.exdrill.guarding.GuardingFabric;
import com.exdrill.guarding.item.NetheriteShieldItem;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final Item NETHERITE_SHIELD = register("netherite_shield", new NetheriteShieldItem(new Item.Properties().tab(GuardingFabric.config.enableExperimentalFeatures() ? CreativeModeTab.TAB_COMBAT : null).durability(612).fireResistant()));

    public static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(Guarding.MOD_ID, name), item);
    }

    public static void register() {}
}
