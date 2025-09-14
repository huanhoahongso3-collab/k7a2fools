package mc.dhp.foss.k7a2fools.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import mc.dhp.foss.k7a2fools.init.K7a2FoolsModItems;
import mc.dhp.foss.k7a2fools.init.K7a2FoolsModFluids;
import mc.dhp.foss.k7a2fools.init.K7a2FoolsModFluidTypes;
import mc.dhp.foss.k7a2fools.init.K7a2FoolsModBlocks;

public abstract class THLFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> K7a2FoolsModFluidTypes.THL_FLUID_TYPE.get(), () -> K7a2FoolsModFluids.THL_FLUID.get(), () -> K7a2FoolsModFluids.FLOWING_THL_FLUID.get())
			.explosionResistance(100f).tickRate(10).slopeFindDistance(5).bucket(() -> K7a2FoolsModItems.THL_FLUID_BUCKET.get()).block(() -> (LiquidBlock) K7a2FoolsModBlocks.THL_FLUID.get());

	private THLFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends THLFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends THLFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}