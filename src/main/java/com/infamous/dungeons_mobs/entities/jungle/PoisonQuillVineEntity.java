package com.infamous.dungeons_mobs.entities.jungle;

import com.infamous.dungeons_mobs.goals.MobHurtByTargetGoal;
import com.infamous.dungeons_mobs.mod.ModEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class PoisonQuillVineEntity extends VineEntity implements IRangedAttackMob {

    public PoisonQuillVineEntity(World world) {
        super(ModEntityTypes.POISON_QUILL_VINE.get(), world);
    }

    public PoisonQuillVineEntity(EntityType<? extends PoisonQuillVineEntity> entityType, World world) {
        super(entityType, world);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return VineEntity.setCustomAttributes();
    }

    public PoisonQuillVineEntity(World worldIn, double x, double y, double z, LivingEntity casterIn, int lifeTicks) {
        super(ModEntityTypes.POISON_QUILL_VINE.get(), worldIn, x, y, z, casterIn, lifeTicks);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new RangedAttackGoal(this,  0.0D, 40, 20.0F));

        this.targetSelector.addGoal(0, new MobHurtByTargetGoal(this, VineEntity.class));
        this.targetSelector.addGoal(1, (new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true)));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, false));
    }

    @Override
    public void attackEntityWithRangedAttack(LivingEntity target, float distanceFactor) {
        ItemStack itemstack = new ItemStack(Items.TIPPED_ARROW);
        PotionUtils.addPotionToItemStack(itemstack, Potions.POISON);
        AbstractArrowEntity abstractarrowentity = ProjectileHelper.fireArrow(this, itemstack, distanceFactor);
        double xDifference = target.getPosX() - this.getPosX();
        double yDifference = target.getPosYHeight(0.3333333333333333D) - abstractarrowentity.getPosY();
        double zDifference = target.getPosZ() - this.getPosZ();
        float adjustedHorizontalDistanceSq = MathHelper.sqrt(xDifference * xDifference + zDifference * zDifference) * 0.2F;
        abstractarrowentity.shoot(xDifference, yDifference + (double)adjustedHorizontalDistanceSq, zDifference, 1.5F, 10.0F - 10.0F);
        if (!this.isSilent()) {
            this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ENTITY_LLAMA_SPIT, this.getSoundCategory(), 1.0F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F);
        }

        this.world.addEntity(abstractarrowentity);
    }

}
