package io.teammion.morefood;

import io.teammion.morefood.item.Item;
import io.teammion.morefood.item.ItemDrink;
import io.teammion.morefood.item.ItemFood;
import io.teammion.morefood.item.ItemMilkBottle;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class Items extends net.minecraft.init.Items
{
    public static final ItemMilkBottle MILK_BOTTLE = new ItemMilkBottle();
    public static final Item COCOA_BEAN_ROASTED = new Item("cocoa_bean_roasted");
    public static final Item COCOA_BEAN_GROUND = new Item("cocoa_bean_ground");
    public static final ItemFood CHOCOLATE = new ItemFood("chocolate", 8);
    public static final ItemFood CHOCOLATE_PIECE = new ItemFood("chocolate_piece", 1);
    public static final ItemDrink CHOCOLATE_DRINK = new ItemDrink("chocolate_drink", 4);
    public static final Item FLOUR = new Item("flour");
    public static final Item SCHNITZEL_RAW = new Item("schnitzel_raw");
    public static final ItemFood SCHNITZEL = new ItemFood("schnitzel", 4);
    
    public static void register()
    {
        Registry.register(MILK_BOTTLE);
        Registry.register(COCOA_BEAN_ROASTED);
        Registry.register(COCOA_BEAN_GROUND);
        Registry.register(CHOCOLATE);
        Registry.register(CHOCOLATE_PIECE);
        Registry.register(CHOCOLATE_DRINK);
        Registry.register(FLOUR);
        Registry.register(SCHNITZEL_RAW);
        Registry.register(SCHNITZEL);
    }
    
    public static void render()
    {
        Registry.render(MILK_BOTTLE);
        Registry.render(COCOA_BEAN_ROASTED);
        Registry.render(COCOA_BEAN_GROUND);
        Registry.render(CHOCOLATE);
        Registry.render(CHOCOLATE_PIECE);
        Registry.render(CHOCOLATE_DRINK);
        Registry.render(FLOUR);
        Registry.render(SCHNITZEL_RAW);
        Registry.render(SCHNITZEL);
    }
}
