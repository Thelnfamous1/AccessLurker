package me.infamous.accessmod.common;

import me.infamous.accessmod.AccessMod;
import me.infamous.accessmod.mixin.EntityAccessor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.particles.IParticleData;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;

public class AccessModUtil {
    public static final ITag.INamedTag<EntityType<?>> LURKER_DISGUISES_AS = EntityTypeTags.createOptional(new ResourceLocation(AccessMod.MODID, "lurker_disguises_as"));
    public static final ITag.INamedTag<EntityType<?>> SCYTHE_CAN_HARVEST_SOUL = EntityTypeTags.createOptional(new ResourceLocation(AccessMod.MODID, "scythe_can_harvest_soul"));
    public static final ITag.INamedTag<EntityType<?>> SCYTHE_CAN_HARVEST_SOUL_LIMITED = EntityTypeTags.createOptional(new ResourceLocation(AccessMod.MODID, "scythe_can_harvest_soul_limited"));

    public static int secondsToTicks(double seconds) {
        return (int) Math.ceil(seconds * 20);
    }

    public static void sendParticle(ServerWorld world, IParticleData particleType, Entity entity, int pParticleCount, double pSpeed){
        Vector3d deltaMovement = entity.getDeltaMovement();
        EntityAccessor accessor = (EntityAccessor) entity;
        world.sendParticles(particleType,
                entity.getX() + (accessor.accessmod_getRandom().nextDouble() - 0.5D) * (double)entity.getBbWidth(),
                entity.getY() + 0.1D,
                entity.getZ() + (accessor.accessmod_getRandom().nextDouble() - 0.5D) * (double)entity.getBbWidth(),
                pParticleCount,
                deltaMovement.x * -0.2D,
                0.1D,
                deltaMovement.z * -0.2D,
                pSpeed);
    }

}
