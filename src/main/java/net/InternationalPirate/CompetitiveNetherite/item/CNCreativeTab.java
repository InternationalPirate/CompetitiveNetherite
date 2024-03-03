package net.InternationalPirate.CompetitiveNetherite.item;

import net.InternationalPirate.CompetitiveNetherite.CompetitiveNetherite;
import net.InternationalPirate.CompetitiveNetherite.block.CNBlockList;
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
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(CNItemList.UPGRADE_TEMPLATE_HARDENED.get()))
                    .title(Component.translatable("creativetab.competitivenetherite_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //GENERAL ITEMS
                        output.accept(CNItemList.ALLUDING_GUST.get());
                        output.accept(CNItemList.INFERNAL_PYRE.get());
                        output.accept(CNItemList.STRANGE_HEART.get());
                        output.accept(CNItemList.ZEPHYR_BOTTLED.get());
                        output.accept(CNItemList.UPGRADE_TEMPLATE_INFLAMED.get());
                        output.accept(CNItemList.UPGRADE_TEMPLATE_STRANGE.get());
                        output.accept(CNItemList.UPGRADE_TEMPLATE_CHARMED.get());
                        output.accept(CNItemList.UPGRADE_TEMPLATE_HARDENED.get());
                        output.accept(CNItemList.UPGRADE_TEMPLATE_SOULSTOLEN.get());
                        output.accept(CNItemList.UPGRADE_TEMPLATE_WINDSWEPT.get());

                        //TOOLS AND WEAPONS
                        output.accept(CNItemList.INFLAMED_NETHERITE_SHOVEL.get());
                        output.accept(CNItemList.INFLAMED_NETHERITE_PICKAXE.get());
                        output.accept(CNItemList.INFLAMED_NETHERITE_AXE.get());
                        output.accept(CNItemList.INFLAMED_NETHERITE_HOE.get());
                        output.accept(CNItemList.INFLAMED_NETHERITE_SWORD.get());
                        output.accept(CNItemList.STRANGE_NETHERITE_SHOVEL.get());
                        output.accept(CNItemList.STRANGE_NETHERITE_PICKAXE.get());
                        output.accept(CNItemList.STRANGE_NETHERITE_AXE.get());
                        output.accept(CNItemList.STRANGE_NETHERITE_HOE.get());
                        output.accept(CNItemList.STRANGE_NETHERITE_SWORD.get());

                        //ARMOR
                        output.accept(CNItemList.INFLAMED_NETHERITE_HELMET.get());
                        output.accept(CNItemList.INFLAMED_NETHERITE_CHESTPLATE.get());
                        output.accept(CNItemList.INFLAMED_NETHERITE_LEGGINGS.get());
                        output.accept(CNItemList.INFLAMED_NETHERITE_BOOTS.get());

                        //BLOCKS
                        output.accept(CNBlockList.NETHER_FISSURE.get());
                        output.accept(CNBlockList.WIND_TRAP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
