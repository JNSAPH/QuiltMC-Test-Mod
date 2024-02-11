package com.jnsaph.test_mod.items;

import com.jnsaph.test_mod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ItemsManager {

	public static final Item EXAMPLE_ITEM = new Item(new QuiltItemSettings());

	public static void registerItems() {
		TestMod.LOGGER.info("Registering items");
		Registry.register(Registries.ITEM, new Identifier("test_mod", "example_item"), EXAMPLE_ITEM);

		ItemGroupManager.registerItemGroups();
	}
}
