package me.infamous.accessmod.common.registry;

import me.infamous.accessmod.AccessMod;
import me.infamous.accessmod.common.item.SoulScytheItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AccessModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AccessMod.MODID);

    public static final RegistryObject<Item> LURKER_SPAWN_EGG = ITEMS.register("lurker_spawn_egg",
            () -> new ForgeSpawnEggItem(AccessModEntityTypes.LURKER, 12698049, 4802889,
                    (new Item.Properties()).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe", () -> new SoulScytheItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT).durability(250)));


    public static void register(IEventBus modEventBus){
        ITEMS.register(modEventBus);
    }
}
