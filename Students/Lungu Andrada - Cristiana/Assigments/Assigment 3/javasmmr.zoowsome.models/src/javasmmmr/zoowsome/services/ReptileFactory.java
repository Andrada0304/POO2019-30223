package javasmmmr.zoowsome.services;

import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Testoasa;
import javasmmr.zoowsome.models.Crocodil;
import javasmmr.zoowsome.models.Sarpe;

public class ReptileFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Reptiles.Testoasa.equals(type)) {
			return new Testoasa();
			
		}else if(Constants.Animals.Reptiles.Sarpe.equals(type)) {
			return new Sarpe();
			
		}else if (Constants.Animals.Reptiles.Crocodil.contentEquals(type)) {
			return new Crocodil();
			
		}
		else
			throw new Exception("Invalid animal exception");
	}
	public Animal getAnmial(String type)  {
		return null;
	}

	

		
	}

