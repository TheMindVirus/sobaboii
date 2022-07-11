package net.fabricmc.sobaboii;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.FoodComponent;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class Edible
{
    public Edible(String name, double health)
    {
        FoodComponent component = new FoodComponent.Builder().hunger((int)health).alwaysEdible().build();
        Item.Settings settings = new FabricItemSettings().group(ItemGroup.FOOD).food(component);
        Registry.register(Registry.ITEM, new Identifier("sobaboii", name), new Item(settings));
    }
}