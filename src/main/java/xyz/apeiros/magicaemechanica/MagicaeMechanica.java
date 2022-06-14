package xyz.apeiros.magicaemechanica;

import io.github.mooy1.infinitylib.core.AbstractAddon;

import xyz.apeiros.magicaemechanica.items.Setup;

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
        Setup.setup(this);
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
