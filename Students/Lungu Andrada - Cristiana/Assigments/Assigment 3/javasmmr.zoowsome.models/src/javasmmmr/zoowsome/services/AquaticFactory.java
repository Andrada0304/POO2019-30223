package javasmmmr.zoowsome.services;

import javasmmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Dog;
import javasmmr.zoowsome.models.Monkey;
import javasmmr.zoowsome.models.Tiger;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Shark;
import javasmmr.zoowsome.models.Pastrav;
import javasmmr.zoowsome.models.Balena;

public class AquaticFactory extends SpeciesFactory{

	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
			
		}else if(Constants.Animals.Aquatics.Balena.equals(type)) {
			return new Balena();
			
		}else if (Constants.Animals.Aquatics.Pastrav.contentEquals(type)) {
			return new Pastrav();
			
		}
		else
			throw new Exception("Invalid animal exception");
	}
	
	public Animal getAnmial(String type)  {
		return null;
	}



	
}
