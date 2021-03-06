package com.infamous.dungeons_mobs.client;

import com.infamous.dungeons_mobs.client.particle.SnowflakeParticle;
import com.infamous.dungeons_mobs.client.particle.ModParticleTypes;
import com.infamous.dungeons_mobs.client.renderer.creeper.CustomCreeperRenderer;
import com.infamous.dungeons_mobs.client.renderer.golem.SquallGolemRenderer;
import com.infamous.dungeons_mobs.client.renderer.jungle.LeapleafRenderer;
import com.infamous.dungeons_mobs.client.renderer.jungle.PoisonQuillVineRenderer;
import com.infamous.dungeons_mobs.client.renderer.jungle.QuickGrowingVineRenderer;
import com.infamous.dungeons_mobs.client.renderer.jungle.WhispererRenderer;
import com.infamous.dungeons_mobs.client.renderer.projectiles.CobwebProjectileRenderer;
import com.infamous.dungeons_mobs.client.renderer.projectiles.CustomFireballRenderer;
import com.infamous.dungeons_mobs.client.renderer.projectiles.SlimeballRenderer;
import com.infamous.dungeons_mobs.client.renderer.summonables.*;
import com.infamous.dungeons_mobs.client.renderer.undead.*;
import com.infamous.dungeons_mobs.client.renderer.illager.*;
import com.infamous.dungeons_mobs.client.renderer.redstone.RedstoneCubeRenderer;
import com.infamous.dungeons_mobs.client.renderer.redstone.RedstoneGolemRenderer;
import com.infamous.dungeons_mobs.client.renderer.redstone.RedstoneMineRenderer;
import com.infamous.dungeons_mobs.client.renderer.slime.ConjuredSlimeRenderer;
import com.infamous.dungeons_mobs.items.ModSpawnEggItem;
import com.infamous.dungeons_mobs.items.WraithFireChargeItem;
import com.infamous.dungeons_mobs.mod.ModBlocks;
import com.infamous.dungeons_mobs.mod.ModEntityTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.CreeperRenderer;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static com.infamous.dungeons_mobs.DungeonsMobs.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event){
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ARMORED_ZOMBIE.get(), CustomZombieRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JUNGLE_ZOMBIE.get(), CustomZombieRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.FROZEN_ZOMBIE.get(), CustomZombieRenderer::new);

        // To match Husk proportions found in MCD
        RenderingRegistry.registerEntityRenderingHandler(EntityType.HUSK, CustomZombieRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ARMORED_SKELETON.get(), CustomSkeletonRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MOSSY_SKELETON.get(), CustomSkeletonRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SKELETON_HORSEMAN.get(), CustomSkeletonRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SKELETON_VANGUARD.get(), SkeletonVanguardRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NECROMANCER.get(), NecromancerRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ARMORED_VINDICATOR.get(), CustomVindicatorRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ARMORED_PILLAGER.get(), CustomPillagerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ROYAL_GUARD.get(), CustomVindicatorRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.VINDICATOR_CHEF.get(), CustomVindicatorRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MOUNTAINEER.get(), MountaineerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ARMORED_MOUNTAINEER.get(), MountaineerRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ICEOLOGER.get(), IceologerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GEOMANCER.get(), GeomancerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ILLUSIONER_CLONE.get(), IllusionerCloneRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WINDCALLER.get(), WindcallerRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ICY_CREEPER.get(), CustomCreeperRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WRAITH.get(), WraithRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CONJURED_SLIME.get(), ConjuredSlimeRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_CUBE.get(), RedstoneCubeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_GOLEM.get(), RedstoneGolemRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WHISPERER.get(), WhispererRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LEAPLEAF.get(), LeapleafRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.POISON_QUILL_VINE.get(), PoisonQuillVineRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.QUICK_GROWING_VINE.get(), QuickGrowingVineRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SQUALL_GOLEM.get(), SquallGolemRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WRAITH_FIREBALL.get(), CustomFireballRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SLIMEBALL.get(), SlimeballRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COBWEB_PROJECTILE.get(), CobwebProjectileRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GEOMANCER_WALL.get(), GeomancerWallRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GEOMANCER_BOMB.get(), GeomancerBombRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REDSTONE_MINE.get(), RedstoneMineRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ICE_CLOUD.get(), IceCloudRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TORNADO.get(), TornadoRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.COBWEB_TRAP.get(), CobwebTrapRenderer::new);

        RenderTypeLookup.setRenderLayer(ModBlocks.WRAITH_FIRE_BLOCK.get(), RenderType.getCutout());

    }

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event){
        ModSpawnEggItem.initSpawnEggs();
        WraithFireChargeItem.initSoulFireCharge();
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onParticleFactory(ParticleFactoryRegisterEvent event){
        Minecraft.getInstance().particles.registerFactory(ModParticleTypes.SNOWFLAKE.get(), SnowflakeParticle.Factory::new);
    }
}
