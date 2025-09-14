/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2fools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import mc.dhp.foss.k7a2fools.fluid.types.THLFluidFluidType;
import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

public class K7a2FoolsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, K7a2FoolsMod.MODID);
	public static final RegistryObject<FluidType> THL_FLUID_TYPE = REGISTRY.register("thl_fluid", () -> new THLFluidFluidType());
}