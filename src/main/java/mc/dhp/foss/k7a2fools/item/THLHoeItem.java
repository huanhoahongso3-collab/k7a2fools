package mc.dhp.foss.k7a2fools.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import mc.dhp.foss.k7a2fools.init.K7a2FoolsModItems;

public class THLHoeItem extends HoeItem {
	public THLHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 6280;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 140;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(K7a2FoolsModItems.THL_ORE_DUST.get()));
			}
		}, 0, 26f, new Item.Properties());
	}
}