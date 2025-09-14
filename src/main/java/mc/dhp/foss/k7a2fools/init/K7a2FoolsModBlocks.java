/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2fools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import mc.dhp.foss.k7a2fools.block.THLWoodWoodBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodStairsBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodSlabBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodPressurePlateBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodPlanksBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodLogBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodLeavesBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodFenceGateBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodFenceBlock;
import mc.dhp.foss.k7a2fools.block.THLWoodButtonBlock;
import mc.dhp.foss.k7a2fools.block.THLPortalBlockBlock;
import mc.dhp.foss.k7a2fools.block.THLOreBlockBlock;
import mc.dhp.foss.k7a2fools.block.THLMainBlockBlock;
import mc.dhp.foss.k7a2fools.block.THLFluidBlock;
import mc.dhp.foss.k7a2fools.block.THLDimensionPortalBlock;
import mc.dhp.foss.k7a2fools.block.THLAgressiveBlockBlock;
import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

public class K7a2FoolsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, K7a2FoolsMod.MODID);
	public static final RegistryObject<Block> THL_DIM_MAIN_BLOCK = REGISTRY.register("thl_dim_main_block", () -> new THLMainBlockBlock());
	public static final RegistryObject<Block> THL_FLUID = REGISTRY.register("thl_fluid", () -> new THLFluidBlock());
	public static final RegistryObject<Block> THL_AGGRESSIVE_BLOCK = REGISTRY.register("thl_aggressive_block", () -> new THLAgressiveBlockBlock());
	public static final RegistryObject<Block> THL_PORTAL_BLOCK = REGISTRY.register("thl_portal_block", () -> new THLPortalBlockBlock());
	public static final RegistryObject<Block> THL_DIMENSION_PORTAL = REGISTRY.register("thl_dimension_portal", () -> new THLDimensionPortalBlock());
	public static final RegistryObject<Block> THL_WOOD_LOG = REGISTRY.register("thl_wood_log", () -> new THLWoodLogBlock());
	public static final RegistryObject<Block> THL_WOOD_WOOD = REGISTRY.register("thl_wood_wood", () -> new THLWoodWoodBlock());
	public static final RegistryObject<Block> THL_WOOD_PLANKS = REGISTRY.register("thl_wood_planks", () -> new THLWoodPlanksBlock());
	public static final RegistryObject<Block> THL_WOOD_LEAVES = REGISTRY.register("thl_wood_leaves", () -> new THLWoodLeavesBlock());
	public static final RegistryObject<Block> THL_WOOD_STAIRS = REGISTRY.register("thl_wood_stairs", () -> new THLWoodStairsBlock());
	public static final RegistryObject<Block> THL_WOOD_SLAB = REGISTRY.register("thl_wood_slab", () -> new THLWoodSlabBlock());
	public static final RegistryObject<Block> THL_WOOD_FENCE = REGISTRY.register("thl_wood_fence", () -> new THLWoodFenceBlock());
	public static final RegistryObject<Block> THL_WOOD_FENCE_GATE = REGISTRY.register("thl_wood_fence_gate", () -> new THLWoodFenceGateBlock());
	public static final RegistryObject<Block> THL_WOOD_PRESSURE_PLATE = REGISTRY.register("thl_wood_pressure_plate", () -> new THLWoodPressurePlateBlock());
	public static final RegistryObject<Block> THL_WOOD_BUTTON = REGISTRY.register("thl_wood_button", () -> new THLWoodButtonBlock());
	public static final RegistryObject<Block> THL_ORE_BLOCK = REGISTRY.register("thl_ore_block", () -> new THLOreBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}