package me.infamous.accessmod.common.registry;

import me.infamous.accessmod.AccessMod;
import me.infamous.accessmod.common.entity.lurker.Lurker;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

public class AccessModEntityTypes {

    private static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, AccessMod.MODID);


    public static final RegistryObject<EntityType<Lurker>> LURKER = register("lurker",
            EntityType.Builder.of(Lurker::new, EntityClassification.MONSTER)
                    .sized(1.0F, 3.4F)
                    .clientTrackingRange(8));


    private static <T extends Entity> RegistryObject<EntityType<T>> register(String pKey, EntityType.Builder<T> pBuilder) {
        return ENTITY_TYPES.register(pKey, () -> pBuilder.build(AccessMod.MODID + ":" + pKey));
    }

    public static void register(IEventBus modEventBus){
        ENTITY_TYPES.register(modEventBus);
    }

    public static Iterable<EntityType<?>> getKnownEntities() {
        return ENTITY_TYPES.getEntries().stream().map(RegistryObject::get).collect(Collectors.toSet());
    }
}
