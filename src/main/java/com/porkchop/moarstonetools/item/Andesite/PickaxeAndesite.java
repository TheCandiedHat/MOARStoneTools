package com.porkchop.moarstonetools.item.Andesite;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.item.ItemPickaxe;

public class PickaxeAndesite extends ItemPickaxe {

    public PickaxeAndesite(String name) {
        super(MOARStoneTools.andesiteToolMaterial);

        setUnlocalizedName(name);
        setRegistryName(name);
    }
}
