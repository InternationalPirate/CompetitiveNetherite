package net.InternationalPirate.CompetitiveNetherite;

import com.mojang.logging.LogUtils;
import net.InternationalPirate.CompetitiveNetherite.block.CNBlockList;
import net.InternationalPirate.CompetitiveNetherite.item.CNCreativeTab;
import net.InternationalPirate.CompetitiveNetherite.item.CNItemList;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CompetitiveNetherite.MODID)
public class CompetitiveNetherite
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "competitivenetherite";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public CompetitiveNetherite() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CNCreativeTab.register(modEventBus);
        CNItemList.register(modEventBus);
        CNBlockList.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(CNItemList.INFERNAL_PYRE);
            event.accept(CNItemList.STRANGE_HEART);
            event.accept(CNItemList.GALE_BOTTLED);
            event.accept(CNItemList.UPGRADE_TEMPLATE_INFLAMED);
            event.accept(CNItemList.UPGRADE_TEMPLATE_STRANGE);
            event.accept(CNItemList.UPGRADE_TEMPLATE_CHARMED);
            event.accept(CNItemList.UPGRADE_TEMPLATE_HARDENED);
            event.accept(CNItemList.UPGRADE_TEMPLATE_SOULSTEALER);
            event.accept(CNItemList.UPGRADE_TEMPLATE_WINDSWEPT);

        }
        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(CNBlockList.NETHER_FISSURE);
            event.accept(CNBlockList.WIND_TRAP);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(CNItemList.ALLUDING_GUST.get());
            event.accept(CNItemList.INFLAMED_NETHERITE_SHOVEL.get());
            event.accept(CNItemList.INFLAMED_NETHERITE_PICKAXE.get());
            event.accept(CNItemList.INFLAMED_NETHERITE_AXE.get());
            event.accept(CNItemList.INFLAMED_NETHERITE_HOE.get());
            event.accept(CNItemList.STRANGE_NETHERITE_SHOVEL.get());
            event.accept(CNItemList.STRANGE_NETHERITE_PICKAXE.get());
            event.accept(CNItemList.STRANGE_NETHERITE_AXE.get());
            event.accept(CNItemList.STRANGE_NETHERITE_HOE.get());
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(CNItemList.INFLAMED_NETHERITE_AXE.get());
            event.accept(CNItemList.INFLAMED_NETHERITE_SWORD.get());
            event.accept(CNItemList.STRANGE_NETHERITE_AXE.get());
            event.accept(CNItemList.STRANGE_NETHERITE_SWORD.get());
        }

    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
