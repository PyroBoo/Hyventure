
package net.mcreator.hyventuremod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.hyventuremod.itemgroup.HyventureTabItemGroup;
import net.mcreator.hyventuremod.HyventureModModElements;

@HyventureModModElements.ModElement.Tag
public class BubblewoodStickItem extends HyventureModModElements.ModElement {
	@ObjectHolder("hyventure_mod:bubblewood_stick")
	public static final Item block = null;
	public BubblewoodStickItem(HyventureModModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(HyventureTabItemGroup.tab).maxStackSize(64));
			setRegistryName("bubblewood_stick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
