package me.infamous.accessmod;

import me.infamous.accessmod.common.registry.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(AccessMod.MODID)
public class AccessMod {
    public static final String MODID = "access_lurker";
    public static final Logger LOGGER = LogManager.getLogger();

    public AccessMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        AccessModEntityTypes.register(modEventBus);
        AccessModItems.register(modEventBus);
        AccessModDataSerializers.register(modEventBus);
    }
}
