
package net.mcreator.hyventuremod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.hyventuremod.block.BubblewoodLogBlock;
import net.mcreator.hyventuremod.HyventureModModElements;

@HyventureModModElements.ModElement.Tag
public class HyventureTabItemGroup extends HyventureModModElements.ModElement {
	public HyventureTabItemGroup(HyventureModModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabhyventure_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BubblewoodLogBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
