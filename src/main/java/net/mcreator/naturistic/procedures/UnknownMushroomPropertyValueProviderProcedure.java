package net.mcreator.naturistic.procedures;

import net.minecraft.world.item.ItemStack;

public class UnknownMushroomPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("id") == 5) {
			return 5;
		} else if (itemstack.getOrCreateTag().getDouble("id") == 5) {
			return 4;
		} else if (itemstack.getOrCreateTag().getDouble("id") == 5) {
			return 3;
		}
		return 0;
	}
}
