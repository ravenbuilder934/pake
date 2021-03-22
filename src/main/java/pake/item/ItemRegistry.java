package pake.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import pake.Pake;

import static pake.block.BlockRegistry.applepie;
import static pake.block.BlockRegistry.sweetberrypie;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Pake.MOD_ID);

    public static final RegistryObject<Item> sweetberrypie_item = ITEMS.register("sweetberrypie", () -> new BlockItem(sweetberrypie.get(), new Item.Properties().tab(ItemGroup.TAB_FOOD)));

    public static final RegistryObject<Item> cookedsweetberries = ITEMS.register("cookedsweetberries", () -> new Item((new Item.Properties()).tab(ItemGroup.TAB_FOOD).food(FoodRegistry.COOKEDSWEETBERRIES)));

    public static final RegistryObject<SweetBerryJamItem> sweetberryjam = ITEMS.register("sweetberryjam", () -> new SweetBerryJamItem((new Item.Properties()).tab(ItemGroup.TAB_FOOD).craftRemainder(Items.GLASS_BOTTLE).food(FoodRegistry.SWEETBERRYJAM)));

    public static final RegistryObject<Item> applepie_item = ITEMS.register("applepie", () -> new BlockItem(applepie.get(), new Item.Properties().tab(ItemGroup.TAB_FOOD)));
}
