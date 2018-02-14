package com.porkchop.moarstonetools.item.Diorite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemAxe;

public class AxeDiorite extends ItemAxe {

    public AxeDiorite(String name) {
        super(MOARStoneTools.dioriteToolMaterial, 8F, 1F-4F);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
