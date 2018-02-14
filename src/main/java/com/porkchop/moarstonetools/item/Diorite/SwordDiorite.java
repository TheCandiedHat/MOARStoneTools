package com.porkchop.moarstonetools.item.Diorite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemSword;

public class SwordDiorite extends ItemSword {

    public SwordDiorite(String name) {
        super(MOARStoneTools.dioriteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
