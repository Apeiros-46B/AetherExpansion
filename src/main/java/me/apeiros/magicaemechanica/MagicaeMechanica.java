package me.apeiros.magicaemechanica;

import io.github.mooy1.infinitylib.core.AbstractAddon;

import me.apeiros.magicaemechanica.items.ItemSetup;

public class MagicaeMechanica extends AbstractAddon {

    // Instance
    private static MagicaeMechanica instance;

    // Auto update things
    public MagicaeMechanica() {
        super("Apeiros-46B", "MagicaeMechanica", "main", "options.auto-update");
    }

    @Override
    public void enable() {
        // Instance
        instance = this;

        // Setup
        ItemSetup.setup(this);
    }

    @Override
    public void disable() {
        // Clean up instance
        instance = null;
    }

    // Instance getter
    public static MagicaeMechanica i() {
        return instance;
    }

}
