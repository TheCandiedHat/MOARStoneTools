package com.porkchop.moarstonetools.item.Andesite.Armor;

import com.porkchop.moarstonetools.MOARStoneTools;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class HelmetAndesite extends ItemArmor {

    public HelmetAndesite(String name) {
        super(MOARStoneTools.andesiteArmorMaterial, 1, EntityEquipmentSlot.HEAD);

        setRegistryName(name);
        setUnlocalizedName(name);
    }
}
