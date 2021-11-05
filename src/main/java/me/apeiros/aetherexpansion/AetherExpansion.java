package me.apeiros.aetherexpansion;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

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
