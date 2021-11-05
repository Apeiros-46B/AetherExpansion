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

public class AetherExpansion extends AbstractAddon implements SlimefunAddon {

    // Instance
    private static AetherExpansion instance;

    // Auto update things
    public AetherExpansion() {
        super("Apeiros-46B", "AetherExpansion", "main", "options.auto-update");
    }

    @Override
    public void enable() {
        // Instance
        instance = this;

        // Setup
        Setup.setup(this);
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

}
