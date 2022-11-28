package com.exdrill.guarding.registry;

import com.exdrill.guarding.Guarding;
import com.exdrill.guarding.particle.ParryParticle;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;

public class GuardingParticles {

    public static final SimpleParticleType PARRY = FabricParticleTypes.simple();

    public static void register() {
        Registry.register(Registry.PARTICLE_TYPE, new ResourceLocation(Guarding.MOD_ID, "parry"), PARRY);
    }

    public static void registerFactories() {
        ParticleFactoryRegistry.getInstance().register(PARRY, ParryParticle.Provider::new);
    }
}
