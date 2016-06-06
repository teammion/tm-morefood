package io.teammion.morefood.recipes;

import io.teammion.morefood.Items;
import io.teammion.morefood.Registry;
import net.minecraft.item.ItemStack;

/**
 * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 05.06.16.
 */
public class SmeltingRecipes
{
    public static void register()
    {
        Registry.addSmelting(
                new ItemStack(Items.DYE, 1, 3),
                new ItemStack(Items.COCOA_BEAN_ROASTED)
        );
        
        Registry.addSmelting(
                Items.SCHNITZEL_RAW,
                new ItemStack(Items.SCHNITZEL)
        );
    }
}
