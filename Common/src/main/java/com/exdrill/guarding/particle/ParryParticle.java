package com.exdrill.guarding.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class ParryParticle extends SimpleAnimatedParticle {

    protected ParryParticle(ClientLevel clientLevel, double x, double y, double z, SpriteSet spriteSet) {
        super(clientLevel, x, y, z, spriteSet, 0.0F);
        this.age = 5;
        this.quadSize = 1.0F;
        float f = this.random.nextFloat() * 0.4F + 0.6F;
        this.rCol = f;
        this.gCol = f;
        this.bCol = f;
        this.setSpriteFromAge(spriteSet);
    }

    public int getLightColor(float $$0) {
        return 15728880;
    }

    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_LIT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Nullable
        @Override
        public Particle createParticle(SimpleParticleType parameters, ClientLevel world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new ParryParticle(world, x, y, z, spriteSet);
        }
    }
}
