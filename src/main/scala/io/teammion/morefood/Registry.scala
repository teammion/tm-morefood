/*
 * Copyright (c) 2016, Team Mion
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package io.teammion.morefood

import net.minecraft.block.Block
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.{Item, ItemStack}
import net.minecraft.tileentity.TileEntity
import net.minecraftforge.fml.common.registry.{GameRegistry, IForgeRegistryEntry}

/**
  * Extended registry
  *
  * @author Stefan Wimmer <stefanwimmer128@gmail.com>
  */
object Registry
{
    def register(entry : _ <: IForgeRegistryEntry[_]) : Unit =
        GameRegistry.register(entry)
    
    def registerTileEntity(tileEntityClass : Class[_ <: TileEntity], name : String) : Unit =
    {
        GameRegistry.registerTileEntity(tileEntityClass, name)
    }
    
    def render(item : Item, meta : Int = 0, name : String = null) : Unit =
        Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(
            item, meta, new ModelResourceLocation(
                "tm-morefood:" + Option(name).getOrElse(item.getUnlocalizedName.substring(5)), "inventory"
            )
        )
    
    def render(block : Block, meta : Int = 0, name : String = null) : Unit =
        render(Item.getItemFromBlock(block), meta, name)
    
    def addSmelting(in : Item, out : ItemStack) : Unit =
        GameRegistry.addSmelting(in, out, .2f)
    
    def addSmelting(in : ItemStack, out : ItemStack) : Unit =
        GameRegistry.addSmelting(in, out, .2f)
    
    def addShapelessRecipe(out : ItemStack, params : AnyRef*) : Unit =
        GameRegistry.addShapelessRecipe(out, params : _*)
    
    def addShapedRecipe(out : ItemStack, params : AnyRef*) : Unit =
        GameRegistry.addShapedRecipe(out, params : _*)
}
