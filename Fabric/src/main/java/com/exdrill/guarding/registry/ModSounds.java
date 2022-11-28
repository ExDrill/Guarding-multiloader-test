package com.exdrill.guarding.registry;

import com.exdrill.guarding.Guarding;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {

    public static void register() {}

    public static SoundEvent register(String id) {
        ResourceLocation location = new ResourceLocation(Guarding.MOD_ID, id);
        return Registry.register(Registry.SOUND_EVENT, location, new SoundEvent(location));
    }

    public static final SoundEvent ITEM_SHIELD_PARRY = register("item.shield.parry");
}
