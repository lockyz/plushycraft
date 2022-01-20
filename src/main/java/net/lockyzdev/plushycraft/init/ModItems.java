package net.lockyzdev.plushycraft.init;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.lockyzdev.plushycraft.Main;
import net.lockyzdev.plushycraft.items.ItemBasic;

@Mod.EventBusSubscriber(modid= Main.MODID)
public class ModItems {
	//Misc Items
	static Item stuffing;

	//Fabrics
	/*static Item fabricWhite;
	static Item fabricOrange;
	static Item fabricMagenta;
	static Item fabricLightBlue;
	static Item fabricYellow;
	static Item fabricLime;
	static Item fabricPink;
	static Item fabricGray;
	static Item fabricLightGray;
	static Item fabricCyan;
	static Item fabricPurple;
	static Item fabricBlue;
	static Item fabricBrown;
	static Item fabricGreen;
	static Item fabricRed;
	static Item fabricBlack;*/
	
	static final CreativeTabs plushycraft = (new CreativeTabs("plushycraft") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(stuffing);
		}
	});
	
	public static void init() {
		//Misc Items
		stuffing = new ItemBasic("stuffing").setCreativeTab(plushycraft).setMaxStackSize(64);

		//Fabrics
		/*fabricWhite = new ItemBasic("fabricWhite").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricOrange = new ItemBasic("fabricOrange").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricMagenta = new ItemBasic("fabricMagenta").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricLightBlue = new ItemBasic("fabricLightBlue").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricYellow = new ItemBasic("fabricYellow").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricLime = new ItemBasic("fabricLime").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricPink = new ItemBasic("fabricPink").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricGray = new ItemBasic("fabricGray").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricLightGray = new ItemBasic("fabricLightGray").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricCyan = new ItemBasic("fabricCyan").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricPurple = new ItemBasic("fabricPurple").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricBlue = new ItemBasic("fabricBlue").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricBrown = new ItemBasic("fabricBrown").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricGreen = new ItemBasic("fabricGreen").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricRed = new ItemBasic("fabricRed").setCreativeTab(plushycraft).setMaxStackSize(64);
		fabricBlack = new ItemBasic("fabricBlack").setCreativeTab(plushycraft).setMaxStackSize(64);*/
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		//Misc Items
		event.getRegistry().registerAll(stuffing);

		//Fabrics
		/*event.getRegistry().registerAll(fabricWhite);
		event.getRegistry().registerAll(fabricOrange);
		event.getRegistry().registerAll(fabricMagenta);
		event.getRegistry().registerAll(fabricLightBlue);
		event.getRegistry().registerAll(fabricYellow);
		event.getRegistry().registerAll(fabricLime);
		event.getRegistry().registerAll(fabricPink);
		event.getRegistry().registerAll(fabricGray);
		event.getRegistry().registerAll(fabricLightGray);
		event.getRegistry().registerAll(fabricCyan);
		event.getRegistry().registerAll(fabricPurple);
		event.getRegistry().registerAll(fabricBlue);
		event.getRegistry().registerAll(fabricBrown);
		event.getRegistry().registerAll(fabricGreen);
		event.getRegistry().registerAll(fabricRed);
		event.getRegistry().registerAll(fabricBlack);*/
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		//Misc Items
		registerRender(stuffing);

		//Fabrics
		/*registerRender(fabricWhite);
		registerRender(fabricOrange);
		registerRender(fabricMagenta);
		registerRender(fabricLightBlue);
		registerRender(fabricYellow);
		registerRender(fabricLime);
		registerRender(fabricPink);
		registerRender(fabricGray);
		registerRender(fabricLightGray);
		registerRender(fabricCyan);
		registerRender(fabricPurple);
		registerRender(fabricBlue);
		registerRender(fabricBrown);
		registerRender(fabricGreen);
		registerRender(fabricRed);
		registerRender(fabricBlack);*/
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
