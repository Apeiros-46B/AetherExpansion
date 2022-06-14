package xyz.apeiros.magicaemechanica.utils;

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
            new CustomItemStack(Material.END_CRYSTAL, Utils.legacySerialize("<green>General")));

    public static final ItemGroup MISC = new SubGroup("mm_misc",
            new CustomItemStack(Material.NETHER_STAR, Utils.legacySerialize("<light_gray>Miscellaneous")));

    public static final ItemGroup MAIN = new MultiGroup("mm_main",
            new CustomItemStack(Material.BEACON, 
            Utils.legacySerialize(
                "<gradient:" + Utils.COLOR_AETHER + ":" + Utils.COLOR_SCULK + ">Magicae Mechanica")),
            GENERAL, MISC);

}
