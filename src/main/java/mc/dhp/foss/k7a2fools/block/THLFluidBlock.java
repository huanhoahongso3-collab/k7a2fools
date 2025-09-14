package mc.dhp.foss.k7a2fools.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import mc.dhp.foss.k7a2fools.init.K7a2FoolsModFluids;

public class THLFluidBlock extends LiquidBlock {
	public THLFluidBlock() {
		super(() -> K7a2FoolsModFluids.THL_FLUID.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}