package javasmmmr.zoowsome.services;

import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Cockroach;
import javasmmr.zoowsome.models.Butterfly;
import javasmmr.zoowsome.models.Spider;

public class InsectFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {
		if(Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach(0.9,0.1);
			
		}else if(Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly(2.3,0.1);
			
		}else if (Constants.Animals.Insects.Spider.contentEquals(type)) {
			return new Spider(1.2,0.7);
			
		}
		else
			throw new Exception("Invalid animal exception");
	}
	public Animal getAnmial(String type)  {
		return null;
	}

	
		
		
	
}