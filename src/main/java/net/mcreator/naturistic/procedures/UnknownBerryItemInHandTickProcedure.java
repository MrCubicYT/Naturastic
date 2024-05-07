package net.mcreator.naturistic.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import java.util.Random;

public class UnknownBerryItemInHandTickProcedure {
	public static void execute(ItemStack itemstack) {
		String word1 = "";
		String word2 = "";
		if (itemstack.getOrCreateTag().getDouble("d") == 0) {
			itemstack.getOrCreateTag().putDouble("d", 1);
			itemstack.getOrCreateTag().putDouble("rand", Math.random());
			if (Math.random() < 0.1) {
				word1 = "Black";
				itemstack.getOrCreateTag().putDouble("c", 0);
			} else if (Math.random() < 0.2) {
				word1 = "Blue";
				itemstack.getOrCreateTag().putDouble("c", 1);
			} else if (Math.random() < 0.3) {
				word1 = "Orange";
				itemstack.getOrCreateTag().putDouble("c", 2);
			} else if (Math.random() < 0.4) {
				word1 = "Yellow";
				itemstack.getOrCreateTag().putDouble("c", 3);
			} else {
				word1 = "White";
				itemstack.getOrCreateTag().putDouble("c", 4);
			}
			if (Math.random() < 0.1) {
				word2 = " Speckled ";
			} else if (Math.random() < 0.2) {
				word2 = " Spotted ";
			} else if (Math.random() < 0.3) {
				word2 = " Striped ";
			} else if (Math.random() < 0.4) {
				word2 = " Dotted ";
			} else {
				word2 = " Speckled";
			}
			if (Math.random() < 0.5) {
				itemstack.getOrCreateTag().putString("name", (word1 + " Berry"));
			} else {
				itemstack.getOrCreateTag().putString("name", (word1 + "" + (word2 + " Berry")));
			}
			itemstack.setHoverName(Component.literal((itemstack.getOrCreateTag().getString("name"))));
			itemstack.getOrCreateTag().putDouble("aff", (new Random().nextGaussian()));
		}
	}
}
