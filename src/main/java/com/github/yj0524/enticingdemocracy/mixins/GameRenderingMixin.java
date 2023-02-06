package com.github.yj0524.enticingdemocracy.mixins;

import com.github.yj0524.enticingdemocracy.EnticingDemocracy;
import com.github.yj0524.enticingdemocracy.event.Events;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class GameRenderingMixin {
    @Inject(at = @At("RETURN"), method = "getFov", cancellable = true)
    void getFov(Camera camera, float tickDelta, boolean changingFov, CallbackInfoReturnable<Double> cir) {
        if (EnticingDemocracy.hasTemporaryEvent(Events.upsideDownScreen)) {
            cir.setReturnValue(-cir.getReturnValue());
        }
    }


}
