package net.lockyzdev.plushycraft.init;

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

import net.lockyzdev.plushycraft.Main;
import net.lockyzdev.plushycraft.blocks.BlockBasic;

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

	static Block amogusplushstandred;
	static Block amogusplushstandblue;
	static Block amogusplushstandgreen;
	static Block amogusplushstandpink;
	static Block amogusplushstandorange;
	static Block amogusplushstandlime;
	static Block amogusplushstandwhite;
	static Block amogusplushstandblack;

	//Minecraft Plushies
	static Block sheepplush;

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

		amogusplushstandred = new BlockBasic("amogusplushstandred", "amogusplushstandred", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandblue = new BlockBasic("amogusplushstandblue", "amogusplushstandblue", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandgreen = new BlockBasic("amogusplushstandgreen", "amogusplushstandgreen", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandpink = new BlockBasic("amogusplushstandpink", "amogusplushstandpink", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandorange = new BlockBasic("amogusplushstandorange", "amogusplushstandorange", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandlime = new BlockBasic("amogusplushstandlime", "amogusplushstandlime", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandwhite = new BlockBasic("amogusplushstandwhite", "amogusplushstandwhite", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);
		amogusplushstandblack = new BlockBasic("amogusplushstandblack", "amogusplushstandblack", Material.CLOTH).setHardness(1.0f).setCreativeTab(amogusplush);

		//Minecraft Plushies
		sheepplush = new BlockBasic("sheepplush", "sheepplush", Material.CLOTH).setHardness(1.0f).setCreativeTab(minecraftplush);
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

		event.getRegistry().registerAll(amogusplushstandred);
		event.getRegistry().registerAll(amogusplushstandblue);
		event.getRegistry().registerAll(amogusplushstandgreen);
		event.getRegistry().registerAll(amogusplushstandpink);
		event.getRegistry().registerAll(amogusplushstandorange);
		event.getRegistry().registerAll(amogusplushstandlime);
		event.getRegistry().registerAll(amogusplushstandwhite);
		event.getRegistry().registerAll(amogusplushstandblack);

		//Minecraft Plushies
		event.getRegistry().registerAll(sheepplush);
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

		event.getRegistry().registerAll(new ItemBlock(amogusplushstandred).setRegistryName("amogusplushstandred"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandblue).setRegistryName("amogusplushstandblue"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandgreen).setRegistryName("amogusplushstandgreen"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandpink).setRegistryName("amogusplushstandpink"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandorange).setRegistryName("amogusplushstandorange"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandlime).setRegistryName("amogusplushstandlime"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandwhite).setRegistryName("amogusplushstandwhite"));
		event.getRegistry().registerAll(new ItemBlock(amogusplushstandblack).setRegistryName("amogusplushstandblack"));

		//Minecraft Plushies
		event.getRegistry().registerAll(new ItemBlock(sheepplush).setRegistryName("sheepplush"));
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

		registerRender(Item.getItemFromBlock(amogusplushstandred));
		registerRender(Item.getItemFromBlock(amogusplushstandblue));
		registerRender(Item.getItemFromBlock(amogusplushstandgreen));
		registerRender(Item.getItemFromBlock(amogusplushstandpink));
		registerRender(Item.getItemFromBlock(amogusplushstandorange));
		registerRender(Item.getItemFromBlock(amogusplushstandlime));
		registerRender(Item.getItemFromBlock(amogusplushstandwhite));
		registerRender(Item.getItemFromBlock(amogusplushstandblack));

		//Minecraft Plushies
		registerRender(Item.getItemFromBlock(sheepplush));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}