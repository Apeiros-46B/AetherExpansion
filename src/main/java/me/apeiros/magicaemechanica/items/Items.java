package me.apeiros.magicaemechanica.items;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

import lombok.experimental.UtilityClass;

import me.apeiros.magicaemechanica.utils.SkullHashes;
import me.apeiros.magicaemechanica.utils.Utils;

@UtilityClass
public class Items {

    // Materials (Aether)
    public static final SlimefunItemStack AETHER_ALLOY_INGOT = Utils.shine(new SlimefunItemStack(
            "MM_AETHER_ALLOY_INGOT",
            Material.IRON_INGOT,
            Utils.legacyParse("<#a6eaff>Aether Alloy Ingot"),
            Utils.legacyParse("<gray>A chunk of divine metal"), 
            "",
            Utils.legacyParse(Utils.LORE_MATERIAL_AETHER)));

    public static final SlimefunItemStack AETHER_ALLOY_PLATE = Utils.shine(new SlimefunItemStack(
            "MM_AETHER_ALLOY_PLATE",
            Material.PAPER,
            Utils.legacyParse("<#a6eaff>Aether Alloy Plating"),
            Utils.legacyParse("<gray>Gleaming with potential"), 
            "",
            Utils.legacyParse(Utils.LORE_MATERIAL_AETHER)));

    // Components (Aether)
    public static final SlimefunItemStack ETHEREAL_CIRCUITRY = Utils.shine(new SlimefunItemStack(
            "MM_AETHER_CIRCUIT",
            Material.ACTIVATOR_RAIL,
            Utils.legacyParse("<#a6eaff>Ethereal Circuitry"),
            Utils.legacyParse("<gray>A convoluted network of"),
            Utils.legacyParse("<gray>glimmering embedded"), 
            Utils.legacyParse("<gray>chips and connectors"), 
            "",
            Utils.legacyParse(Utils.LORE_COMPONENT_AETHER)));

    public static final SlimefunItemStack SHIMMERING_FIBRES = Utils.shine(new SlimefunItemStack(
            "MM_AETHER_FIBRE",
            Material.PHANTOM_MEMBRANE,
            Utils.legacyParse("<#a6eaff>Shimmering Fibres"),
            Utils.legacyParse("<gray>Coruscating with a celestial radiance"), 
            "",
            Utils.legacyParse(Utils.LORE_COMPONENT_AETHER)));

    // Mechanisms (Aether)
    public static final SlimefunItemStack AETHER_UNIT_1 = new SlimefunItemStack(
            "MM_AETHER_UNIT_1",
            SkullHashes.AETHER_UNIT,
            Utils.legacyParse("<gradient:" + Utils.COLOR_AETHER + ":" + Utils.COLOR_AETHER_ALT + "><bold>Aether Acculmulator Unit <gray>[<yellow><bold>I<gray>]"),
            Utils.legacyParse("<gray>Aggregates <" + Utils.COLOR_AETHER + ">Aether"),
            Utils.legacyParse("<yellow>Collects <green><bold>8 <" + Utils.COLOR_AETHER + ">A<" + Utils.COLOR_AETHER_ALT + ">E<gray>/s"), 
            "",
            Utils.legacyParse(Utils.LORE_MECHANISM_AETHER));

}
