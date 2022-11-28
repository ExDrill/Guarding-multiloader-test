package com.exdrill.guarding;

import com.exdrill.guarding.registry.GuardingParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.mixin.object.builder.client.ModelPredicateProviderRegistryAccessor;
import net.minecraft.resources.ResourceLocation;

public class GuardingFabricClient implements ClientModInitializer {

    public void onInitializeClient() {
        GuardingParticles.registerFactories();
        ModelPredicateProviderRegistryAccessor.callRegister(new ResourceLocation(Guarding.MOD_ID, "blocking"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F);
    }
}
