package com.porkchop.moarstonetools.item.Diorite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemSpade;

public class ShovelDiorite extends ItemSpade {

    public ShovelDiorite(String name) {
        super(MOARStoneTools.dioriteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
