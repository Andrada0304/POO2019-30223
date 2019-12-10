package javasmmmr.zoowsome.services;
import javasmmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Barza;
import javasmmr.zoowsome.models.Vultur;
import javasmmr.zoowsome.models.Papagal;
import java.lang.*;
public class BirdsFactory extends SpeciesFactory{
	@Override
	public Animal getAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		//eturn null;

		if(Constants.Animals.Birds.Barza.equals(type)) {
			return new Barza(7.6,0.1);
			
		}else if(Constants.Animals.Birds.Vultur.equals(type)) {
			return new Vultur(2.5,0.5);
			
		}else if (Constants.Animals.Birds.Papagal.contentEquals(type)) {
			return new Papagal(2,0.2);
			
		}
		else
			throw new Exception("Invalid animal exception");
	}
	
	//@Override
	public Animal getAnmial(String type) {
	
			return null;
	}

	
}