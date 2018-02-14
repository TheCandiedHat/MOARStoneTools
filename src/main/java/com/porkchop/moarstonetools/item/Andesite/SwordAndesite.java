package com.porkchop.moarstonetools.item.Andesite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemSword;

public class SwordAndesite extends ItemSword {

    public SwordAndesite(String name) {
        super(MOARStoneTools.andesiteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
