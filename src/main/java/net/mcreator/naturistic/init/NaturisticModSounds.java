
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.naturistic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.naturistic.NaturisticMod;

public class NaturisticModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NaturisticMod.MODID);
	public static final RegistryObject<SoundEvent> SUMMER = REGISTRY.register("summer", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("naturistic", "summer")));
	public static final RegistryObject<SoundEvent> NIGHT = REGISTRY.register("night", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("naturistic", "night")));
}
