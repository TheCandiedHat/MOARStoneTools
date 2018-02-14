package com.porkchop.moarstonetools.item.Diorite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemHoe;

public class HoeDiorite extends ItemHoe {

    public HoeDiorite(String name) {
        super(MOARStoneTools.dioriteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
