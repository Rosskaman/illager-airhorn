package com.rosskaman.illagerairhorn;

import net.fabricmc.api.ModInitializer;

import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IllagerAirhorn implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Illager airhorn");
	}

	public static void airhorn() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		InputStream input = IllagerAirhorn.class.getClassLoader().getResourceAsStream("airhorn.wav");
		assert input != null;

		InputStream buffered = new BufferedInputStream(input);
		AudioInputStream audiostream = AudioSystem.getAudioInputStream(buffered);

		Clip clip = AudioSystem.getClip();
		clip.open(audiostream);
		clip.loop(1);
	}
}
