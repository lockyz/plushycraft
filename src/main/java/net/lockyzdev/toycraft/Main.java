package net.lockyzdev.toycraft;

import net.lockyzdev.toycraft.init.ModBlocks;
import net.lockyzdev.toycraft.init.ModItems;
import net.lockyzdev.toycraft.init.ModRecipes;
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
    public static final String MODID = "toycraft";
    public static final String NAME = "Toycraft";
    public static final String VERSION = "1.2.0.0";

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
