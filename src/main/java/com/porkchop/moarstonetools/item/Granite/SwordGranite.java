package com.porkchop.moarstonetools.item.Granite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemSword;

public class SwordGranite extends ItemSword {

    public SwordGranite(String name) {
        super(MOARStoneTools.graniteToolMaterial);
        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
