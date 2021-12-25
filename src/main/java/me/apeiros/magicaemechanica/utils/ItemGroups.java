package me.apeiros.magicaemechanica.utils;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ItemGroups {

    // Category constants
    public static final ItemGroup GENERAL = new SubGroup("mm_misc",
            new CustomItemStack(Material.END_CRYSTAL, Utils.legacyParse("<green>General")));

    public static final ItemGroup MISC = new SubGroup("mm_misc",
            new CustomItemStack(Material.NETHER_STAR, Utils.legacyParse("<light_gray>Miscellaneous")));

    public static final ItemGroup MAIN = new MultiGroup("mm_main",
            new CustomItemStack(Material.BEACON, 
            Utils.legacyParse(
                "<" + Utils.COLOR_AETHER + ">Magicae <" 
                + Utils.COLOR_AETHER_ALT + ">Mechanica")), 
            GENERAL, MISC);

}
