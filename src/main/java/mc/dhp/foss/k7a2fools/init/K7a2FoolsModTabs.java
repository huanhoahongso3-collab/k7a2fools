/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2fools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class K7a2FoolsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, K7a2FoolsMod.MODID);
	public static final RegistryObject<CreativeModeTab> K_7_A_2_HALLOWEEN_AND_APRIL_FOOLS = REGISTRY.register("k_7_a_2_halloween_and_april_fools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.k7a2_fools.k_7_a_2_halloween_and_april_fools")).icon(() -> new ItemStack(Blocks.JACK_O_LANTERN)).displayItems((parameters, tabData) -> {
				tabData.accept(K7a2FoolsModBlocks.THL_DIM_MAIN_BLOCK.get().asItem());
				tabData.accept(K7a2FoolsModItems.THL_FLUID_BUCKET.get());
				tabData.accept(K7a2FoolsModBlocks.THL_AGGRESSIVE_BLOCK.get().asItem());
				tabData.accept(K7a2FoolsModBlocks.THL_PORTAL_BLOCK.get().asItem());
				tabData.accept(K7a2FoolsModItems.THL_DIMENSION.get());
				tabData.accept(K7a2FoolsModItems.KE_THEO_DUOI_ANH_SANG.get());
				tabData.accept(K7a2FoolsModItems.NHU_ANH_DA_THAY_EM.get());
				tabData.accept(K7a2FoolsModItems.SAI_GON_HOM_NAY_MUA.get());
				tabData.accept(K7a2FoolsModItems.SAO_ANH_CHUA_VE_NHA.get());
				tabData.accept(K7a2FoolsModItems.XE_DAP_LACH_CACH.get());
				tabData.accept(K7a2FoolsModItems.YEU_DON_PHUONG_LA_GI.get());
				tabData.accept(K7a2FoolsModItems.CASIO.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_LOG.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_WOOD.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_PLANKS.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_STAIRS.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_SLAB.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_FENCE.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_FENCE_GATE.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_BUTTON.get().asItem());
			tabData.accept(K7a2FoolsModBlocks.THL_ORE_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(K7a2FoolsModBlocks.THL_WOOD_LEAVES.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(K7a2FoolsModItems.THL_ORE_DUST.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(K7a2FoolsModItems.THL_PICKAXE.get());
			tabData.accept(K7a2FoolsModItems.THL_AXE.get());
			tabData.accept(K7a2FoolsModItems.THL_SHOVEL.get());
			tabData.accept(K7a2FoolsModItems.THL_HOE.get());
			tabData.accept(K7a2FoolsModItems.HAMMER.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(K7a2FoolsModItems.THL_SWORD.get());
			tabData.accept(K7a2FoolsModItems.THL_ARMOR_HELMET.get());
			tabData.accept(K7a2FoolsModItems.THL_ARMOR_CHESTPLATE.get());
			tabData.accept(K7a2FoolsModItems.THL_ARMOR_LEGGINGS.get());
			tabData.accept(K7a2FoolsModItems.THL_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(K7a2FoolsModItems.MOI_BAO_VE_SPAWN_EGG.get());
			tabData.accept(K7a2FoolsModItems.TAI_BAO_VE_SPAWN_EGG.get());
			tabData.accept(K7a2FoolsModItems.THANH_BAO_VE_SPAWN_EGG.get());
			tabData.accept(K7a2FoolsModItems.NGAN_BAO_VE_SPAWN_EGG.get());
			tabData.accept(K7a2FoolsModItems.BOSS_THL_SPAWN_EGG.get());
		}
	}
}