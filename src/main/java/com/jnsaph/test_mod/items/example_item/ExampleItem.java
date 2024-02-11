package com.jnsaph.test_mod.items.example_item;

import com.jnsaph.test_mod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class ExampleItem extends Item {
	public ExampleItem(Settings settings) {
		super(settings);
	}

	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
		TestMod.LOGGER.info("Example item used");
		if (!world.isClient) {
			double x = player.getX();
			double y = player.getY();
			double z = player.getZ();

			player.teleport(x, y + 10, z);
		}
		return TypedActionResult.success(player.getStackInHand(hand));
	}

}
