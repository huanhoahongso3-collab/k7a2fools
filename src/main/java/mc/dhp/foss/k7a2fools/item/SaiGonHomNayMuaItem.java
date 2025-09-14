package mc.dhp.foss.k7a2fools.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class SaiGonHomNayMuaItem extends RecordItem {
	public SaiGonHomNayMuaItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("k7a2_fools:saigonhomnaymua")), new Item.Properties().stacksTo(64).rarity(Rarity.COMMON), 56000);
	}
}