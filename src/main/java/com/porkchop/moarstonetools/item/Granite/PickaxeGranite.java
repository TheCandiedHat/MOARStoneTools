package com.porkchop.moarstonetools.item.Granite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemPickaxe;

public class PickaxeGranite extends ItemPickaxe {

    public PickaxeGranite(String name) {
        super(MOARStoneTools.graniteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
