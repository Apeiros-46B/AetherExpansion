package xyz.apeiros.magicaemechanica.utils;

import lombok.experimental.UtilityClass;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

import xyz.apeiros.magicaemechanica.MagicaeMechanica;

@UtilityClass
public class Utils {

    // Colors for lore
    public static final String COLOR_AETHER      = "#a6eaff";
    public static final String COLOR_AETHER_DARK = "#8cbfcf";
    public static final String COLOR_SCULK       = "#05605c";
    public static final String COLOR_SCULK_DARK  = "#033a47";
        
    // Lore snippets
    public static final String LORE_MATERIAL_AETHER = "<blue>Material <gray>[<" + COLOR_AETHER + ">Aether<gray>]";
    public static final String LORE_COMPONENT_AETHER = "<blue>Component <gray>[<" + COLOR_AETHER + ">Aether<gray>]";
    public static final String LORE_MECHANISM_AETHER = "<blue>Mechanism <gray>[<" + COLOR_AETHER + ">Aether<gray>]";
    public static final String LORE_WEAPON_AETHER = "<blue>Weapon <gray>[<" + COLOR_AETHER + ">Aether<gray>]";
    public static final String LORE_ARMOR_AETHER = "<blue>Armor <gray>[<" + COLOR_AETHER + ">Aether<gray>]";
    public static final String LORE_TOOL_AETHER = "<blue>Tool <gray>[<" + COLOR_AETHER + ">Aether<gray>]";

    public static final String LORE_MATERIAL_SCULK = "<blue>Material <gray>[<" + COLOR_SCULK + ">Sculk<gray>]";
    public static final String LORE_COMPONENT_SCULK = "<blue>Component <gray>[<" + COLOR_SCULK + ">Sculk<gray>]";
    public static final String LORE_MECHANISM_SCULK = "<blue>Mechanism <gray>[<" + COLOR_SCULK + ">Sculk<gray>]";
    public static final String LORE_WEAPON_SCULK = "<blue>Weapon <gray>[<" + COLOR_SCULK + ">Sculk<gray>]";
    public static final String LORE_ARMOR_SCULK = "<blue>Armor <gray>[<" + COLOR_SCULK + ">Sculk<gray>]";
    public static final String LORE_TOOL_SCULK = "<blue>Tool <gray>[<" + COLOR_SCULK + ">Sculk<gray>]";

    // MiniMessage
    private static final MiniMessage MM = MiniMessage.builder()
            .tags(TagResolver.builder()
                .resolver(StandardTags.color())
                .resolver(StandardTags.decorations())
                .resolver(StandardTags.gradient())
                .resolver(StandardTags.reset())
                .build())
            .build();

    private static final LegacyComponentSerializer LCS = LegacyComponentSerializer.builder()
            .hexColors()
            .useUnusualXRepeatedCharacterHexFormat()
            .build();

    private static final PlainTextComponentSerializer PTCS = PlainTextComponentSerializer.plainText();

    public static Component serialize(String s) {
        return MM.deserialize(s);
    }

    public static String legacySerialize(String s) {
        return LCS.serialize(serialize(s));
    }

    public static String plainSerialize(Component c) {
        return PTCS.serialize(c);
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
