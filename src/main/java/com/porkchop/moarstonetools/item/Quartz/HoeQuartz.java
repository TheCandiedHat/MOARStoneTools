package com.porkchop.moarstonetools.item.Quartz;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemHoe;

public class HoeQuartz extends ItemHoe {

    public HoeQuartz(String name) {
        super(MOARStoneTools.quartzToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
