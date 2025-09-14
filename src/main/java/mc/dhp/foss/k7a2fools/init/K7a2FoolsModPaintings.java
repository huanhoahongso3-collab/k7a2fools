/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2fools.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

public class K7a2FoolsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, K7a2FoolsMod.MODID);
	public static final RegistryObject<PaintingVariant> DEV = REGISTRY.register("dev", () -> new PaintingVariant(16, 32));
	public static final RegistryObject<PaintingVariant> SITTING = REGISTRY.register("sitting", () -> new PaintingVariant(16, 32));
}