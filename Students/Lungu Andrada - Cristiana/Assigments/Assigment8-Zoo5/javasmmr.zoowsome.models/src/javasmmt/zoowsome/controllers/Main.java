package javasmmt.zoowsome.controllers;

import javasmmmr.zoowsome.services.AnimalFactory;
import javasmmmr.zoowsome.services.Constants;
import javasmmmr.zoowsome.services.SpeciesFactory;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.MainMenuFrame;

public class Main {
	public static void main(String[] args) throws Exception {
		new MainMenuController(new MainMenuFrame("Main Menu"), false);
		
	}
}
