package com.porkchop.moarstonetools.item.Granite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemHoe;

public class HoeGranite extends ItemHoe {

    public HoeGranite(String name) {
        super(MOARStoneTools.graniteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
