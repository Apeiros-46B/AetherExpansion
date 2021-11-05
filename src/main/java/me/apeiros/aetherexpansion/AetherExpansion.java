package me.apeiros.aetherexpansion;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.markdown.DiscordFlavor;
import net.kyori.adventure.text.minimessage.transformation.TransformationType;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

import static me.apeiros.aetherexpansion.Setup.setup;

public class AetherExpansion extends AbstractAddon implements SlimefunAddon {

    // what

    // Instance
    private static AetherExpansion instance;

    // Auto update things
    public AetherExpansion() {
        super("Apeiros-46B", "AetherExpansion", "main", "options.auto-update");
    }

    // MiniMessage
    private static final MiniMessage m = MiniMessage.builder()
            .markdown()
            .markdownFlavor(DiscordFlavor.get())
            .removeDefaultTransformations()
            .transformation(TransformationType.COLOR)
            .transformation(TransformationType.DECORATION)
            .transformation(TransformationType.GRADIENT)
            .transformation(TransformationType.CLICK_EVENT)
            .transformation(TransformationType.HOVER_EVENT)
            .build();

    @Override
    public void enable() {
        // Instance
        instance = this;

        // Setup
        setup(this);
    }

    @Override
    public void disable() {
        // Clean up instance
        instance = null;
    }

    // Instance getter
    public static AetherExpansion i() {
        return instance;
    }

    // MiniMessage parse methods
    public static Component parse(String s) { return m.parse(s); }

    public static String legacyParse(String s) { return LegacyComponentSerializer.legacySection().serialize(parse(s)); }

    public static String jsonParse(String s) { return GsonComponentSerializer.gson().serialize(parse(s)); }

    // Enchant
    public static ItemStack ench(ItemStack item, Map<Enchantment, Integer> e) {
        item.addUnsafeEnchantments(e);
        return item;
    }

    public static SlimefunItemStack sfEnch(SlimefunItemStack item, Map<Enchantment, Integer> e) {
        item.addUnsafeEnchantments(e);
        return item;
    }

    // Shine enchant
    public static SlimefunItemStack shine(SlimefunItemStack item) {
        item.addUnsafeEnchantment(Enchantment.LUCK, 1);
        item.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        return item;
    }

    // Key
    public static NamespacedKey key(String s) {
        return new NamespacedKey(instance, s);
    }

}
