/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2fools.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import mc.dhp.foss.k7a2fools.client.renderer.ThanhBaoVeRenderer;
import mc.dhp.foss.k7a2fools.client.renderer.TaiBaoVeRenderer;
import mc.dhp.foss.k7a2fools.client.renderer.NganBaoVeRenderer;
import mc.dhp.foss.k7a2fools.client.renderer.MoiBaoVeRenderer;
import mc.dhp.foss.k7a2fools.client.renderer.BossTHLRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class K7a2FoolsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(K7a2FoolsModEntities.MOI_BAO_VE.get(), MoiBaoVeRenderer::new);
		event.registerEntityRenderer(K7a2FoolsModEntities.TAI_BAO_VE.get(), TaiBaoVeRenderer::new);
		event.registerEntityRenderer(K7a2FoolsModEntities.THANH_BAO_VE.get(), ThanhBaoVeRenderer::new);
		event.registerEntityRenderer(K7a2FoolsModEntities.NGAN_BAO_VE.get(), NganBaoVeRenderer::new);
		event.registerEntityRenderer(K7a2FoolsModEntities.BOSS_THL.get(), BossTHLRenderer::new);
	}
}