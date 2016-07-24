package io.teammion.morefood.recipes

import io.teammion.morefood.{Items, Registry}
import net.minecraft.item.ItemStack

/**
  * Created by Stefan Wimmer <stefanwimmer128@gmail.com> on 24.07.16.
  */
object ShapedRecipes
{
    def register()
    {
        Registry.addShapedRecipe(
            new ItemStack(Items.COCOA_BEAN_GROUND),
            "AA",
            "AA",
            char2Character('A'), Items.COCOA_BEAN_ROASTED
        )
        
        Registry.addShapedRecipe(
            new ItemStack(Items.CHOCOLATE),
            "AAA",
            "BCB",
            "AAA",
            char2Character('A'), Items.COCOA_BEAN_GROUND,
            char2Character('B'), Items.SUGAR,
            char2Character('C'), Items.MILK_BUCKET
        )
        
        Registry.addShapedRecipe(
            new ItemStack(Items.CHOCOLATE),
            "ABA",
            "ACA",
            "ABA",
            char2Character('A'), Items.COCOA_BEAN_GROUND,
            char2Character('B'), Items.SUGAR,
            char2Character('C'), Items.MILK_BUCKET
        )
        
        Registry.addShapedRecipe(
            new ItemStack(Items.SANDWICH_SCHNITZEL),
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.SCHNITZEL
        )
        
        Registry.addShapedRecipe(
            new ItemStack(Items.SANDWICH_PORKCHOP),
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_PORKCHOP
        )
        
        Registry.addShapedRecipe(
            new ItemStack(Items.SANDWICH_CHICKEN),
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_CHICKEN
        )
        
        Registry.addShapedRecipe(
            new ItemStack(Items.SANDWICH_FISH),
            "A",
            "B",
            "A",
            char2Character('A'), Items.BREAD_SLICE,
            char2Character('B'), Items.COOKED_FISH
        )
    }
}