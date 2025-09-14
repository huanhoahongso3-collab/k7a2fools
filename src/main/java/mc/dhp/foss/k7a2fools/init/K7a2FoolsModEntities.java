/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2fools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import mc.dhp.foss.k7a2fools.entity.ThanhBaoVeEntity;
import mc.dhp.foss.k7a2fools.entity.TaiBaoVeEntity;
import mc.dhp.foss.k7a2fools.entity.NganBaoVeEntity;
import mc.dhp.foss.k7a2fools.entity.MoiBaoVeEntity;
import mc.dhp.foss.k7a2fools.entity.BossTHLEntity;
import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class K7a2FoolsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, K7a2FoolsMod.MODID);
	public static final RegistryObject<EntityType<MoiBaoVeEntity>> MOI_BAO_VE = register("moi_bao_ve",
			EntityType.Builder.<MoiBaoVeEntity>of(MoiBaoVeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(156).setUpdateInterval(3).setCustomClientFactory(MoiBaoVeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TaiBaoVeEntity>> TAI_BAO_VE = register("tai_bao_ve",
			EntityType.Builder.<TaiBaoVeEntity>of(TaiBaoVeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(56).setUpdateInterval(3).setCustomClientFactory(TaiBaoVeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThanhBaoVeEntity>> THANH_BAO_VE = register("thanh_bao_ve", EntityType.Builder.<ThanhBaoVeEntity>of(ThanhBaoVeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(56).setUpdateInterval(3).setCustomClientFactory(ThanhBaoVeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NganBaoVeEntity>> NGAN_BAO_VE = register("ngan_bao_ve", EntityType.Builder.<NganBaoVeEntity>of(NganBaoVeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(NganBaoVeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BossTHLEntity>> BOSS_THL = register("boss_thl",
			EntityType.Builder.<BossTHLEntity>of(BossTHLEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(156).setUpdateInterval(3).setCustomClientFactory(BossTHLEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MoiBaoVeEntity.init();
			TaiBaoVeEntity.init();
			ThanhBaoVeEntity.init();
			NganBaoVeEntity.init();
			BossTHLEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOI_BAO_VE.get(), MoiBaoVeEntity.createAttributes().build());
		event.put(TAI_BAO_VE.get(), TaiBaoVeEntity.createAttributes().build());
		event.put(THANH_BAO_VE.get(), ThanhBaoVeEntity.createAttributes().build());
		event.put(NGAN_BAO_VE.get(), NganBaoVeEntity.createAttributes().build());
		event.put(BOSS_THL.get(), BossTHLEntity.createAttributes().build());
	}
}