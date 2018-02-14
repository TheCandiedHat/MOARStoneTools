package com.porkchop.moarstonetools.item.Quartz;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemSpade;

public class ShovelQuartz extends ItemSpade {

    public ShovelQuartz(String name) {
        super(MOARStoneTools.quartzToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
