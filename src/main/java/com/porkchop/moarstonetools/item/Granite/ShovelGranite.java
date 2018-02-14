package com.porkchop.moarstonetools.item.Granite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemSpade;

public class ShovelGranite extends ItemSpade {

    public ShovelGranite(String name) {
        super(MOARStoneTools.graniteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
