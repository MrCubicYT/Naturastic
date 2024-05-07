package net.mcreator.naturistic.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.naturistic.init.NaturisticModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RavingpenisgenProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double z) {
		execute(null, world, x, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double z) {
		double xx = 0;
		double zz = 0;
		xx = Mth.nextInt(RandomSource.create(), (int) (x - 300), (int) (x + 300));
		zz = Mth.nextInt(RandomSource.create(), (int) (z - 300), (int) (z + 300));
		world.setBlock(BlockPos.containing(xx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) xx, (int) zz), zz), NaturisticModBlocks.BERRY_BUSH.get().defaultBlockState(), 3);
	}
}
