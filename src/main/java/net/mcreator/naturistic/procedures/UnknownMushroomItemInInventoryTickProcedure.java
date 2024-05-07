package net.mcreator.naturistic.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import java.util.Random;

public class UnknownMushroomItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		String word1 = "";
		String word2 = "";
		String word3 = "";
		if (itemstack.getOrCreateTag().getDouble("d") == 0) {
			itemstack.getOrCreateTag().putDouble("d", 1);
			itemstack.getOrCreateTag().putDouble("rand", Math.random());
			if (Math.random() < 0.1) {
				word1 = "Sulfur";
				itemstack.getOrCreateTag().putDouble("c", 0);
			} else if (Math.random() < 0.2) {
				word1 = "Panther";
				itemstack.getOrCreateTag().putDouble("c", 1);
			} else if (Math.random() < 0.3) {
				word1 = "Saffondrop";
				itemstack.getOrCreateTag().putDouble("c", 2);
			} else if (Math.random() < 0.4) {
				word1 = "Angel's ";
				itemstack.getOrCreateTag().putDouble("c", 3);
			} else {
				word1 = "Mealy";
				itemstack.getOrCreateTag().putDouble("c", 4);
				itemstack.getOrCreateTag().putDouble("id", 2);
			}
			if (Math.random() < 0.1) {
				word2 = "Polypore ";
			} else if (Math.random() < 0.2) {
				word2 = "Agaricus ";
			} else if (Math.random() < 0.3) {
				word2 = "Destroyer ";
				itemstack.getOrCreateTag().putDouble("id", 5);
			} else if (Math.random() < 0.4) {
				word2 = "Shelf ";
				itemstack.getOrCreateTag().putDouble("id", 3);
			} else {
				word2 = " Mycena ";
			}
			if (Math.random() < 0.1) {
				word3 = "Eastern ";
			} else if (Math.random() < 0.2) {
				word3 = "European ";
			} else if (Math.random() < 0.3) {
				word3 = "Southern ";
			} else if (Math.random() < 0.4) {
				word3 = "False ";
				itemstack.getOrCreateTag().putDouble("id", 4);
			} else if (Math.random() < 0.5) {
				word3 = "Coastal ";
			} else {
				word3 = "Fake ";
				itemstack.getOrCreateTag().putDouble("id", 4);
			}
			if (Math.random() < 0.5) {
				itemstack.getOrCreateTag().putString("name", (word3 + "" + (word1 + "" + word2)));
			} else {
				itemstack.getOrCreateTag().putString("name", (word1 + "" + word2));
			}
			itemstack.setHoverName(Component.literal((itemstack.getOrCreateTag().getString("name"))));
			itemstack.getOrCreateTag().putDouble("aff", (new Random().nextGaussian()));
		}
	}
}
