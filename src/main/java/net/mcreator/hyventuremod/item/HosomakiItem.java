
package net.mcreator.hyventuremod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.hyventuremod.itemgroup.HyventureTabItemGroup;
import net.mcreator.hyventuremod.HyventureModModElements;

@HyventureModModElements.ModElement.Tag
public class HosomakiItem extends HyventureModModElements.ModElement {
	@ObjectHolder("hyventure_mod:hosomaki")
	public static final Item block = null;
	public HosomakiItem(HyventureModModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(HyventureTabItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(2).saturation(0.1f).build()));
			setRegistryName("hosomaki");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 20;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
