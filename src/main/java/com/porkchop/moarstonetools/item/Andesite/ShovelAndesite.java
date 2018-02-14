package com.porkchop.moarstonetools.item.Andesite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemSpade;

public class ShovelAndesite extends ItemSpade {

    public ShovelAndesite(String name) {
        super(MOARStoneTools.andesiteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
