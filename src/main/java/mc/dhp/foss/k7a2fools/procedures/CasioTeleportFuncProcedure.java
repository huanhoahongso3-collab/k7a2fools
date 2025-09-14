package mc.dhp.foss.k7a2fools.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import mc.dhp.foss.k7a2fools.init.K7a2FoolsModMenus;

public class CasioTeleportFuncProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert((entity instanceof Player _entity0 && _entity0.containerMenu instanceof K7a2FoolsModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "X", "") : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert((entity instanceof Player _entity1 && _entity1.containerMenu instanceof K7a2FoolsModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(0, "Y", "") : ""), new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert((entity instanceof Player _entity2 && _entity2.containerMenu instanceof K7a2FoolsModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "Z", "") : ""));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity0 && _entity0.containerMenu instanceof K7a2FoolsModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "X", "") : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity1 && _entity1.containerMenu instanceof K7a2FoolsModMenus.MenuAccessor _menu1) ? _menu1.getMenuState(0, "Y", "") : ""), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity2 && _entity2.containerMenu instanceof K7a2FoolsModMenus.MenuAccessor _menu2) ? _menu2.getMenuState(0, "Z", "") : ""), _ent.getYRot(), _ent.getXRot());
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"clear @p k7a2_fools:casio 1");
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}