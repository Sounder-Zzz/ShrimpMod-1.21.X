package com.sounder.shrimpmod.item;

import com.sounder.shrimpmod.AguaChileMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AguaChileMod.MOD_ID);

    public static final DeferredItem<Item> SHRIMP = ITEMS.register("shrimp",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_SHRIMP = ITEMS.register("raw_shrimp",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register((eventBus));
    }
}
