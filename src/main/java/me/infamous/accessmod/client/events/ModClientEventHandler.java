package me.infamous.accessmod.client.events;

import me.infamous.accessmod.AccessMod;
import me.infamous.accessmod.client.renderer.lurker.LurkerRenderer;
import me.infamous.accessmod.common.registry.AccessModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = AccessMod.MODID, value = Dist.CLIENT)
public class ModClientEventHandler {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(AccessModEntityTypes.LURKER.get(), LurkerRenderer::new);
    }
}
