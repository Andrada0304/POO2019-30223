package javasmmmr.zoowsome.services;

import javasmmr.zoowsome.models.Animal;

public abstract class SpeciesFactory {
	public abstract Animal getAnimal(String type) throws Exception;

	public abstract Animal getAnmial(String type);
		
}
