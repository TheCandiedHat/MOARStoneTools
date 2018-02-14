package com.porkchop.moarstonetools.item.Granite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemAxe;

public class AxeGranite extends ItemAxe {

    public AxeGranite(String name) {
        super(MOARStoneTools.graniteToolMaterial, 9F, 0.75F - 4F);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
