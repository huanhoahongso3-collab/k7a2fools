package mc.dhp.foss.k7a2fools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import mc.dhp.foss.k7a2fools.init.K7a2FoolsModFluids;

public class THLFluidItem extends BucketItem {
	public THLFluidItem() {
		super(K7a2FoolsModFluids.THL_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}