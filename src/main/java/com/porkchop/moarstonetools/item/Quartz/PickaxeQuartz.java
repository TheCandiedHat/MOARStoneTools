package com.porkchop.moarstonetools.item.Quartz;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemPickaxe;

public class PickaxeQuartz extends ItemPickaxe {

    public PickaxeQuartz(String name) {
        super(MOARStoneTools.quartzToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
