package net.mcreator.hyventuremod.procedures;

import net.minecraft.util.math.Vec3d;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.hyventuremod.HyventureModModElements;

@HyventureModModElements.ModElement.Tag
public class BubbleBerriesBushMobplayerCollidesWithPlantProcedure extends HyventureModModElements.ModElement {
	public BubbleBerriesBushMobplayerCollidesWithPlantProcedure(HyventureModModElements instance) {
		super(instance, 53);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BubbleBerriesBushMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(null, new Vec3d(0.25D, (double) 0.05F, 0.25D));
		entity.attackEntityFrom(DamageSource.CACTUS, (float) 1);
	}
}
