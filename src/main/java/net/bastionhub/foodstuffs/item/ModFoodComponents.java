package net.bastionhub.foodstuffs.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.25f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent VEGETABLE_SALAD = new FoodComponent.Builder().nutrition(8).saturationModifier(1.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200), 1f)
            .build();
}
