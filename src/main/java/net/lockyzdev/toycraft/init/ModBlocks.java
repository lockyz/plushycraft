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
	static Block amogusplushsitred;
	static Block amogusplushsitblue;
	static Block amogusplushsitgreen;
	static Block amogusplushsitpink;
	static Block amogusplushsitorange;
	static Block amogusplushsitlime;
	static Block amogusplushsitwhite;
	static Block amogusplushsitblack;
	static Block amogusplushsitrose;
	static Block amogusplushsitcyan;
	static Block amogusplushsityellow;
	static Block amogusplushsitpurple;
	static Block amogusplushsitbanana;
	static Block amogusplushsitcoral;
	static Block amogusplushsitgray;
	static Block amogusplushsitmaroon;
	static Block amogusplushsitbrown;
	static Block amogusplushsittan;

	static Block amogusplushstandred;
	static Block amogusplushstandblue;
	static Block amogusplushstandgreen;
	static Block amogusplushstandpink;
	static Block amogusplushstandorange;
	static Block amogusplushstandlime;
	static Block amogusplushstandwhite;
	static Block amogusplushstandblack;
	static Block amogusplushstandrose;
	static Block amogusplushstandcyan;
	static Block amogusplushstandyellow;
	static Block amogusplushstandpurple;
	static Block amogusplushstandbanana;
	static Block amogusplushstandcoral;
	static Block amogusplushstandgray;
	static Block amogusplushstandmaroon;
	static Block amogusplushstandbrown;
	static Block amogusplushstandtan;

	static Block amogusplushdeadred;
	static Block amogusplushdeadblue;
	static Block amogusplushdeadgreen;
	static Block amogusplushdeadpink;
	static Block amogusplushdeadorange;
	static Block amogusplushdeadlime;
	static Block amogusplushdeadwhite;
	static Block amogusplushdeadblack;
	static Block amogusplushdeadrose;
	static Block amogusplushdeadcyan;
	static Block amogusplushdeadyellow;
	static Block amogusplushdeadpurple;
	static Block amogusplushdeadbanana;
	static Block amogusplushdeadcoral;
	static Block amogusplushdeadgray;
	static Block amogusplushdeadmaroon;
	static Block amogusplushdeadbrown;
	static Block amogusplushdeadtan;

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

	static final CreativeTabs amogusplush = (new CreativeTabs("amogusplush") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(amogusplushsitred);
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

	public static void init() {
		//Among Us Plushies
		amogusplushsitred = new BlockBasic("amogusplushsitred", "amogusplushsitred", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitblue = new BlockBasic("amogusplushsitblue", "amogusplushsitblue", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitgreen = new BlockBasic("amogusplushsitgreen", "amogusplushsitgreen", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitpink = new BlockBasic("amogusplushsitpink", "amogusplushsitpink", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitorange = new BlockBasic("amogusplushsitorange", "amogusplushsitorange", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitlime = new BlockBasic("amogusplushsitlime", "amogusplushsitlime", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitwhite = new BlockBasic("amogusplushsitwhite", "amogusplushsitwhite", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitblack = new BlockBasic("amogusplushsitblack", "amogusplushsitblack", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitrose = new BlockBasic("amogusplushsitrose", "amogusplushsitrose", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitcyan = new BlockBasic("amogusplushsitcyan", "amogusplushsitcyan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsityellow = new BlockBasic("amogusplushsityellow", "amogusplushsityellow", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitpurple = new BlockBasic("amogusplushsitpurple", "amogusplushsitpurple", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitbanana = new BlockBasic("amogusplushsitbanana", "amogusplushsitbanana", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitcoral = new BlockBasic("amogusplushsitcoral", "amogusplushsitcoral", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitgray = new BlockBasic("amogusplushsitgray", "amogusplushsitgray", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitmaroon = new BlockBasic("amogusplushsitmaroon", "amogusplushsitmaroon", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsitbrown = new BlockBasic("amogusplushsitbrown", "amogusplushsitbrown", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushsittan = new BlockBasic("amogusplushsittan", "amogusplushsittan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);

		amogusplushstandred = new BlockBasic("amogusplushstandred", "amogusplushstandred", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandblue = new BlockBasic("amogusplushstandblue", "amogusplushstandblue", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandgreen = new BlockBasic("amogusplushstandgreen", "amogusplushstandgreen", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandpink = new BlockBasic("amogusplushstandpink", "amogusplushstandpink", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandorange = new BlockBasic("amogusplushstandorange", "amogusplushstandorange", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandlime = new BlockBasic("amogusplushstandlime", "amogusplushstandlime", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandwhite = new BlockBasic("amogusplushstandwhite", "amogusplushstandwhite", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandblack = new BlockBasic("amogusplushstandblack", "amogusplushstandblack", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandrose = new BlockBasic("amogusplushstandrose", "amogusplushstandrose", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandcyan = new BlockBasic("amogusplushstandcyan", "amogusplushstandcyan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandyellow = new BlockBasic("amogusplushstandyellow", "amogusplushstandyellow", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandpurple = new BlockBasic("amogusplushstandpurple", "amogusplushstandpurple", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandbanana = new BlockBasic("amogusplushstandbanana", "amogusplushstandbanana", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandcoral = new BlockBasic("amogusplushstandcoral", "amogusplushstandcoral", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandgray = new BlockBasic("amogusplushstandgray", "amogusplushstandgray", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandmaroon = new BlockBasic("amogusplushstandmaroon", "amogusplushstandmaroon", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandbrown = new BlockBasic("amogusplushstandbrown", "amogusplushstandbrown", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandtan = new BlockBasic("amogusplushstandtan", "amogusplushstandtan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);

		amogusplushdeadred = new BlockBasic("amogusplushdeadred", "amogusplushdeadred", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadblue = new BlockBasic("amogusplushdeadblue", "amogusplushdeadblue", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadgreen = new BlockBasic("amogusplushdeadgreen", "amogusplushdeadgreen", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadpink = new BlockBasic("amogusplushdeadpink", "amogusplushdeadpink", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadorange = new BlockBasic("amogusplushdeadorange", "amogusplushdeadorange", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadlime = new BlockBasic("amogusplushdeadlime", "amogusplushdeadlime", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadwhite = new BlockBasic("amogusplushdeadwhite", "amogusplushdeadwhite", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadblack = new BlockBasic("amogusplushdeadblack", "amogusplushdeadblack", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadrose = new BlockBasic("amogusplushdeadrose", "amogusplushdeadrose", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadcyan = new BlockBasic("amogusplushdeadcyan", "amogusplushdeadcyan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadyellow = new BlockBasic("amogusplushdeadyellow", "amogusplushdeadyellow", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadpurple = new BlockBasic("amogusplushdeadpurple", "amogusplushdeadpurple", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadbanana = new BlockBasic("amogusplushdeadbanana", "amogusplushdeadbanana", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadcoral = new BlockBasic("amogusplushdeadcoral", "amogusplushdeadcoral", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadgray = new BlockBasic("amogusplushdeadgray", "amogusplushdeadgray", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadmaroon = new BlockBasic("amogusplushdeadmaroon", "amogusplushdeadmaroon", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadbrown = new BlockBasic("amogusplushdeadbrown", "amogusplushdeadbrown", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushdeadtan = new BlockBasic("amogusplushdeadtan", "amogusplushdeadtan", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);

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
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		//Among Us Plushies
		event.getRegistry().registerAll(amogusplushsitred);
		event.getRegistry().registerAll(amogusplushsitblue);
		event.getRegistry().registerAll(amogusplushsitgreen);
		event.getRegistry().registerAll(amogusplushsitpink);
		event.getRegistry().registerAll(amogusplushsitorange);
		event.getRegistry().registerAll(amogusplushsitlime);
		event.getRegistry().registerAll(amogusplushsitwhite);
		event.getRegistry().registerAll(amogusplushsitblack);
		event.getRegistry().registerAll(amogusplushsitrose);
		event.getRegistry().registerAll(amogusplushsitcyan);
		event.getRegistry().registerAll(amogusplushsityellow);
		event.getRegistry().registerAll(amogusplushsitpurple);
		event.getRegistry().registerAll(amogusplushsitbanana);
		event.getRegistry().registerAll(amogusplushsitcoral);
		event.getRegistry().registerAll(amogusplushsitgray);
		event.getRegistry().registerAll(amogusplushsitmaroon);
		event.getRegistry().registerAll(amogusplushsitbrown);
		event.getRegistry().registerAll(amogusplushsittan);

		event.getRegistry().registerAll(amogusplushstandred);
		event.getRegistry().registerAll(amogusplushstandblue);
		event.getRegistry().registerAll(amogusplushstandgreen);
		event.getRegistry().registerAll(amogusplushstandpink);
		event.getRegistry().registerAll(amogusplushstandorange);
		event.getRegistry().registerAll(amogusplushstandlime);
		event.getRegistry().registerAll(amogusplushstandwhite);
		event.getRegistry().registerAll(amogusplushstandblack);
		event.getRegistry().registerAll(amogusplushstandrose);
		event.getRegistry().registerAll(amogusplushstandcyan);
		event.getRegistry().registerAll(amogusplushstandyellow);
		event.getRegistry().registerAll(amogusplushstandpurple);
		event.getRegistry().registerAll(amogusplushstandbanana);
		event.getRegistry().registerAll(amogusplushstandcoral);
		event.getRegistry().registerAll(amogusplushstandgray);
		event.getRegistry().registerAll(amogusplushstandmaroon);
		event.getRegistry().registerAll(amogusplushstandbrown);
		event.getRegistry().registerAll(amogusplushstandtan);

		event.getRegistry().registerAll(amogusplushdeadred);
		event.getRegistry().registerAll(amogusplushdeadblue);
		event.getRegistry().registerAll(amogusplushdeadgreen);
		event.getRegistry().registerAll(amogusplushdeadpink);
		event.getRegistry().registerAll(amogusplushdeadorange);
		event.getRegistry().registerAll(amogusplushdeadlime);
		event.getRegistry().registerAll(amogusplushdeadwhite);
		event.getRegistry().registerAll(amogusplushdeadblack);
		event.getRegistry().registerAll(amogusplushdeadrose);
		event.getRegistry().registerAll(amogusplushdeadcyan);
		event.getRegistry().registerAll(amogusplushdeadyellow);
		event.getRegistry().registerAll(amogusplushdeadpurple);
		event.getRegistry().registerAll(amogusplushdeadbanana);
		event.getRegistry().registerAll(amogusplushdeadcoral);
		event.getRegistry().registerAll(amogusplushdeadgray);
		event.getRegistry().registerAll(amogusplushdeadmaroon);
		event.getRegistry().registerAll(amogusplushdeadbrown);
		event.getRegistry().registerAll(amogusplushdeadtan);

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
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		//Among Us Plushies
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitred).setRegistryName("amogusplushsitred"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitblue).setRegistryName("amogusplushsitblue"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitgreen).setRegistryName("amogusplushsitgreen"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitpink).setRegistryName("amogusplushsitpink"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitorange).setRegistryName("amogusplushsitorange"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitlime).setRegistryName("amogusplushsitlime"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitwhite).setRegistryName("amogusplushsitwhite"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitblack).setRegistryName("amogusplushsitblack"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitrose).setRegistryName("amogusplushsitrose"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitcyan).setRegistryName("amogusplushsitcyan"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsityellow).setRegistryName("amogusplushsityellow"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitpurple).setRegistryName("amogusplushsitpurple"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitbanana).setRegistryName("amogusplushsitbanana"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitcoral).setRegistryName("amogusplushsitcoral"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitgray).setRegistryName("amogusplushsitgray"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitmaroon).setRegistryName("amogusplushsitmaroon"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsitbrown).setRegistryName("amogusplushsitbrown"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushsittan).setRegistryName("amogusplushsittan"));

		event.getRegistry().registerAll(new ItemBlock(amogusplushstandred).setRegistryName("amogusplushstandred"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandblue).setRegistryName("amogusplushstandblue"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandgreen).setRegistryName("amogusplushstandgreen"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandpink).setRegistryName("amogusplushstandpink"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandorange).setRegistryName("amogusplushstandorange"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandlime).setRegistryName("amogusplushstandlime"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandwhite).setRegistryName("amogusplushstandwhite"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandblack).setRegistryName("amogusplushstandblack"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandrose).setRegistryName("amogusplushstandrose"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandcyan).setRegistryName("amogusplushstandcyan"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandyellow).setRegistryName("amogusplushstandyellow"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandpurple).setRegistryName("amogusplushstandpurple"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandbanana).setRegistryName("amogusplushstandbanana"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandcoral).setRegistryName("amogusplushstandcoral"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandgray).setRegistryName("amogusplushstandgray"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandmaroon).setRegistryName("amogusplushstandmaroon"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandbrown).setRegistryName("amogusplushstandbrown"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandtan).setRegistryName("amogusplushstandtan"));

		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadred).setRegistryName("amogusplushdeadred"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadblue).setRegistryName("amogusplushdeadblue"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadgreen).setRegistryName("amogusplushdeadgreen"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadpink).setRegistryName("amogusplushdeadpink"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadorange).setRegistryName("amogusplushdeadorange"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadlime).setRegistryName("amogusplushdeadlime"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadwhite).setRegistryName("amogusplushdeadwhite"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadblack).setRegistryName("amogusplushdeadblack"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadrose).setRegistryName("amogusplushdeadrose"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadcyan).setRegistryName("amogusplushdeadcyan"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadyellow).setRegistryName("amogusplushdeadyellow"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadpurple).setRegistryName("amogusplushdeadpurple"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadbanana).setRegistryName("amogusplushdeadbanana"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadcoral).setRegistryName("amogusplushdeadcoral"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadgray).setRegistryName("amogusplushdeadgray"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadmaroon).setRegistryName("amogusplushdeadmaroon"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadbrown).setRegistryName("amogusplushdeadbrown"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushdeadtan).setRegistryName("amogusplushdeadtan"));

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

	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		//Among Us Plushies
		registerRender(Item.getItemFromBlock(amogusplushsitred));
		registerRender(Item.getItemFromBlock(amogusplushsitblue));
		registerRender(Item.getItemFromBlock(amogusplushsitgreen));
		registerRender(Item.getItemFromBlock(amogusplushsitpink));
		registerRender(Item.getItemFromBlock(amogusplushsitorange));
		registerRender(Item.getItemFromBlock(amogusplushsitlime));
		registerRender(Item.getItemFromBlock(amogusplushsitwhite));
		registerRender(Item.getItemFromBlock(amogusplushsitblack));
		registerRender(Item.getItemFromBlock(amogusplushsitrose));
		registerRender(Item.getItemFromBlock(amogusplushsitcyan));
		registerRender(Item.getItemFromBlock(amogusplushsityellow));
		registerRender(Item.getItemFromBlock(amogusplushsitpurple));
		registerRender(Item.getItemFromBlock(amogusplushsitbanana));
		registerRender(Item.getItemFromBlock(amogusplushsitcoral));
		registerRender(Item.getItemFromBlock(amogusplushsitgray));
		registerRender(Item.getItemFromBlock(amogusplushsitmaroon));
		registerRender(Item.getItemFromBlock(amogusplushsitbrown));
		registerRender(Item.getItemFromBlock(amogusplushsittan));

		registerRender(Item.getItemFromBlock(amogusplushstandred));
		registerRender(Item.getItemFromBlock(amogusplushstandblue));
		registerRender(Item.getItemFromBlock(amogusplushstandgreen));
		registerRender(Item.getItemFromBlock(amogusplushstandpink));
		registerRender(Item.getItemFromBlock(amogusplushstandorange));
		registerRender(Item.getItemFromBlock(amogusplushstandlime));
		registerRender(Item.getItemFromBlock(amogusplushstandwhite));
		registerRender(Item.getItemFromBlock(amogusplushstandblack));
		registerRender(Item.getItemFromBlock(amogusplushstandrose));
		registerRender(Item.getItemFromBlock(amogusplushstandcyan));
		registerRender(Item.getItemFromBlock(amogusplushstandyellow));
		registerRender(Item.getItemFromBlock(amogusplushstandpurple));
		registerRender(Item.getItemFromBlock(amogusplushstandbanana));
		registerRender(Item.getItemFromBlock(amogusplushstandcoral));
		registerRender(Item.getItemFromBlock(amogusplushstandgray));
		registerRender(Item.getItemFromBlock(amogusplushstandmaroon));
		registerRender(Item.getItemFromBlock(amogusplushstandbrown));
		registerRender(Item.getItemFromBlock(amogusplushstandtan));

		registerRender(Item.getItemFromBlock(amogusplushdeadred));
		registerRender(Item.getItemFromBlock(amogusplushdeadblue));
		registerRender(Item.getItemFromBlock(amogusplushdeadgreen));
		registerRender(Item.getItemFromBlock(amogusplushdeadpink));
		registerRender(Item.getItemFromBlock(amogusplushdeadorange));
		registerRender(Item.getItemFromBlock(amogusplushdeadlime));
		registerRender(Item.getItemFromBlock(amogusplushdeadwhite));
		registerRender(Item.getItemFromBlock(amogusplushdeadblack));
		registerRender(Item.getItemFromBlock(amogusplushdeadrose));
		registerRender(Item.getItemFromBlock(amogusplushdeadcyan));
		registerRender(Item.getItemFromBlock(amogusplushdeadyellow));
		registerRender(Item.getItemFromBlock(amogusplushdeadpurple));
		registerRender(Item.getItemFromBlock(amogusplushdeadbanana));
		registerRender(Item.getItemFromBlock(amogusplushdeadcoral));
		registerRender(Item.getItemFromBlock(amogusplushdeadgray));
		registerRender(Item.getItemFromBlock(amogusplushdeadmaroon));
		registerRender(Item.getItemFromBlock(amogusplushdeadbrown));
		registerRender(Item.getItemFromBlock(amogusplushdeadtan));

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
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}