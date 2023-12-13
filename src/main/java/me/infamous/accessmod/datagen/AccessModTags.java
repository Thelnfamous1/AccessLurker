package me.infamous.accessmod.datagen;

import me.infamous.accessmod.AccessMod;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class AccessModTags {

    private static Tags.IOptionalNamedTag<Block> blockTag(String name)
    {
        return BlockTags.createOptional(new ResourceLocation(AccessMod.MODID, name));
    }
}
