
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturistic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.naturistic.procedures.UnknownMushroomPropertyValueProviderProcedure;
import net.mcreator.naturistic.procedures.UnknownBerryPropertyValueProviderProcedure;
import net.mcreator.naturistic.item.UnknownMushroomItem;
import net.mcreator.naturistic.item.UnknownBerryItem;
import net.mcreator.naturistic.NaturisticMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NaturisticModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NaturisticMod.MODID);
	public static final RegistryObject<Item> UNKNOWN_BERRY = REGISTRY.register("unknown_berry", () -> new UnknownBerryItem());
	public static final RegistryObject<Item> UNKNOWN_MUSHROOM = REGISTRY.register("unknown_mushroom", () -> new UnknownMushroomItem());
	public static final RegistryObject<Item> BERRY_BUSH = block(NaturisticModBlocks.BERRY_BUSH);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(UNKNOWN_BERRY.get(), new ResourceLocation("naturistic:unknown_berry_rand"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) UnknownBerryPropertyValueProviderProcedure.execute(itemStackToRender));
			ItemProperties.register(UNKNOWN_MUSHROOM.get(), new ResourceLocation("naturistic:unknown_mushroom_tex"),
					(itemStackToRender, clientWorld, entity, itemEntityId) -> (float) UnknownMushroomPropertyValueProviderProcedure.execute(itemStackToRender));
		});
	}
}
