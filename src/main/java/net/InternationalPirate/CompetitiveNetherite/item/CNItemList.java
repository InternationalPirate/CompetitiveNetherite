package net.InternationalPirate.CompetitiveNetherite.item;

import net.InternationalPirate.CompetitiveNetherite.CompetitiveNetherite;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CNItemList {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CompetitiveNetherite.MODID);

    public static final RegistryObject<Item> INFERNAL_PYRE = ITEMS.register("infernal_pyre",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRANGE_HEART = ITEMS.register("strange_heart",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
