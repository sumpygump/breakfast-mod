package quantalideas.breakfast.init;

import quantalideas.breakfast.Breakfast;

import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Breakfast.MODID);

    public static final RegistryObject<Item> BREADSLICE = ITEMS.register(
        "breadslice_item",
        () -> new Item(new Item.Properties().group(ItemGroup.MISC)
            .food(new Food.Builder().hunger(1).saturation(4).build()))
        );

    public static final RegistryObject<Item> TOAST = ITEMS.register(
        "toast_item",
        () -> new Item(new Item.Properties().group(ItemGroup.MISC)
            .food(new Food.Builder().hunger(4).saturation(4)
                .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 200, 8), 0.5f).build()))
        );
}
