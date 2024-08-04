package net.bastionhub.foodstuffs.item;

import net.bastionhub.foodstuffs.Foodstuffs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final ItemGroup FOODSTUFFS_GROUP = Registry.register(Registries.ITEM_GROUP,
//            Identifier.of(Foodstuffs.MOD_ID, "tomato"),
//            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tomato"))
//                    .icon(() -> new ItemStack(ModItems.TOMATO)).entries((displayContext, entries) -> {
//
//
//                    }

    public static void registerItemGroups() {
        Foodstuffs.LOGGER.info("Registering item groups for " + Foodstuffs.MOD_ID);


    }
}
