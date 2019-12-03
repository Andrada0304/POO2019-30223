package javasmmmr.zoowsome.services;
import javasmmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Dog;
import javasmmr.zoowsome.models.Monkey;
import javasmmr.zoowsome.models.Tiger;
import javasmmr.zoowsome.models.Animal;
public  class MammalsFactory extends SpeciesFactory{
	
	@Override
	public Animal getAnimal(String type) throws Exception {
		// TODO Auto-generated method stub
		if(Constants.Animals.Mammals.Dog.equals(type)) {
			return new Dog(6.4,0.4);
			
			
		}else if(Constants.Animals.Mammals.Monkey.equals(type)) {
			return new Monkey(2.9,0.4);
			
		}else if (Constants.Animals.Mammals.Tiger.contentEquals(type)) {
			return new Tiger(6.8,0.9);
			
		}
		else
			throw new Exception("Invalid animal exception");
		//return null;
	}
	//@Override
	public Animal getAnmial(String type) {

		return null;
	}

	




}
