package mc.dhp.foss.k7a2fools.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import mc.dhp.foss.k7a2fools.world.inventory.CasioTeleportGUIMenu;
import mc.dhp.foss.k7a2fools.network.CasioTeleportGUIButtonMessage;
import mc.dhp.foss.k7a2fools.init.K7a2FoolsModScreens;
import mc.dhp.foss.k7a2fools.K7a2FoolsMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class CasioTeleportGUIScreen extends AbstractContainerScreen<CasioTeleportGUIMenu> implements K7a2FoolsModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	EditBox X;
	EditBox Y;
	EditBox Z;
	Button button_ok;

	public CasioTeleportGUIScreen(CasioTeleportGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("k7a2_fools:textures/screens/casio_teleport_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		X.render(guiGraphics, mouseX, mouseY, partialTicks);
		Y.render(guiGraphics, mouseX, mouseY, partialTicks);
		Z.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (X.isFocused())
			return X.keyPressed(key, b, c);
		if (Y.isFocused())
			return Y.keyPressed(key, b, c);
		if (Z.isFocused())
			return Z.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		X.tick();
		Y.tick();
		Z.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String XValue = X.getValue();
		String YValue = Y.getValue();
		String ZValue = Z.getValue();
		super.resize(minecraft, width, height);
		X.setValue(XValue);
		Y.setValue(YValue);
		Z.setValue(ZValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.k7a2_fools.casio_teleport_gui.label_casio_teleporter"), 37, 8, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		X = new EditBox(this.font, this.leftPos + 30, this.topPos + 32, 118, 18, Component.translatable("gui.k7a2_fools.casio_teleport_gui.X"));
		X.setHint(Component.translatable("gui.k7a2_fools.casio_teleport_gui.X"));
		X.setMaxLength(8192);
		X.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "X", content, false);
		});
		this.addWidget(this.X);
		Y = new EditBox(this.font, this.leftPos + 30, this.topPos + 74, 118, 18, Component.translatable("gui.k7a2_fools.casio_teleport_gui.Y"));
		Y.setHint(Component.translatable("gui.k7a2_fools.casio_teleport_gui.Y"));
		Y.setMaxLength(8192);
		Y.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "Y", content, false);
		});
		this.addWidget(this.Y);
		Z = new EditBox(this.font, this.leftPos + 30, this.topPos + 113, 118, 18, Component.translatable("gui.k7a2_fools.casio_teleport_gui.Z"));
		Z.setHint(Component.translatable("gui.k7a2_fools.casio_teleport_gui.Z"));
		Z.setMaxLength(8192);
		Z.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "Z", content, false);
		});
		this.addWidget(this.Z);
		button_ok = new PlainTextButton(this.leftPos + 82, this.topPos + 141, 35, 20, Component.translatable("gui.k7a2_fools.casio_teleport_gui.button_ok"), e -> {
			int x = CasioTeleportGUIScreen.this.x;
			int y = CasioTeleportGUIScreen.this.y;
			if (true) {
				K7a2FoolsMod.PACKET_HANDLER.sendToServer(new CasioTeleportGUIButtonMessage(0, x, y, z));
				CasioTeleportGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}, this.font);
		this.addRenderableWidget(button_ok);
	}
}