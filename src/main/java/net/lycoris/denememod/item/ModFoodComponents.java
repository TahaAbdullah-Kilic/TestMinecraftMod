package net.lycoris.denememod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(2).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,1,1),1.0f).build();
}
