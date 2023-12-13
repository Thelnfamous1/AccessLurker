package me.infamous.accessmod.datagen;

import me.infamous.accessmod.AccessMod;
import me.infamous.accessmod.common.registry.AccessModEntityTypes;
import me.infamous.accessmod.common.registry.AccessModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class AccessModLanguageProvider extends LanguageProvider {
    public AccessModLanguageProvider(DataGenerator gen) {
        super(gen, AccessMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.addEntityType(AccessModEntityTypes.LURKER, "Lurker");
        this.add(AccessModItems.LURKER_SPAWN_EGG.get(), "Lurker Spawn Egg");
        this.add(AccessModItems.SCYTHE.get(), "Scythe");
    }
}