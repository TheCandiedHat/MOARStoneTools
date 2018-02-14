package com.porkchop.moarstonetools.item.Quartz;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemSword;

public class SwordQuartz extends ItemSword {

    public SwordQuartz(String name) {
        super(MOARStoneTools.quartzToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
