package me.infamous.accessmod.datagen;

import me.infamous.accessmod.AccessMod;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class AccessModBlockTagsProvider extends BlockTagsProvider {
    public AccessModBlockTagsProvider(DataGenerator pGenerator, @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, AccessMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
    }
}
