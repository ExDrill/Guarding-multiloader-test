package com.exdrill.guarding.mixin;

import com.exdrill.guarding.util.ShieldUtil;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class ParryHandlerMixin extends Entity {

    public ParryHandlerMixin(EntityType<?> type, Level world) {
        super(type, world);
    }

    @Inject(method = "hurt", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;hurtCurrentlyUsedShield(F)V", shift = At.Shift.AFTER))
    private void onParry(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
        ShieldUtil.onParry(this, source);
    }
}
