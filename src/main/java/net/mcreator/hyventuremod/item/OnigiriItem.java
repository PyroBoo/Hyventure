
package net.mcreator.hyventuremod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.hyventuremod.itemgroup.HyventureTabItemGroup;
import net.mcreator.hyventuremod.HyventureModModElements;

@HyventureModModElements.ModElement.Tag
public class OnigiriItem extends HyventureModModElements.ModElement {
	@ObjectHolder("hyventure_mod:onigiri")
	public static final Item block = null;
	public OnigiriItem(HyventureModModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(HyventureTabItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(4).saturation(0.1f).build()));
			setRegistryName("onigiri");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 24;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
