package com.github.yj0524.enticingdemocracy.mixins;

import com.github.yj0524.enticingdemocracy.EnticingDemocracy;
import com.github.yj0524.enticingdemocracy.event.Events;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEntity.class)
public class MobEntityMixin {
    @Inject(at = @At("RETURN"), method = "canTarget", cancellable = true)
    private void canTarget(EntityType<?> type, CallbackInfoReturnable<Boolean> cir) {
        if (EnticingDemocracy.hasTemporaryEvent(Events.notTargeted)) if (type == EntityType.PLAYER) cir.setReturnValue(false);
    }
}
