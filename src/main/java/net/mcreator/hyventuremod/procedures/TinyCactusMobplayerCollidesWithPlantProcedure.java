package net.mcreator.hyventuremod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.hyventuremod.HyventureModModElements;

@HyventureModModElements.ModElement.Tag
public class TinyCactusMobplayerCollidesWithPlantProcedure extends HyventureModModElements.ModElement {
	public TinyCactusMobplayerCollidesWithPlantProcedure(HyventureModModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TinyCactusMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.CACTUS, (float) 1);
	}
}
