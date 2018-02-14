package com.porkchop.moarstonetools.item;

import com.porkchop.moarstonetools.MOARStoneTools;
import com.porkchop.moarstonetools.item.Andesite.*;
import com.porkchop.moarstonetools.item.Andesite.Armor.HelmetAndesite;
import com.porkchop.moarstonetools.item.Diorite.*;
import com.porkchop.moarstonetools.item.Granite.*;
import com.porkchop.moarstonetools.item.Quartz.*;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    // Granite
    public static String axeGraniteId = "granite_axe";
    public static String hoeGraniteId = "granite_hoe";
    public static String pickaxeGraniteId = "granite_pickaxe";
    public static String shovelGraniteId = "granite_shovel";
    public static String swordGraniteId = "granite_sword";

    // Diorite
    public static String axeDioriteId = "diorite_axe";
    public static String hoeDioriteId = "diorite_hoe";
    public static String pickaxeDioriteId = "diorite_pickaxe";
    public static String shovelDioriteId = "diorite_shovel";
    public static String swordDioriteId = "diorite_sword";

    // Andesite
    public static String axeAndesiteId = "andesite_axe";
    public static String hoeAndesiteId = "andesite_hoe";
    public static String pickaxeAndesiteId = "andesite_pickaxe";
    public static String shovelAndesiteId = "andesite_shovel";
    public static String swordAndesiteId = "andesite_sword";
    // Armor
    public static String helmetAndesiteId = "andesite_helmet";
    public static String chestplateAndesiteId = "andesite_chestplate";
    public static String leggingsAndesiteId = "andesite_leggings";
    public static String bootsAndesiteId = "andesite_boots";

    // Quartz
    public static String axeQuartzId = "quartz_axe";
    public static String hoeQuartzId = "quartz_hoe";
    public static String pickaxeQuartzId = "quartz_pickaxe";
    public static String shovelQuartzId = "quartz_shovel";
    public static String swordQuartzId = "quartz_sword";


    // Granite
    public static AxeGranite axeGranite = new AxeGranite(axeGraniteId);
    public static HoeGranite hoeGranite = new HoeGranite(hoeGraniteId);
    public static PickaxeGranite pickaxeGranite = new PickaxeGranite(pickaxeGraniteId);
    public static ShovelGranite shovelGranite = new ShovelGranite(shovelGraniteId);
    public static SwordGranite swordGranite = new SwordGranite(swordGraniteId);

    // Diorite
    public static AxeDiorite axeDiorite = new AxeDiorite(axeDioriteId);
    public static HoeDiorite hoeDiorite = new HoeDiorite(hoeDioriteId);
    public static PickaxeDiorite pickaxeDiorite = new PickaxeDiorite(pickaxeDioriteId);
    public static ShovelDiorite shovelDiorite = new ShovelDiorite(shovelDioriteId);
    public static SwordDiorite swordDiorite = new SwordDiorite(swordDioriteId);

    // Andesite
    public static AxeAndesite axeAndesite = new AxeAndesite(axeAndesiteId);
    public static HoeAndesite hoeAndesite = new HoeAndesite(hoeAndesiteId);
    public static PickaxeAndesite pickaxeAndesite = new PickaxeAndesite(pickaxeAndesiteId);
    public static ShovelAndesite shovelAndesite = new ShovelAndesite(shovelAndesiteId);
    public static SwordAndesite swordAndesite = new SwordAndesite(swordAndesiteId);
    // Armor
    public static HelmetAndesite helmetAndesite = new HelmetAndesite(helmetAndesiteId);

    // Quartz
    public static AxeQuartz axeQuartz = new AxeQuartz(axeQuartzId);
    public static HoeQuartz hoeQuartz = new HoeQuartz(hoeQuartzId);
    public static PickaxeQuartz pickaxeQuartz = new PickaxeQuartz(pickaxeQuartzId);
    public static ShovelQuartz shovelQuartz = new ShovelQuartz(shovelQuartzId);
    public static SwordQuartz swordQuartz = new SwordQuartz(swordQuartzId);

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                axeGranite,
                hoeGranite,
                pickaxeGranite,
                shovelGranite,
                swordGranite,
                axeDiorite,
                hoeDiorite,
                pickaxeDiorite,
                shovelDiorite,
                swordDiorite,
                axeAndesite,
                hoeAndesite,
                pickaxeAndesite,
                shovelAndesite,
                swordAndesite,
                helmetAndesite,
                axeQuartz,
                hoeQuartz,
                pickaxeQuartz,
                shovelQuartz,
                swordQuartz
        );
    }

    public static void registerItemModels() {
        
        // Granite
        MOARStoneTools.proxy.registerItemRenderer(axeGranite, 0, axeGraniteId);
        MOARStoneTools.proxy.registerItemRenderer(hoeGranite, 0, hoeGraniteId);
        MOARStoneTools.proxy.registerItemRenderer(pickaxeGranite, 0, pickaxeGraniteId);
        MOARStoneTools.proxy.registerItemRenderer(shovelGranite, 0, shovelGraniteId);
        MOARStoneTools.proxy.registerItemRenderer(swordGranite, 0, swordGraniteId);

        // Diorite
        MOARStoneTools.proxy.registerItemRenderer(axeDiorite, 0, axeDioriteId);
        MOARStoneTools.proxy.registerItemRenderer(hoeDiorite, 0, hoeDioriteId);
        MOARStoneTools.proxy.registerItemRenderer(pickaxeDiorite, 0, pickaxeDioriteId);
        MOARStoneTools.proxy.registerItemRenderer(shovelDiorite, 0, shovelDioriteId);
        MOARStoneTools.proxy.registerItemRenderer(swordDiorite, 0, swordDioriteId);

        // Andesite
        MOARStoneTools.proxy.registerItemRenderer(axeAndesite, 0, axeAndesiteId);
        MOARStoneTools.proxy.registerItemRenderer(hoeAndesite, 0, hoeAndesiteId);
        MOARStoneTools.proxy.registerItemRenderer(pickaxeAndesite, 0, pickaxeAndesiteId);
        MOARStoneTools.proxy.registerItemRenderer(shovelAndesite, 0, shovelAndesiteId);
        MOARStoneTools.proxy.registerItemRenderer(swordAndesite, 0, swordAndesiteId);
        // Armor
        MOARStoneTools.proxy.registerItemRenderer(helmetAndesite, 0, helmetAndesiteId);

        // Quartz
        MOARStoneTools.proxy.registerItemRenderer(axeQuartz, 0, axeQuartzId);
        MOARStoneTools.proxy.registerItemRenderer(hoeQuartz, 0, hoeQuartzId);
        MOARStoneTools.proxy.registerItemRenderer(pickaxeQuartz, 0, pickaxeQuartzId);
        MOARStoneTools.proxy.registerItemRenderer(shovelQuartz, 0, shovelQuartzId);
        MOARStoneTools.proxy.registerItemRenderer(swordQuartz, 0, swordQuartzId);

    }
}
