package com.exdrill.guarding.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;

public class NetheriteShieldItem extends ShieldItem {

    private final Multimap<Attribute, AttributeModifier> attributeModifiers;

    public NetheriteShieldItem(Item.Properties properties) {
        super(properties);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier("Weapon modifier", 0.1D, AttributeModifier.Operation.ADDITION));
        this.attributeModifiers = builder.build();
    }

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        return slot == EquipmentSlot.OFFHAND ? this.attributeModifiers : super.getDefaultAttributeModifiers(slot);
    }
}
