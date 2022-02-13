package com.rosskaman.illagerairhorn.mixin;

import com.rosskaman.illagerairhorn.IllagerAirhorn;
import net.minecraft.entity.mob.IllagerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.sound.sampled.*;
import java.io.IOException;

@Mixin(IllagerEntity.class)
public class IllagerAirhornMixin {
	@Inject(at = @At("TAIL"), method = "<init>")
	public void IllagerEntityRenderer(CallbackInfo info) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		IllagerAirhorn.airhorn();
	}
}
