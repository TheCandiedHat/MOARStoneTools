package com.porkchop.moarstonetools;

import com.porkchop.moarstonetools.item.ModItems;
import com.porkchop.moarstonetools.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = MOARStoneTools.MODID, version = MOARStoneTools.VERSION)
public class MOARStoneTools
{
    public static final String MODID = "moarstonetools";
    public static final String VERSION = "1.0";

    @SidedProxy(serverSide = "com.porkchop.moarstonetools.proxy.CommonProxy", clientSide = "com.porkchop.moarstonetools.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final Item.ToolMaterial graniteToolMaterial = EnumHelper.addToolMaterial("GRANITE", 1, 200, 5F, 1.8F, 3);
    public static final Item.ToolMaterial dioriteToolMaterial = EnumHelper.addToolMaterial("DIORITE", 1, 250, 5.5F, 1.6F, 7);
    public static final Item.ToolMaterial andesiteToolMaterial = EnumHelper.addToolMaterial("ANDESITE", 2, 100, 5.8F, 2.2F, 20);
    public static final Item.ToolMaterial quartzToolMaterial = EnumHelper.addToolMaterial("QUARTZ", 3, 1200, 10F, 2.9F, 18);

    public static final ItemArmor.ArmorMaterial graniteArmorMaterial = EnumHelper.addArmorMaterial(
            "GRANITE"
            , MODID + ":granite"
            , 13
            , new int[]{2, 3, 4, 1}
            , 4
            , SoundEvents.ITEM_ARMOR_EQUIP_CHAIN
            , 0.0F
    );
    public static final ItemArmor.ArmorMaterial dioriteArmorMaterial = EnumHelper.addArmorMaterial(
            "DIORITE"
            , MODID + ":diorite"
            , 14
            , new int[]{3, 3, 3, 3}
            , 3
            , SoundEvents.ITEM_ARMOR_EQUIP_CHAIN
            , 0.0F
    );
    public static final ItemArmor.ArmorMaterial andesiteArmorMaterial = EnumHelper.addArmorMaterial(
            "ANDESITE"
            , MODID + ":ANDESITE"
            , 10
            , new int[]{1, 3, 2, 1}
            , 20
            , SoundEvents.ITEM_ARMOR_EQUIP_CHAIN
            , 0.0F
    );
    public static final ItemArmor.ArmorMaterial quartzArmorMaterial = EnumHelper.addArmorMaterial(
            "QUARTZ"
            , MODID + ":QUARTZ"
            , 16
            , new int[]{4, 6, 5, 3}
            , 15
            , SoundEvents.ITEM_ARMOR_EQUIP_CHAIN
            , 1F
    );


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {

        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {

            ModItems.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {

            ModItems.registerItemModels();
        }

    }
}
