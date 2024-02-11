package com.jnsaph.test_mod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ItemGroupManager {
	public static void registerItemGroups() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((entries) -> {
			entries.addItem(ItemsManager.EXAMPLE_ITEM);
		});
	}
}
