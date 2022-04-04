package net.lockyzdev.toycraft.init;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.lockyzdev.toycraft.Main;
import net.lockyzdev.toycraft.items.ItemBasic;

@Mod.EventBusSubscriber(modid= Main.MODID)
public class ModItems {
	//Misc Items
	static Item stuffing;

	//Fabrics
	static Item fabricWhite;
	static Item fabricOrange;
	static Item fabricMagenta;
	static Item fabricBlueLight;
	static Item fabricYellow;
	static Item fabricLime;
	static Item fabricPink;
	static Item fabricGray;
	static Item fabricGrayLight;
	static Item fabricCyan;
	static Item fabricPurple;
	static Item fabricBlue;
	static Item fabricBrown;
	static Item fabricGreen;
	static Item fabricRed;
	static Item fabricBlack;
	static Item fabricBanana;
	static Item fabricCoral;
	static Item fabricMaroon;
	static Item fabricRose;
	static Item fabricTan;
	
	static final CreativeTabs toycraft = (new CreativeTabs("toycraft") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(stuffing);
		}
	});
	
	public static void init() {
		//Misc Items
		stuffing = new ItemBasic("stuffing").setCreativeTab(toycraft).setMaxStackSize(64);

		//Fabrics
		fabricWhite = new ItemBasic("fabricWhite").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricOrange = new ItemBasic("fabricOrange").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricMagenta = new ItemBasic("fabricMagenta").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricBlueLight = new ItemBasic("fabricBlueLight").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricYellow = new ItemBasic("fabricYellow").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricLime = new ItemBasic("fabricLime").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricPink = new ItemBasic("fabricPink").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricGray = new ItemBasic("fabricGray").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricGrayLight = new ItemBasic("fabricGrayLight").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricCyan = new ItemBasic("fabricCyan").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricPurple = new ItemBasic("fabricPurple").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricBlue = new ItemBasic("fabricBlue").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricBrown = new ItemBasic("fabricBrown").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricGreen = new ItemBasic("fabricGreen").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricRed = new ItemBasic("fabricRed").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricBlack = new ItemBasic("fabricBlack").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricBanana = new ItemBasic("fabricBanana").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricCoral = new ItemBasic("fabricCoral").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricMaroon = new ItemBasic("fabricMaroon").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricRose = new ItemBasic("fabricRose").setCreativeTab(toycraft).setMaxStackSize(64);
		fabricTan = new ItemBasic("fabricTan").setCreativeTab(toycraft).setMaxStackSize(64);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		//Misc Items
		event.getRegistry().registerAll(stuffing);

		//Fabrics
		event.getRegistry().registerAll(fabricWhite);
		event.getRegistry().registerAll(fabricOrange);
		event.getRegistry().registerAll(fabricMagenta);
		event.getRegistry().registerAll(fabricBlueLight);
		event.getRegistry().registerAll(fabricYellow);
		event.getRegistry().registerAll(fabricLime);
		event.getRegistry().registerAll(fabricPink);
		event.getRegistry().registerAll(fabricGray);
		event.getRegistry().registerAll(fabricGrayLight);
		event.getRegistry().registerAll(fabricCyan);
		event.getRegistry().registerAll(fabricPurple);
		event.getRegistry().registerAll(fabricBlue);
		event.getRegistry().registerAll(fabricBrown);
		event.getRegistry().registerAll(fabricGreen);
		event.getRegistry().registerAll(fabricRed);
		event.getRegistry().registerAll(fabricBlack);
		event.getRegistry().registerAll(fabricBanana);
		event.getRegistry().registerAll(fabricCoral);
		event.getRegistry().registerAll(fabricMaroon);
		event.getRegistry().registerAll(fabricRose);
		event.getRegistry().registerAll(fabricTan);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		//Misc Items
		registerRender(stuffing);

		//Fabrics
		registerRender(fabricWhite);
		registerRender(fabricOrange);
		registerRender(fabricMagenta);
		registerRender(fabricBlueLight);
		registerRender(fabricYellow);
		registerRender(fabricLime);
		registerRender(fabricPink);
		registerRender(fabricGray);
		registerRender(fabricGrayLight);
		registerRender(fabricCyan);
		registerRender(fabricPurple);
		registerRender(fabricBlue);
		registerRender(fabricBrown);
		registerRender(fabricGreen);
		registerRender(fabricRed);
		registerRender(fabricBlack);
		registerRender(fabricBanana);
		registerRender(fabricCoral);
		registerRender(fabricMaroon);
		registerRender(fabricRose);
		registerRender(fabricTan);

	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
