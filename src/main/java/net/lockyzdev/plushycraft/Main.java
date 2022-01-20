package net.lockyzdev.plushycraft;

import net.lockyzdev.plushycraft.init.ModBlocks;
import net.lockyzdev.plushycraft.init.ModItems;
import net.lockyzdev.plushycraft.init.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "plushycraft";
    public static final String NAME = "Plushy Craft";
    public static final String VERSION = "0.1.0.0";

    private static Logger logger;
    
    @Instance
    public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	System.out.println(MODID + ":preInit");
        logger = event.getModLog();
        ModItems.init();
        ModRecipes.init();
        ModBlocks.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	System.out.println(MODID + ":init");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	System.out.println(MODID + ":postInit");
    }
}
