package com.sounder.shrimpmod.item;

import com.sounder.shrimpmod.AguaChileMod;
import com.sounder.shrimpmod.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTable {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AguaChileMod.MOD_ID);

    public static final Supplier<CreativeModeTab> SHRIMP_ITEMS_TAB = CREATIVE_MODE_TAB.register( "shrimp_items_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItem.SHRIMP.get()))
                    .title(Component.translatable( "creativetab.shrimpmod.shrimp_items"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItem.SHRIMP);
                        output.accept(ModItem.RAW_SHRIMP);
                        output.accept(ModBlock.SHRIMP_TANK);
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
