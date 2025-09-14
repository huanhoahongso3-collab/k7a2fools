package mc.dhp.foss.k7a2fools.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class XeDapLachCachItem extends RecordItem {
	public XeDapLachCachItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("k7a2_fools:xedaplachcach")), new Item.Properties().stacksTo(64).rarity(Rarity.COMMON), 56000);
	}
}