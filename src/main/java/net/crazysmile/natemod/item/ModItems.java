package net.crazysmile.natemod.item;

import net.crazysmile.natemod.NateMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // make a deferred reg
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NateMod.MOD_ID);

    public static final RegistryObject<Item> VILLAGEREYE = ITEMS.register("villagereye",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOTEMOFDEALS = ITEMS.register("totemofdeals", () -> new Item(new Item.Properties()));
    // reg a event bus
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
