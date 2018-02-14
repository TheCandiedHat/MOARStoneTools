package com.porkchop.moarstonetools.item.Andesite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemAxe;

public class AxeAndesite extends ItemAxe {

    public AxeAndesite(String name) {
        super(MOARStoneTools.andesiteToolMaterial, 7.5F,  1.1F - 4F);


        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
