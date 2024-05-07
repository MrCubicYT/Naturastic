package net.mcreator.naturistic.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BerryBushOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.1) {
			if (world instanceof Level _lvl0 && _lvl0.isDay()) {
				if (!world.getLevelData().isRaining()) {
					if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f <= 0) {
						if (Math.random() < 0.2) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1, false);
								}
							}
						}
					} else {
						if (Math.random() < 0.2) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1, false);
								}
							}
						}
					}
				} else {
					if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f <= 0) {
						if (Math.random() < 0.2) {
							if (Math.random() < 0.2) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1);
									} else {
										_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1, false);
									}
								}
							}
						}
					} else {
						if (Math.random() < 0.2) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1, false);
								}
							}
						}
					}
				}
			} else {
				if (!world.getLevelData().isRaining()) {
					if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f <= 0) {
						if (Math.random() < 0.2) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:night")), SoundSource.BLOCKS, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:night")), SoundSource.BLOCKS, 1, 1, false);
								}
							}
						}
					} else {
						if (Math.random() < 0.2) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:night")), SoundSource.BLOCKS, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:night")), SoundSource.BLOCKS, 1, 1, false);
								}
							}
						}
					}
				} else {
					if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f <= 0) {
						if (Math.random() < 0.2) {
							if (Math.random() < 0.2) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:night")), SoundSource.BLOCKS, 1, 1);
									} else {
										_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:night")), SoundSource.BLOCKS, 1, 1, false);
									}
								}
							}
						}
					} else {
						if (Math.random() < 0.2) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:night")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:night")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					}
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y + 5, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1);
			} else {
				_level.playLocalSound(x, (y + 5), z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("naturistic:summer")), SoundSource.BLOCKS, 1, 1, false);
			}
		}
	}
}
