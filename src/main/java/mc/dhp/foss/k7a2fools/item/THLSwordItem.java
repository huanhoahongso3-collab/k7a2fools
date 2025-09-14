package mc.dhp.foss.k7a2fools.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import mc.dhp.foss.k7a2fools.init.K7a2FoolsModItems;

public class THLSwordItem extends SwordItem {
	public THLSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6280;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 56f;
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
		}, 3, 12f, new Item.Properties());
	}
}