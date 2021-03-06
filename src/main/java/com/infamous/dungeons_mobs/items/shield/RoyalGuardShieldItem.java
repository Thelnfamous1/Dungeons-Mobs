package com.infamous.dungeons_mobs.items.shield;

import net.minecraft.block.DispenserBlock;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.concurrent.Callable;

public class RoyalGuardShieldItem extends ShieldItem {
    public RoyalGuardShieldItem(Properties builder) {
        super(builder.setISTER(RoyalGuardShieldItem::getISTER));
        DispenserBlock.registerDispenseBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
    }

    /**
     * Return whether this item is repairable in an anvil.
     */
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return false;
    }

    //@OnlyIn(Dist.CLIENT)
    private static Callable<ItemStackTileEntityRenderer> getISTER() {
        return ShieldTileEntityRenderer::new;
    }

    @Override
    public boolean isShield(ItemStack stack, @Nullable LivingEntity entity) {
        return true;
    }
}
