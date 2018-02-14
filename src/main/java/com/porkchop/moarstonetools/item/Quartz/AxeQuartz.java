package com.porkchop.moarstonetools.item.Quartz;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemAxe;

public class AxeQuartz extends ItemAxe {

    public AxeQuartz(String name) {
        super(MOARStoneTools.quartzToolMaterial, 19F, 0.3F - 4F);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
