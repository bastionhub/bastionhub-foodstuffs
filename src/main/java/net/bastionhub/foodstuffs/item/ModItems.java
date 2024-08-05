package net.bastionhub.foodstuffs.item;

import net.bastionhub.foodstuffs.Foodstuffs;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item LETTUCE = registerItem("lettuce", new Item(new Item.Settings().food(ModFoodComponents.LETTUCE)));
    public static final Item VEGETABLE_SALAD = registerItem("lettuce", new Item(new Item.Settings().food(ModFoodComponents.VEGETABLE_SALAD)));
    public static final Item BUTTER = registerItem("butter", new Item(new Item.Settings()));
    public static final Item UNCURED_VANILLA_BEAN = registerItem("uncured_vanilla_bean", new Item(new Item.Settings()));
    public static final Item CURED_VANILLA_BEAN = registerItem("cured_vanilla_bean", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Foodstuffs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Foodstuffs.LOGGER.info("Registering mod items for " + Foodstuffs.MOD_ID);
    }
}
