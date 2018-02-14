package com.porkchop.moarstonetools.item.Diorite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemPickaxe;

public class PickaxeDiorite extends ItemPickaxe {

    public PickaxeDiorite(String name) {
        super(MOARStoneTools.dioriteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
