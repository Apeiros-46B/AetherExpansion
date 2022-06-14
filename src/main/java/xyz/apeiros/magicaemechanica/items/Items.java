package xyz.apeiros.magicaemechanica.items;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

import xyz.apeiros.magicaemechanica.utils.SkullHashes;
import xyz.apeiros.magicaemechanica.utils.Utils;

@UtilityClass
public class Items {

    // Materials (Aether)
    public static final SlimefunItemStack AETHER_ALLOY_INGOT = Utils.shine(new SlimefunItemStack(
            "MM_AETHER_ALLOY_INGOT",
            Material.IRON_INGOT,
            Utils.legacySerialize("<" + Utils.COLOR_AETHER + ">Aether Alloy Ingot"),
            Utils.legacySerialize("<gray>A chunk of divine metal"), 
            "",
            Utils.legacySerialize(Utils.LORE_MATERIAL_AETHER)));

    public static final SlimefunItemStack AETHER_ALLOY_PLATE = Utils.shine(new SlimefunItemStack(
            "MM_AETHER_ALLOY_PLATE",
            Material.PAPER,
            Utils.legacySerialize("<" + Utils.COLOR_AETHER + ">Aether Alloy Plating"),
            Utils.legacySerialize("<gray>Gleaming with potential"), 
            "",
            Utils.legacySerialize(Utils.LORE_MATERIAL_AETHER)));

    // Components (Aether)
    public static final SlimefunItemStack ETHEREAL_CIRCUITRY = Utils.shine(new SlimefunItemStack(
            "MM_AETHER_CIRCUIT",
            Material.ACTIVATOR_RAIL,
            Utils.legacySerialize("<" + Utils.COLOR_AETHER + ">Ethereal Circuitry"),
            Utils.legacySerialize("<gray>A convoluted network of"),
            Utils.legacySerialize("<gray>microchips, oscilaators,"),
            Utils.legacySerialize("<gray>and connector pins"),
            "",
            Utils.legacySerialize(Utils.LORE_COMPONENT_AETHER)));

    public static final SlimefunItemStack SHIMMERING_FIBRES = Utils.shine(new SlimefunItemStack(
            "MM_AETHER_FIBRE",
            Material.PHANTOM_MEMBRANE,
            Utils.legacySerialize("<" + Utils.COLOR_AETHER + ">Shimmering Fibres"),
            Utils.legacySerialize("<gray>Coruscating with a celestial radiance"), 
            "",
            Utils.legacySerialize(Utils.LORE_COMPONENT_AETHER)));

    // Mechanisms (Aether)
    public static final SlimefunItemStack AETHER_UNIT_1 = new SlimefunItemStack(
            "MM_AETHER_UNIT_1",
            SkullHashes.AETHER_UNIT,
            Utils.legacySerialize("<gradient:" + Utils.COLOR_AETHER + ":" + Utils.COLOR_AETHER + "><bold>Aether Acculmulator Unit<gray> [<yellow><bold>I<gray>]"),
            Utils.legacySerialize("<gray>Aggregates <" + Utils.COLOR_AETHER + ">Aether"),
            Utils.legacySerialize("<yellow>Collects <green><bold>8 <" + Utils.COLOR_AETHER + ">A<" + Utils.COLOR_AETHER_DARK + ">E<gray>/s"), 
            "",
            Utils.legacySerialize(Utils.LORE_MECHANISM_AETHER));

}
