package net.InternationalPirate.CompetitiveNetherite.item;

import net.InternationalPirate.CompetitiveNetherite.CompetitiveNetherite;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CNCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CompetitiveNetherite.MODID);

    public static final RegistryObject<CreativeModeTab> COMPETITIVE_NETHERITE_TAB = CREATIVE_MODE_TABS.register("competitive_netherite_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(CNItemList.INFERNAL_PYRE.get()))
                    .title(Component.translatable("creativetab.competitivenetherite_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(CNItemList.INFERNAL_PYRE.get());
                        output.accept(CNItemList.STRANGE_HEART.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
