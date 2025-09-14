/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2fools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import mc.dhp.foss.k7a2fools.item.YeuDonPhuongLaGiItem;
import mc.dhp.foss.k7a2fools.item.XeDapLachCachItem;
import mc.dhp.foss.k7a2fools.item.THLSwordItem;
import mc.dhp.foss.k7a2fools.item.THLShovelItem;
import mc.dhp.foss.k7a2fools.item.THLPickaxeItem;
import mc.dhp.foss.k7a2fools.item.THLOreDustItem;
import mc.dhp.foss.k7a2fools.item.THLHoeItem;
import mc.dhp.foss.k7a2fools.item.THLFluidItem;
import mc.dhp.foss.k7a2fools.item.THLDimensionItem;
import mc.dhp.foss.k7a2fools.item.THLAxeItem;
import mc.dhp.foss.k7a2fools.item.THLArmorItem;
import mc.dhp.foss.k7a2fools.item.SaoAnhChuaVeNhaItem;
import mc.dhp.foss.k7a2fools.item.SaiGonHomNayMuaItem;
import mc.dhp.foss.k7a2fools.item.NhuAnhDaThayEmItem;
import mc.dhp.foss.k7a2fools.item.KetheoduoianhsangItem;
import mc.dhp.foss.k7a2fools.item.HammerItem;
import mc.dhp.foss.k7a2fools.item.CasioItem;
import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

public class K7a2FoolsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, K7a2FoolsMod.MODID);
	public static final RegistryObject<Item> THL_DIM_MAIN_BLOCK = block(K7a2FoolsModBlocks.THL_DIM_MAIN_BLOCK);
	public static final RegistryObject<Item> THL_FLUID_BUCKET = REGISTRY.register("thl_fluid_bucket", () -> new THLFluidItem());
	public static final RegistryObject<Item> THL_AGGRESSIVE_BLOCK = block(K7a2FoolsModBlocks.THL_AGGRESSIVE_BLOCK);
	public static final RegistryObject<Item> THL_PORTAL_BLOCK = block(K7a2FoolsModBlocks.THL_PORTAL_BLOCK);
	public static final RegistryObject<Item> THL_DIMENSION = REGISTRY.register("thl_dimension", () -> new THLDimensionItem());
	public static final RegistryObject<Item> THL_WOOD_LOG = block(K7a2FoolsModBlocks.THL_WOOD_LOG);
	public static final RegistryObject<Item> THL_WOOD_WOOD = block(K7a2FoolsModBlocks.THL_WOOD_WOOD);
	public static final RegistryObject<Item> THL_WOOD_PLANKS = block(K7a2FoolsModBlocks.THL_WOOD_PLANKS);
	public static final RegistryObject<Item> THL_WOOD_LEAVES = block(K7a2FoolsModBlocks.THL_WOOD_LEAVES);
	public static final RegistryObject<Item> THL_WOOD_STAIRS = block(K7a2FoolsModBlocks.THL_WOOD_STAIRS);
	public static final RegistryObject<Item> THL_WOOD_SLAB = block(K7a2FoolsModBlocks.THL_WOOD_SLAB);
	public static final RegistryObject<Item> THL_WOOD_FENCE = block(K7a2FoolsModBlocks.THL_WOOD_FENCE);
	public static final RegistryObject<Item> THL_WOOD_FENCE_GATE = block(K7a2FoolsModBlocks.THL_WOOD_FENCE_GATE);
	public static final RegistryObject<Item> THL_WOOD_PRESSURE_PLATE = block(K7a2FoolsModBlocks.THL_WOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> THL_WOOD_BUTTON = block(K7a2FoolsModBlocks.THL_WOOD_BUTTON);
	public static final RegistryObject<Item> THL_ORE_DUST = REGISTRY.register("thl_ore_dust", () -> new THLOreDustItem());
	public static final RegistryObject<Item> THL_ORE_BLOCK = block(K7a2FoolsModBlocks.THL_ORE_BLOCK);
	public static final RegistryObject<Item> THL_PICKAXE = REGISTRY.register("thl_pickaxe", () -> new THLPickaxeItem());
	public static final RegistryObject<Item> THL_AXE = REGISTRY.register("thl_axe", () -> new THLAxeItem());
	public static final RegistryObject<Item> THL_SWORD = REGISTRY.register("thl_sword", () -> new THLSwordItem());
	public static final RegistryObject<Item> THL_SHOVEL = REGISTRY.register("thl_shovel", () -> new THLShovelItem());
	public static final RegistryObject<Item> THL_HOE = REGISTRY.register("thl_hoe", () -> new THLHoeItem());
	public static final RegistryObject<Item> THL_ARMOR_HELMET = REGISTRY.register("thl_armor_helmet", () -> new THLArmorItem.Helmet());
	public static final RegistryObject<Item> THL_ARMOR_CHESTPLATE = REGISTRY.register("thl_armor_chestplate", () -> new THLArmorItem.Chestplate());
	public static final RegistryObject<Item> THL_ARMOR_LEGGINGS = REGISTRY.register("thl_armor_leggings", () -> new THLArmorItem.Leggings());
	public static final RegistryObject<Item> THL_ARMOR_BOOTS = REGISTRY.register("thl_armor_boots", () -> new THLArmorItem.Boots());
	public static final RegistryObject<Item> KE_THEO_DUOI_ANH_SANG = REGISTRY.register("ke_theo_duoi_anh_sang", () -> new KetheoduoianhsangItem());
	public static final RegistryObject<Item> NHU_ANH_DA_THAY_EM = REGISTRY.register("nhu_anh_da_thay_em", () -> new NhuAnhDaThayEmItem());
	public static final RegistryObject<Item> SAI_GON_HOM_NAY_MUA = REGISTRY.register("sai_gon_hom_nay_mua", () -> new SaiGonHomNayMuaItem());
	public static final RegistryObject<Item> SAO_ANH_CHUA_VE_NHA = REGISTRY.register("sao_anh_chua_ve_nha", () -> new SaoAnhChuaVeNhaItem());
	public static final RegistryObject<Item> XE_DAP_LACH_CACH = REGISTRY.register("xe_dap_lach_cach", () -> new XeDapLachCachItem());
	public static final RegistryObject<Item> YEU_DON_PHUONG_LA_GI = REGISTRY.register("yeu_don_phuong_la_gi", () -> new YeuDonPhuongLaGiItem());
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> CASIO = REGISTRY.register("casio", () -> new CasioItem());
	public static final RegistryObject<Item> MOI_BAO_VE_SPAWN_EGG = REGISTRY.register("moi_bao_ve_spawn_egg", () -> new ForgeSpawnEggItem(K7a2FoolsModEntities.MOI_BAO_VE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TAI_BAO_VE_SPAWN_EGG = REGISTRY.register("tai_bao_ve_spawn_egg", () -> new ForgeSpawnEggItem(K7a2FoolsModEntities.TAI_BAO_VE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> THANH_BAO_VE_SPAWN_EGG = REGISTRY.register("thanh_bao_ve_spawn_egg", () -> new ForgeSpawnEggItem(K7a2FoolsModEntities.THANH_BAO_VE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> NGAN_BAO_VE_SPAWN_EGG = REGISTRY.register("ngan_bao_ve_spawn_egg", () -> new ForgeSpawnEggItem(K7a2FoolsModEntities.NGAN_BAO_VE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BOSS_THL_SPAWN_EGG = REGISTRY.register("boss_thl_spawn_egg", () -> new ForgeSpawnEggItem(K7a2FoolsModEntities.BOSS_THL, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}