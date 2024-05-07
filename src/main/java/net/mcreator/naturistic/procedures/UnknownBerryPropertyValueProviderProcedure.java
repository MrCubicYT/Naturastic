package net.mcreator.naturistic.procedures;

import net.minecraft.world.item.ItemStack;

public class UnknownBerryPropertyValueProviderProcedure {
	public static double execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("c") == 0) {
			return 0;
		} else if (itemstack.getOrCreateTag().getDouble("c") == 1) {
			return 1;
		} else if (itemstack.getOrCreateTag().getDouble("c") == 2) {
			return 2;
		} else if (itemstack.getOrCreateTag().getDouble("c") == 3) {
			return 3;
		} else if (itemstack.getOrCreateTag().getDouble("c") == 4) {
			return 4;
		}
		return 0;
	}
}
