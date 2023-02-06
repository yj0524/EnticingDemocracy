package com.github.yj0524.enticingdemocracy.mixins;

import com.github.yj0524.enticingdemocracy.EnticingDemocracy;
import com.github.yj0524.enticingdemocracy.event.Events;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.client.sound.SoundSystem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SoundSystem.class)
class SoundSystemMixin {
    @Inject(at = @At("HEAD"), method = "play(Lnet/minecraft/client/sound/SoundInstance;)V", cancellable = true)
    private void play(SoundInstance sound, CallbackInfo ci) {
        if (EnticingDemocracy.hasTemporaryEvent(Events.hearingImpairment)) ci.cancel();
    }
}