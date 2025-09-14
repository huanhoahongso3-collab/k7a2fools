/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2fools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import mc.dhp.foss.k7a2fools.fluid.THLFluidFluid;
import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

public class K7a2FoolsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, K7a2FoolsMod.MODID);
	public static final RegistryObject<FlowingFluid> THL_FLUID = REGISTRY.register("thl_fluid", () -> new THLFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_THL_FLUID = REGISTRY.register("flowing_thl_fluid", () -> new THLFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(THL_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_THL_FLUID.get(), RenderType.translucent());
		}
	}
}