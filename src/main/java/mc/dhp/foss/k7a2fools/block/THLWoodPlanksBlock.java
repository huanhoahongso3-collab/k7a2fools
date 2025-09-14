package mc.dhp.foss.k7a2fools.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class THLWoodPlanksBlock extends Block {
	public THLWoodPlanksBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(3.2f, 4.3693540873f).ignitedByLava().instrument(NoteBlockInstrument.HARP));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 8;
	}
}