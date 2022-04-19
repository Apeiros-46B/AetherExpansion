package me.apeiros.magicaemechanica.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import lombok.experimental.UtilityClass;

import me.apeiros.magicaemechanica.MagicaeMechanica;
import me.apeiros.magicaemechanica.utils.ItemGroups;

@UtilityClass
public class ItemSetup {

    // Setup methods
    public static void setup(MagicaeMechanica p) {
        // Setup category, researches, listeners, and commands
        ItemGroups.MAIN.register(p);

        setupResearches(p);
        setupListeners(p);
        setupCommands(p);

        // Register items
        new SlimefunItem(ItemGroups.GENERAL, Items.AETHER_ALLOY_INGOT, RecipeType.SMELTERY, new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.END_CRYSTAL), SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE,
                SlimefunItems.MAGIC_SUGAR, null, null,
                null, null, null
        }).register(p);

        new SlimefunItem(ItemGroups.GENERAL, Items.AETHER_ALLOY_PLATE, RecipeType.COMPRESSOR, new ItemStack[] {
                new SlimefunItemStack(Items.AETHER_ALLOY_INGOT, 8), null, null,
                null, null, null,
                null, null, null
        }).register(p);

        new SlimefunItem(ItemGroups.GENERAL, Items.ETHEREAL_CIRCUITRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.AIR_RUNE, SlimefunItems.POWER_CRYSTAL, SlimefunItems.AIR_RUNE,
                SlimefunItems.HARDENED_GLASS, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.HARDENED_GLASS,
                SlimefunItems.AIR_RUNE, Items.AETHER_ALLOY_PLATE, SlimefunItems.AIR_RUNE
        }).register(p);

        new SlimefunItem(ItemGroups.GENERAL, Items.SHIMMERING_FIBRES, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.PHANTOM_MEMBRANE), SlimefunItems.HARDENED_GLASS, new ItemStack(Material.PHANTOM_MEMBRANE),
                Items.AETHER_ALLOY_INGOT, new ItemStack(Material.BEACON), Items.AETHER_ALLOY_INGOT,
                new ItemStack(Material.PHANTOM_MEMBRANE), SlimefunItems.HARDENED_GLASS, new ItemStack(Material.PHANTOM_MEMBRANE)
        }, new SlimefunItemStack(Items.SHIMMERING_FIBRES, 4)).register(p);

        new SlimefunItem(ItemGroups.GENERAL, Items.AETHER_UNIT_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            SlimefunItems.AIR_RUNE, Items.SHIMMERING_FIBRES, SlimefunItems.LIGHTNING_RUNE,
            Items.AETHER_ALLOY_PLATE, Items.ETHEREAL_CIRCUITRY, Items.AETHER_ALLOY_PLATE,
            new ItemStack(Material.BEACON), Items.SHIMMERING_FIBRES, new ItemStack(Material.BEACON)
        }).register(p);
    }

    private static void setupListeners(MagicaeMechanica p) {

    }

    private static void setupCommands(MagicaeMechanica p) {

    }

    private static void setupResearches(MagicaeMechanica p) {
        
    }
}
