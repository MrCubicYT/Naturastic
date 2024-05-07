
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturistic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.naturistic.block.BerryBushBlock;
import net.mcreator.naturistic.NaturisticMod;

public class NaturisticModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NaturisticMod.MODID);
	public static final RegistryObject<Block> BERRY_BUSH = REGISTRY.register("berry_bush", () -> new BerryBushBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
