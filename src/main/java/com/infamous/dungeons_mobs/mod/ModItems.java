package com.infamous.dungeons_mobs.mod;

import com.infamous.dungeons_mobs.items.*;
import com.infamous.dungeons_mobs.items.shield.RoyalGuardShieldItem;
import com.infamous.dungeons_mobs.items.shield.SkeletonVanguardShieldItem;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.infamous.dungeons_mobs.DungeonsMobs.DUNGEONS_MOBS;
import static com.infamous.dungeons_mobs.DungeonsMobs.MODID;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // ZOMBIES
    public static final RegistryObject<ModSpawnEggItem> ARMORED_ZOMBIE_SPAWN_EGG = ITEMS.register("armored_zombie_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ARMORED_ZOMBIE,
                    44975, 7969893,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> JUNGLE_ZOMBIE_SPAWN_EGG = ITEMS.register("jungle_zombie_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.JUNGLE_ZOMBIE,
                    44975, 7969893,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> FROZEN_ZOMBIE_SPAWN_EGG = ITEMS.register("frozen_zombie_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.FROZEN_ZOMBIE,
                    44975, 7969893,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    // SKELETONS
    public static final RegistryObject<ModSpawnEggItem> ARMORED_SKELETON_SPAWN_EGG = ITEMS.register("armored_skeleton_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ARMORED_SKELETON,
                    12698049, 4802889,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> MOSSY_SKELETON_SPAWN_EGG = ITEMS.register("mossy_skeleton_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.MOSSY_SKELETON,
                    12698049, 4802889,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> SKELETON_VANGUARD_SPAWN_EGG = ITEMS.register("skeleton_vanguard_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.SKELETON_VANGUARD,
                    12698049, 4802889,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> SKELETON_HORSEMAN_SPAWN_EGG = ITEMS.register("skeleton_horseman_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.SKELETON_HORSEMAN,
                    12698049, 4802889,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> NECROMANCER_SPAWN_EGG = ITEMS.register("necromancer_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.NECROMANCER,
                    12698049, 4802889,
                    new Item.Properties().group(DUNGEONS_MOBS)));


    // ILLAGERS
    public static final RegistryObject<ModSpawnEggItem> ARMORED_VINDICATOR_SPAWN_EGG = ITEMS.register("armored_vindicator_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ARMORED_VINDICATOR,
                    9804699, 2580065,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> ARMORED_PILLAGER_SPAWN_EGG = ITEMS.register("armored_pillager_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ARMORED_PILLAGER,
                    5451574, 9804699,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> ROYAL_GUARD_SPAWN_EGG = ITEMS.register("royal_guard_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ROYAL_GUARD,
                    9804699, 2580065,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> ILLUSIONER_SPAWN_EGG = ITEMS.register("illusioner_spawn_egg",
            () -> new ModSpawnEggItem(EntityType.ILLUSIONER,
                    9804699, 1973274,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> ICEOLOGER_SPAWN_EGG = ITEMS.register("iceologer_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ICEOLOGER,
                    9804699, 1973274,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> GEOMANCER_SPAWN_EGG = ITEMS.register("geomancer_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.GEOMANCER,
                    9804699, 1973274,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> WINDCALLER_SPAWN_EGG = ITEMS.register("windcaller_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.WINDCALLER,
                    9804699, 1973274,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> VINDICATOR_CHEF_SPAWN_EGG = ITEMS.register("vindicator_chef_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.VINDICATOR_CHEF,
                    9804699, 2580065,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> MOUNTAINEER_SPAWN_EGG = ITEMS.register("mountaineer_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.MOUNTAINEER,
                    9804699, 2580065,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> ARMORED_MOUNTAINEER_SPAWN_EGG = ITEMS.register("armored_mountaineer_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ARMORED_MOUNTAINEER,
                    9804699, 2580065,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    // CREEPERS
    public static final RegistryObject<ModSpawnEggItem> ICY_CREEPER_SPAWN_EGG = ITEMS.register("icy_creeper_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ICY_CREEPER,
                    894731, 0,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    // WRAITH
    public static final RegistryObject<ModSpawnEggItem> WRAITH_SPAWN_EGG = ITEMS.register("wraith_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.WRAITH,
                    4411786, 8978176,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    // SLIME
    public static final RegistryObject<ModSpawnEggItem> CONJURED_SLIME_SPAWN_EGG = ITEMS.register("conjured_slime_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.CONJURED_SLIME,
                    5349438, 8306542,
                    new Item.Properties().group(DUNGEONS_MOBS)));
    // REDSTONE
    public static final RegistryObject<ModSpawnEggItem> REDSTONE_CUBE_SPAWN_EGG = ITEMS.register("redstone_cube_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.REDSTONE_CUBE,
                    10489616, 12040119,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> REDSTONE_GOLEM_SPAWN_EGG = ITEMS.register("redstone_golem_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.REDSTONE_GOLEM,
                    12040119, 10489616,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    // JUNGLE
    public static final RegistryObject<ModSpawnEggItem> WHISPERER_SPAWN_EGG = ITEMS.register("whisperer_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.WHISPERER,
                    894731, 0,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> LEAPLEAF_SPAWN_EGG = ITEMS.register("leapleaf_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.LEAPLEAF,
                    894731, 0,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> POISON_QUILL_VINE_SPAWN_EGG = ITEMS.register("poison_quill_vine_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.POISON_QUILL_VINE,
                    894731, 0,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<ModSpawnEggItem> QUICK_GROWING_VINE_SPAWN_EGG = ITEMS.register("quick_growing_vine_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.QUICK_GROWING_VINE,
                    894731, 0,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    // GOLEM
    public static final RegistryObject<ModSpawnEggItem> SQUALL_GOLEM_SPAWN_EGG = ITEMS.register("squall_golem_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.SQUALL_GOLEM,
                    13552826, 7632531,
                    new Item.Properties().group(DUNGEONS_MOBS)));

    // SHIELD
    public static final RegistryObject<Item> ROYAL_GUARD_SHIELD = ITEMS.register("royal_guard_shield",
            () -> new RoyalGuardShieldItem(new Item.Properties().group(DUNGEONS_MOBS).maxDamage(336)));

    public static final RegistryObject<Item> SKELETON_VANGUARD_SHIELD = ITEMS.register("skeleton_vanguard_shield",
            () -> new SkeletonVanguardShieldItem(new Item.Properties().group(DUNGEONS_MOBS).maxDamage(336)));

    // HELMETS
    public static final RegistryObject<Item> GOLD_PILLAGER_HELMET = ITEMS.register("gold_pillager_helmet",
            () -> new PillagerHelmetItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(DUNGEONS_MOBS), false));

    public static final RegistryObject<Item> DIAMOND_PILLAGER_HELMET = ITEMS.register("diamond_pillager_helmet",
            () -> new PillagerHelmetItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(DUNGEONS_MOBS), true));

    public static final RegistryObject<Item> GOLD_VINDICATOR_HELMET = ITEMS.register("gold_vindicator_helmet",
            () -> new VindicatorHelmetItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(DUNGEONS_MOBS), false));

    public static final RegistryObject<Item> DIAMOND_VINDICATOR_HELMET = ITEMS.register("diamond_vindicator_helmet",
            () -> new VindicatorHelmetItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(DUNGEONS_MOBS), true));

    public static final RegistryObject<Item> SKELETON_VANGUARD_HELMET = ITEMS.register("skeleton_vanguard_helmet",
            () -> new SkeletonVanguardHelmetItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<Item> CHEF_HAT = ITEMS.register("chef_hat",
            () -> new ChefHatItem(ArmorMaterial.LEATHER, EquipmentSlotType.HEAD, new Item.Properties().group(DUNGEONS_MOBS)));


    // SOUL FIRE CHARGE
    public static final RegistryObject<WraithFireChargeItem> WRAITH_FIRE_CHARGE = ITEMS.register("wraith_fire_charge",
            () -> new WraithFireChargeItem(new Item.Properties().group(DUNGEONS_MOBS)));

    // SPATULA
    public static final RegistryObject<Item> SPATULA = ITEMS.register("spatula",
            () -> new SpatulaItem(ItemTier.WOOD, 0.5F, (2.0F-4.0F), new Item.Properties().group(DUNGEONS_MOBS)));

    // MOUNTAINEER AXES
    public static final RegistryObject<Item> MOUNTAINEER_AXE = ITEMS.register("mountaineer_axe",
            () -> new MountaineerAxeItem(ItemTier.IRON, 1, (1.2F-4.0F), new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<Item> GOLD_MOUNTAINEER_AXE = ITEMS.register("gold_mountaineer_axe",
            () -> new MountaineerAxeItem(ItemTier.IRON, 1, (1.2F-4.0F), new Item.Properties().group(DUNGEONS_MOBS)));

    public static final RegistryObject<Item> DIAMOND_MOUNTAINEER_AXE = ITEMS.register("diamond_mountaineer_axe",
            () -> new MountaineerAxeItem(ItemTier.DIAMOND, 1, (1.2F-4.0F), new Item.Properties().group(DUNGEONS_MOBS)));

    // STAFFS
    public static final RegistryObject<Item> WINDCALLER_STAFF = ITEMS.register("windcaller_staff",
            () -> new WindcallerStaffItem(new Item.Properties().group(DUNGEONS_MOBS).maxDamage(64)));

    public static final RegistryObject<Item> GEOMANCER_STAFF = ITEMS.register("geomancer_staff",
            () -> new GeomancerStaffItem(new Item.Properties().group(DUNGEONS_MOBS).maxDamage(64)));

    public static final RegistryObject<Item> NECROMANCER_STAFF = ITEMS.register("necromancer_staff",
            () -> new NecromancerStaffItem(new Item.Properties().group(DUNGEONS_MOBS).maxDamage(64)));
}
