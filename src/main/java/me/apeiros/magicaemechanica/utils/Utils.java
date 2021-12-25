package me.apeiros.magicaemechanica.utils;

import java.util.Map;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.markdown.DiscordFlavor;
import net.kyori.adventure.text.minimessage.transformation.TransformationType;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

import lombok.experimental.UtilityClass;

import me.apeiros.magicaemechanica.MagicaeMechanica;

@UtilityClass
public class Utils {

    // Colors for lore
    public static final String COLOR_AETHER = "#a6eaff";
    public static final String COLOR_AETHER_ALT = "#0afda6";
        
    // Lore snippets
    public static final String LORE_MATERIAL_AETHER = "<blue>Material <gray>[<" + COLOR_AETHER + ">Aether<gray>]";
    public static final String LORE_COMPONENT_AETHER = "<blue>Component <gray>[<" + COLOR_AETHER + ">Aether<gray>]";
    public static final String LORE_MECHANISM_AETHER = "<blue>Mechanism <gray>[<" + COLOR_AETHER + ">Aether<gray>]";

    // MiniMessage
    private static final MiniMessage miniMessage = MiniMessage.builder()
            .markdown()
            .markdownFlavor(DiscordFlavor.get())
            .removeDefaultTransformations()
            .transformation(TransformationType.COLOR)
            .transformation(TransformationType.DECORATION)
            .transformation(TransformationType.GRADIENT)
            .transformation(TransformationType.CLICK_EVENT)
            .transformation(TransformationType.HOVER_EVENT)
            .build();

    // Parse MiniMessage strings
    public static Component parse(String s) { return miniMessage.parse(s); }

    public static String legacyParse(String s) { return LegacyComponentSerializer.legacyAmpersand().serialize(parse(s)); }

    // Enchant an item with specified enchantments
    public static ItemStack ench(ItemStack item, Map<Enchantment, Integer> e) {
        item.addUnsafeEnchantments(e);
        return item;
    }

    public static SlimefunItemStack ench(SlimefunItemStack item, Map<Enchantment, Integer> e) {
        item.addUnsafeEnchantments(e);
        return item;
    }

    // Add shine effect to an item
    public static SlimefunItemStack shine(SlimefunItemStack item) {
        item.addUnsafeEnchantment(Enchantment.LUCK, 0);
        item.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return item;
    }

    // Create a NamespacedKey
    public static NamespacedKey key(String s) {
        return new NamespacedKey(MagicaeMechanica.i(), s);
    }

}
