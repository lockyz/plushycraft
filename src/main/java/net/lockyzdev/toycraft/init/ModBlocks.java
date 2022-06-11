package net.lockyzdev.toycraft.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.lockyzdev.toycraft.Main;
import net.lockyzdev.toycraft.blocks.BlockBasic;

@Mod.EventBusSubscriber(modid= Main.MODID)
public class ModBlocks {
	//Among Us Plushies
	static Block crewmate_sit_red;
	static Block crewmate_sit_blue;
	static Block crewmate_sit_green;
	static Block crewmate_sit_pink;
	static Block crewmate_sit_orange;
	static Block crewmate_sit_lime;
	static Block crewmate_sit_white;
	static Block crewmate_sit_black;
	static Block crewmate_sit_rose;
	static Block crewmate_sit_cyan;
	static Block crewmate_sit_yellow;
	static Block crewmate_sit_purple;
	static Block crewmate_sit_banana;
	static Block crewmate_sit_coral;
	static Block crewmate_sit_gray;
	static Block crewmate_sit_maroon;
	static Block crewmate_sit_brown;
	static Block crewmate_sit_tan;

	static Block crewmate_stand_red;
	static Block crewmate_stand_blue;
	static Block crewmate_stand_green;
	static Block crewmate_stand_pink;
	static Block crewmate_stand_orange;
	static Block crewmate_stand_lime;
	static Block crewmate_stand_white;
	static Block crewmate_stand_black;
	static Block crewmate_stand_rose;
	static Block crewmate_stand_cyan;
	static Block crewmate_stand_yellow;
	static Block crewmate_stand_purple;
	static Block crewmate_stand_banana;
	static Block crewmate_stand_coral;
	static Block crewmate_stand_gray;
	static Block crewmate_stand_maroon;
	static Block crewmate_stand_brown;
	static Block crewmate_stand_tan;

	static Block crewmate_dead_red;
	static Block crewmate_dead_blue;
	static Block crewmate_dead_green;
	static Block crewmate_dead_pink;
	static Block crewmate_dead_orange;
	static Block crewmate_dead_lime;
	static Block crewmate_dead_white;
	static Block crewmate_dead_black;
	static Block crewmate_dead_rose;
	static Block crewmate_dead_cyan;
	static Block crewmate_dead_yellow;
	static Block crewmate_dead_purple;
	static Block crewmate_dead_banana;
	static Block crewmate_dead_coral;
	static Block crewmate_dead_gray;
	static Block crewmate_dead_maroon;
	static Block crewmate_dead_brown;
	static Block crewmate_dead_tan;

	//Minecraft Plushies
	static Block sheepplush;
	static Block sheepplushblack;
	static Block sheepplushblue;
	static Block sheepplushbluelight;
	static Block sheepplushbrown;
	static Block sheepplushcyan;
	static Block sheepplushgray;
	static Block sheepplushgraylight;
	static Block sheepplushgreen;
	static Block sheepplushlime;
	static Block sheepplushmagenta;
	static Block sheepplushorange;
	static Block sheepplushpink;
	static Block sheepplushpurple;
	static Block sheepplushred;
	static Block sheepplushyellow;

	static Block zombieplush;
	static Block creeperplush;
	static Block slimeplush;

	//Lockyz Dev Plushies
	static Block lmbplush;
	static Block ldevhim;
	static Block ldevhimside;

	//Furnitre
	static Block table;

	static final CreativeTabs amogusplush = (new CreativeTabs("amogusplush") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(crewmate_sit_red);
		}
	});

	static final CreativeTabs minecraftplush = (new CreativeTabs("minecraftplush") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(sheepplush);
		}
	});

	static final CreativeTabs lockyzdev = (new CreativeTabs("lockyzdev") {
		@Override
		public ItemStack getTabIconItem(){return new ItemStack(lmbplush);}
	});

	static final CreativeTabs furniture = (new CreativeTabs("furniture") {
		@Override
		public ItemStack getTabIconItem(){return new ItemStack(table);}
	});

	public static void init() {
		//Among Us Plushies
		crewmate_sit_red = new BlockBasic("crewmate_sit_red", "crewmate_sit_red", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_blue = new BlockBasic("crewmate_sit_blue", "crewmate_sit_blue", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_green = new BlockBasic("crewmate_sit_green", "crewmate_sit_green", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_pink = new BlockBasic("crewmate_sit_pink", "crewmate_sit_pink", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_orange = new BlockBasic("crewmate_sit_orange", "crewmate_sit_orange", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_lime = new BlockBasic("crewmate_sit_lime", "crewmate_sit_lime", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_white = new BlockBasic("crewmate_sit_white", "crewmate_sit_white", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_black = new BlockBasic("crewmate_sit_black", "crewmate_sit_black", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_rose = new BlockBasic("crewmate_sit_rose", "crewmate_sit_rose", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_cyan = new BlockBasic("crewmate_sit_cyan", "crewmate_sit_cyan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_yellow = new BlockBasic("crewmate_sit_yellow", "crewmate_sit_yellow", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_purple = new BlockBasic("crewmate_sit_purple", "crewmate_sit_purple", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_banana = new BlockBasic("crewmate_sit_banana", "crewmate_sit_banana", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_coral = new BlockBasic("crewmate_sit_coral", "crewmate_sit_coral", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_gray = new BlockBasic("crewmate_sit_gray", "crewmate_sit_gray", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_maroon = new BlockBasic("crewmate_sit_maroon", "crewmate_sit_maroon", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_brown = new BlockBasic("crewmate_sit_brown", "crewmate_sit_brown", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_sit_tan = new BlockBasic("crewmate_sit_tan", "crewmate_sit_tan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);

		crewmate_stand_red = new BlockBasic("crewmate_stand_red", "crewmate_stand_red", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_blue = new BlockBasic("crewmate_stand_blue", "crewmate_stand_blue", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_green = new BlockBasic("crewmate_stand_green", "crewmate_stand_green", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_pink = new BlockBasic("crewmate_stand_pink", "crewmate_stand_pink", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_orange = new BlockBasic("crewmate_stand_orange", "crewmate_stand_orange", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_lime = new BlockBasic("crewmate_stand_lime", "crewmate_stand_lime", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_white = new BlockBasic("crewmate_stand_white", "crewmate_stand_white", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_black = new BlockBasic("crewmate_stand_black", "crewmate_stand_black", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_rose = new BlockBasic("crewmate_stand_rose", "crewmate_stand_rose", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_cyan = new BlockBasic("crewmate_stand_cyan", "crewmate_stand_cyan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_yellow = new BlockBasic("crewmate_stand_yellow", "crewmate_stand_yellow", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_purple = new BlockBasic("crewmate_stand_purple", "crewmate_stand_purple", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_banana = new BlockBasic("crewmate_stand_banana", "crewmate_stand_banana", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_coral = new BlockBasic("crewmate_stand_coral", "crewmate_stand_coral", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_gray = new BlockBasic("crewmate_stand_gray", "crewmate_stand_gray", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_maroon = new BlockBasic("crewmate_stand_maroon", "crewmate_stand_maroon", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_brown = new BlockBasic("crewmate_stand_brown", "crewmate_stand_brown", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_stand_tan = new BlockBasic("crewmate_stand_tan", "crewmate_stand_tan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);

		crewmate_dead_red = new BlockBasic("crewmate_dead_red", "crewmate_dead_red", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_blue = new BlockBasic("crewmate_dead_blue", "crewmate_dead_blue", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_green = new BlockBasic("crewmate_dead_green", "crewmate_dead_green", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_pink = new BlockBasic("crewmate_dead_pink", "crewmate_dead_pink", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_orange = new BlockBasic("crewmate_dead_orange", "crewmate_dead_orange", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_lime = new BlockBasic("crewmate_dead_lime", "crewmate_dead_lime", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_white = new BlockBasic("crewmate_dead_white", "crewmate_dead_white", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_black = new BlockBasic("crewmate_dead_black", "crewmate_dead_black", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_rose = new BlockBasic("crewmate_dead_rose", "crewmate_dead_rose", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_cyan = new BlockBasic("crewmate_dead_cyan", "crewmate_dead_cyan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_yellow = new BlockBasic("crewmate_dead_yellow", "crewmate_dead_yellow", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_purple = new BlockBasic("crewmate_dead_purple", "crewmate_dead_purple", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_banana = new BlockBasic("crewmate_dead_banana", "crewmate_dead_banana", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_coral = new BlockBasic("crewmate_dead_coral", "crewmate_dead_coral", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_gray = new BlockBasic("crewmate_dead_gray", "crewmate_dead_gray", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_maroon = new BlockBasic("crewmate_dead_maroon", "crewmate_dead_maroon", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_brown = new BlockBasic("crewmate_dead_brown", "crewmate_dead_brown", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		crewmate_dead_tan = new BlockBasic("crewmate_dead_tan", "crewmate_dead_tan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);

		//Minecraft Plushies
		sheepplush = new BlockBasic("sheepplush", "sheepplush", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushblack = new BlockBasic("sheepplushblack", "sheepplushblack", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushblue = new BlockBasic("sheepplushblue", "sheepplushblue", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushbluelight = new BlockBasic("sheepplushbluelight", "sheepplushbluelight", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushbrown = new BlockBasic("sheepplushbrown", "sheepplushbrown", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushcyan = new BlockBasic("sheepplushcyan", "sheepplushcyan", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushgray = new BlockBasic("sheepplushgray", "sheepplushgray", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushgraylight = new BlockBasic("sheepplushgraylight", "sheepplushgraylight", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushgreen = new BlockBasic("sheepplushgreen", "sheepplushgreen", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushlime = new BlockBasic("sheepplushlime", "sheepplushlime", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushmagenta = new BlockBasic("sheepplushmagenta", "sheepplushmagenta", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushorange = new BlockBasic("sheepplushorange", "sheepplushorange", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushpink = new BlockBasic("sheepplushpink", "sheepplushpink", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushpurple = new BlockBasic("sheepplushpurple", "sheepplushpurple", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushred = new BlockBasic("sheepplushred", "sheepplushred", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		sheepplushyellow = new BlockBasic("sheepplushyellow", "sheepplushyellow", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);

		zombieplush = new BlockBasic("zombieplush", "zombieplush", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		creeperplush = new BlockBasic("creeperplush", "creeperplush", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
		slimeplush = new BlockBasic("slimeplush", "slimeplush", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);

		//Lockyz Dev Plushies
		lmbplush = new BlockBasic("lmbplush", "lmbplush", Material.CLOTH).setHardness(1.0f).setCreativeTab(lockyzdev);
		ldevhim = new BlockBasic("ldevhim", "ldevhim", Material.CLOTH).setHardness(1.0f);
		ldevhimside = new BlockBasic("ldevhimside", "ldevhimside", Material.CLOTH).setHardness(1.0f);

		//Furniture
		table = new BlockBasic("table", "table", Material.CLOTH).setHardness(1.0f).setCreativeTab(furniture);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		//Among Us Plushies
		event.getRegistry().registerAll(crewmate_sit_red);
		event.getRegistry().registerAll(crewmate_sit_blue);
		event.getRegistry().registerAll(crewmate_sit_green);
		event.getRegistry().registerAll(crewmate_sit_pink);
		event.getRegistry().registerAll(crewmate_sit_orange);
		event.getRegistry().registerAll(crewmate_sit_lime);
		event.getRegistry().registerAll(crewmate_sit_white);
		event.getRegistry().registerAll(crewmate_sit_black);
		event.getRegistry().registerAll(crewmate_sit_rose);
		event.getRegistry().registerAll(crewmate_sit_cyan);
		event.getRegistry().registerAll(crewmate_sit_yellow);
		event.getRegistry().registerAll(crewmate_sit_purple);
		event.getRegistry().registerAll(crewmate_sit_banana);
		event.getRegistry().registerAll(crewmate_sit_coral);
		event.getRegistry().registerAll(crewmate_sit_gray);
		event.getRegistry().registerAll(crewmate_sit_maroon);
		event.getRegistry().registerAll(crewmate_sit_brown);
		event.getRegistry().registerAll(crewmate_sit_tan);

		event.getRegistry().registerAll(crewmate_stand_red);
		event.getRegistry().registerAll(crewmate_stand_blue);
		event.getRegistry().registerAll(crewmate_stand_green);
		event.getRegistry().registerAll(crewmate_stand_pink);
		event.getRegistry().registerAll(crewmate_stand_orange);
		event.getRegistry().registerAll(crewmate_stand_lime);
		event.getRegistry().registerAll(crewmate_stand_white);
		event.getRegistry().registerAll(crewmate_stand_black);
		event.getRegistry().registerAll(crewmate_stand_rose);
		event.getRegistry().registerAll(crewmate_stand_cyan);
		event.getRegistry().registerAll(crewmate_stand_yellow);
		event.getRegistry().registerAll(crewmate_stand_purple);
		event.getRegistry().registerAll(crewmate_stand_banana);
		event.getRegistry().registerAll(crewmate_stand_coral);
		event.getRegistry().registerAll(crewmate_stand_gray);
		event.getRegistry().registerAll(crewmate_stand_maroon);
		event.getRegistry().registerAll(crewmate_stand_brown);
		event.getRegistry().registerAll(crewmate_stand_tan);

		event.getRegistry().registerAll(crewmate_dead_red);
		event.getRegistry().registerAll(crewmate_dead_blue);
		event.getRegistry().registerAll(crewmate_dead_green);
		event.getRegistry().registerAll(crewmate_dead_pink);
		event.getRegistry().registerAll(crewmate_dead_orange);
		event.getRegistry().registerAll(crewmate_dead_lime);
		event.getRegistry().registerAll(crewmate_dead_white);
		event.getRegistry().registerAll(crewmate_dead_black);
		event.getRegistry().registerAll(crewmate_dead_rose);
		event.getRegistry().registerAll(crewmate_dead_cyan);
		event.getRegistry().registerAll(crewmate_dead_yellow);
		event.getRegistry().registerAll(crewmate_dead_purple);
		event.getRegistry().registerAll(crewmate_dead_banana);
		event.getRegistry().registerAll(crewmate_dead_coral);
		event.getRegistry().registerAll(crewmate_dead_gray);
		event.getRegistry().registerAll(crewmate_dead_maroon);
		event.getRegistry().registerAll(crewmate_dead_brown);
		event.getRegistry().registerAll(crewmate_dead_tan);

		//Minecraft Plushies
		event.getRegistry().registerAll(sheepplush);
		event.getRegistry().registerAll(sheepplushblack);
		event.getRegistry().registerAll(sheepplushblue);
		event.getRegistry().registerAll(sheepplushbluelight);
		event.getRegistry().registerAll(sheepplushbrown);
		event.getRegistry().registerAll(sheepplushcyan);
		event.getRegistry().registerAll(sheepplushgray);
		event.getRegistry().registerAll(sheepplushgraylight);
		event.getRegistry().registerAll(sheepplushgreen);
		event.getRegistry().registerAll(sheepplushlime);
		event.getRegistry().registerAll(sheepplushmagenta);
		event.getRegistry().registerAll(sheepplushorange);
		event.getRegistry().registerAll(sheepplushpink);
		event.getRegistry().registerAll(sheepplushpurple);
		event.getRegistry().registerAll(sheepplushred);
		event.getRegistry().registerAll(sheepplushyellow);

		event.getRegistry().registerAll(zombieplush);
		event.getRegistry().registerAll(creeperplush);
		event.getRegistry().registerAll(slimeplush);

		//Lockyz Dev Plushies
		event.getRegistry().registerAll(lmbplush);
		event.getRegistry().registerAll(ldevhim);
		event.getRegistry().registerAll(ldevhimside);

		//Furniture
		event.getRegistry().registerAll(table);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		//Among Us Plushies
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_red).setRegistryName("crewmate_sit_red"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_blue).setRegistryName("crewmate_sit_blue"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_green).setRegistryName("crewmate_sit_green"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_pink).setRegistryName("crewmate_sit_pink"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_orange).setRegistryName("crewmate_sit_orange"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_lime).setRegistryName("crewmate_sit_lime"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_white).setRegistryName("crewmate_sit_white"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_black).setRegistryName("crewmate_sit_black"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_rose).setRegistryName("crewmate_sit_rose"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_cyan).setRegistryName("crewmate_sit_cyan"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_yellow).setRegistryName("crewmate_sit_yellow"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_purple).setRegistryName("crewmate_sit_purple"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_banana).setRegistryName("crewmate_sit_banana"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_coral).setRegistryName("crewmate_sit_coral"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_gray).setRegistryName("crewmate_sit_gray"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_maroon).setRegistryName("crewmate_sit_maroon"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_brown).setRegistryName("crewmate_sit_brown"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_sit_tan).setRegistryName("crewmate_sit_tan"));

		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_red).setRegistryName("crewmate_stand_red"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_blue).setRegistryName("crewmate_stand_blue"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_green).setRegistryName("crewmate_stand_green"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_pink).setRegistryName("crewmate_stand_pink"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_orange).setRegistryName("crewmate_stand_orange"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_lime).setRegistryName("crewmate_stand_lime"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_white).setRegistryName("crewmate_stand_white"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_black).setRegistryName("crewmate_stand_black"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_rose).setRegistryName("crewmate_stand_rose"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_cyan).setRegistryName("crewmate_stand_cyan"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_yellow).setRegistryName("crewmate_stand_yellow"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_purple).setRegistryName("crewmate_stand_purple"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_banana).setRegistryName("crewmate_stand_banana"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_coral).setRegistryName("crewmate_stand_coral"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_gray).setRegistryName("crewmate_stand_gray"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_maroon).setRegistryName("crewmate_stand_maroon"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_brown).setRegistryName("crewmate_stand_brown"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_stand_tan).setRegistryName("crewmate_stand_tan"));

		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_red).setRegistryName("crewmate_dead_red"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_blue).setRegistryName("crewmate_dead_blue"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_green).setRegistryName("crewmate_dead_green"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_pink).setRegistryName("crewmate_dead_pink"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_orange).setRegistryName("crewmate_dead_orange"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_lime).setRegistryName("crewmate_dead_lime"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_white).setRegistryName("crewmate_dead_white"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_black).setRegistryName("crewmate_dead_black"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_rose).setRegistryName("crewmate_dead_rose"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_cyan).setRegistryName("crewmate_dead_cyan"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_yellow).setRegistryName("crewmate_dead_yellow"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_purple).setRegistryName("crewmate_dead_purple"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_banana).setRegistryName("crewmate_dead_banana"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_coral).setRegistryName("crewmate_dead_coral"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_gray).setRegistryName("crewmate_dead_gray"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_maroon).setRegistryName("crewmate_dead_maroon"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_brown).setRegistryName("crewmate_dead_brown"));
		event.getRegistry().registerAll(new ItemBlock(crewmate_dead_tan).setRegistryName("crewmate_dead_tan"));

		//Minecraft Plushies
		event.getRegistry().registerAll(new ItemBlock(sheepplush).setRegistryName("sheepplush"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushblack).setRegistryName("sheepplushblack"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushblue).setRegistryName("sheepplushblue"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushbluelight).setRegistryName("sheepplushbluelight"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushbrown).setRegistryName("sheepplushbrown"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushcyan).setRegistryName("sheepplushcyan"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushgray).setRegistryName("sheepplushgray"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushgraylight).setRegistryName("sheepplushgraylight"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushgreen).setRegistryName("sheepplushgreen"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushlime).setRegistryName("sheepplushlime"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushmagenta).setRegistryName("sheepplushmagenta"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushorange).setRegistryName("sheepplushorange"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushpink).setRegistryName("sheepplushpink"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushpurple).setRegistryName("sheepplushpurple"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushred).setRegistryName("sheepplushred"));
		event.getRegistry().registerAll(new ItemBlock(sheepplushyellow).setRegistryName("sheepplushyellow"));

		event.getRegistry().registerAll(new ItemBlock(zombieplush).setRegistryName("zombieplush"));
		event.getRegistry().registerAll(new ItemBlock(creeperplush).setRegistryName("creeperplush"));
		event.getRegistry().registerAll(new ItemBlock(slimeplush).setRegistryName("slimeplush"));

		//Lockyz Dev Plushies
		event.getRegistry().registerAll(new ItemBlock(lmbplush).setRegistryName("lmbplush"));
		event.getRegistry().registerAll(new ItemBlock(ldevhim).setRegistryName("ldevhim"));
		event.getRegistry().registerAll(new ItemBlock(ldevhimside).setRegistryName("ldevhimside"));

		//Furniture
		event.getRegistry().registerAll(new ItemBlock(table).setRegistryName("table"));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		//Among Us Plushies
		registerRender(Item.getItemFromBlock(crewmate_sit_red));
		registerRender(Item.getItemFromBlock(crewmate_sit_blue));
		registerRender(Item.getItemFromBlock(crewmate_sit_green));
		registerRender(Item.getItemFromBlock(crewmate_sit_pink));
		registerRender(Item.getItemFromBlock(crewmate_sit_orange));
		registerRender(Item.getItemFromBlock(crewmate_sit_lime));
		registerRender(Item.getItemFromBlock(crewmate_sit_white));
		registerRender(Item.getItemFromBlock(crewmate_sit_black));
		registerRender(Item.getItemFromBlock(crewmate_sit_rose));
		registerRender(Item.getItemFromBlock(crewmate_sit_cyan));
		registerRender(Item.getItemFromBlock(crewmate_sit_yellow));
		registerRender(Item.getItemFromBlock(crewmate_sit_purple));
		registerRender(Item.getItemFromBlock(crewmate_sit_banana));
		registerRender(Item.getItemFromBlock(crewmate_sit_coral));
		registerRender(Item.getItemFromBlock(crewmate_sit_gray));
		registerRender(Item.getItemFromBlock(crewmate_sit_maroon));
		registerRender(Item.getItemFromBlock(crewmate_sit_brown));
		registerRender(Item.getItemFromBlock(crewmate_sit_tan));

		registerRender(Item.getItemFromBlock(crewmate_stand_red));
		registerRender(Item.getItemFromBlock(crewmate_stand_blue));
		registerRender(Item.getItemFromBlock(crewmate_stand_green));
		registerRender(Item.getItemFromBlock(crewmate_stand_pink));
		registerRender(Item.getItemFromBlock(crewmate_stand_orange));
		registerRender(Item.getItemFromBlock(crewmate_stand_lime));
		registerRender(Item.getItemFromBlock(crewmate_stand_white));
		registerRender(Item.getItemFromBlock(crewmate_stand_black));
		registerRender(Item.getItemFromBlock(crewmate_stand_rose));
		registerRender(Item.getItemFromBlock(crewmate_stand_cyan));
		registerRender(Item.getItemFromBlock(crewmate_stand_yellow));
		registerRender(Item.getItemFromBlock(crewmate_stand_purple));
		registerRender(Item.getItemFromBlock(crewmate_stand_banana));
		registerRender(Item.getItemFromBlock(crewmate_stand_coral));
		registerRender(Item.getItemFromBlock(crewmate_stand_gray));
		registerRender(Item.getItemFromBlock(crewmate_stand_maroon));
		registerRender(Item.getItemFromBlock(crewmate_stand_brown));
		registerRender(Item.getItemFromBlock(crewmate_stand_tan));

		registerRender(Item.getItemFromBlock(crewmate_dead_red));
		registerRender(Item.getItemFromBlock(crewmate_dead_blue));
		registerRender(Item.getItemFromBlock(crewmate_dead_green));
		registerRender(Item.getItemFromBlock(crewmate_dead_pink));
		registerRender(Item.getItemFromBlock(crewmate_dead_orange));
		registerRender(Item.getItemFromBlock(crewmate_dead_lime));
		registerRender(Item.getItemFromBlock(crewmate_dead_white));
		registerRender(Item.getItemFromBlock(crewmate_dead_black));
		registerRender(Item.getItemFromBlock(crewmate_dead_rose));
		registerRender(Item.getItemFromBlock(crewmate_dead_cyan));
		registerRender(Item.getItemFromBlock(crewmate_dead_yellow));
		registerRender(Item.getItemFromBlock(crewmate_dead_purple));
		registerRender(Item.getItemFromBlock(crewmate_dead_banana));
		registerRender(Item.getItemFromBlock(crewmate_dead_coral));
		registerRender(Item.getItemFromBlock(crewmate_dead_gray));
		registerRender(Item.getItemFromBlock(crewmate_dead_maroon));
		registerRender(Item.getItemFromBlock(crewmate_dead_brown));
		registerRender(Item.getItemFromBlock(crewmate_dead_tan));

		//Minecraft Plushies
		registerRender(Item.getItemFromBlock(sheepplush));
		registerRender(Item.getItemFromBlock(sheepplushblack));
		registerRender(Item.getItemFromBlock(sheepplushblue));
		registerRender(Item.getItemFromBlock(sheepplushbluelight));
		registerRender(Item.getItemFromBlock(sheepplushbrown));
		registerRender(Item.getItemFromBlock(sheepplushcyan));
		registerRender(Item.getItemFromBlock(sheepplushgray));
		registerRender(Item.getItemFromBlock(sheepplushgraylight));
		registerRender(Item.getItemFromBlock(sheepplushgreen));
		registerRender(Item.getItemFromBlock(sheepplushlime));
		registerRender(Item.getItemFromBlock(sheepplushmagenta));
		registerRender(Item.getItemFromBlock(sheepplushorange));
		registerRender(Item.getItemFromBlock(sheepplushpink));
		registerRender(Item.getItemFromBlock(sheepplushpurple));
		registerRender(Item.getItemFromBlock(sheepplushred));
		registerRender(Item.getItemFromBlock(sheepplushyellow));

		registerRender(Item.getItemFromBlock(zombieplush));
		registerRender(Item.getItemFromBlock(creeperplush));
		registerRender(Item.getItemFromBlock(slimeplush));

		//Lockyz Dev Plushies
		registerRender(Item.getItemFromBlock(lmbplush));
		registerRender(Item.getItemFromBlock(ldevhim));
		registerRender(Item.getItemFromBlock(ldevhimside));

		//Furniture
		registerRender(Item.getItemFromBlock(table));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}