package com.porkchop.moarstonetools.item.Andesite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemHoe;

public class HoeAndesite extends ItemHoe {

    public HoeAndesite(String name) {
        super(MOARStoneTools.andesiteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
