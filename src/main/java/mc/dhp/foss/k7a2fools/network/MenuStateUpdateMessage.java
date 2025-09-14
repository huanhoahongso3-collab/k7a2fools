package mc.dhp.foss.k7a2fools.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.client.Minecraft;

import mc.dhp.foss.k7a2fools.init.K7a2FoolsModScreens;
import mc.dhp.foss.k7a2fools.init.K7a2FoolsModMenus;
import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MenuStateUpdateMessage {
	private final int elementType;
	private final String name;
	private final Object elementState;

	public MenuStateUpdateMessage(FriendlyByteBuf buffer) {
		this.elementType = buffer.readInt();
		this.name = buffer.readUtf();
		Object elementState = null;
		if (elementType == 0) {
			elementState = buffer.readUtf();
		} else if (elementType == 1) {
			elementState = buffer.readBoolean();
		}
		this.elementState = elementState;
	}

	public MenuStateUpdateMessage(int elementType, String name, Object elementState) {
		this.elementType = elementType;
		this.name = name;
		this.elementState = elementState;
	}

	public static void buffer(MenuStateUpdateMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.elementType);
		buffer.writeUtf(message.name);
		if (message.elementType == 0) {
			buffer.writeUtf((String) message.elementState);
		} else if (message.elementType == 1) {
			buffer.writeBoolean((boolean) message.elementState);
		}
	}

	public static void handler(MenuStateUpdateMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		if (message.name.length() > 256 || message.elementState instanceof String string && string.length() > 8192)
			return;
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			if (context.getSender().containerMenu instanceof K7a2FoolsModMenus.MenuAccessor menu) {
				menu.getMenuState().put(message.elementType + ":" + message.name, message.elementState);
				if (!context.getDirection().getReceptionSide().isServer() && Minecraft.getInstance().screen instanceof K7a2FoolsModScreens.ScreenAccessor accessor) {
					accessor.updateMenuState(message.elementType, message.name, message.elementState);
				}
			}
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		K7a2FoolsMod.addNetworkMessage(MenuStateUpdateMessage.class, MenuStateUpdateMessage::buffer, MenuStateUpdateMessage::new, MenuStateUpdateMessage::handler);
	}
}