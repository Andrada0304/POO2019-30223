package javasmmt.zoowsome.controllers;

import javasmmmr.zoowsome.services.AnimalFactory;
import javasmmmr.zoowsome.services.Constants;
import javasmmmr.zoowsome.services.SpeciesFactory;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Aquatic;
import javasmmr.zoowsome.models.Bird;
import javasmmr.zoowsome.models.Reptile;
import javasmmr.zoowsome.models.Sarpe;
import javasmmr.zoowsome.models.Shark;
public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory=new AnimalFactory();
		SpeciesFactory speciesFactory1=abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1=speciesFactory1.getAnimal(Constants.Animals.Mammals.Dog);
		a1.set_nrOfLegs(4);
		System.out.println("We have an animal with "+a1.get_nrOfLegs()+"  legs! ");
		
		AnimalFactory abstractFactory2=new AnimalFactory();
		SpeciesFactory speciesFactory2=abstractFactory2.getSpeciesFactory(Constants.Species.Insect);
		Animal a2=speciesFactory2.getAnimal(Constants.Animals.Insects.Butterfly);
		a2.set_name("Fluture");
		System.out.println("Avem un "+a2.get_name());
		
		AnimalFactory abstractFactory3=new AnimalFactory();
		SpeciesFactory speciesFactory3=abstractFactory3.getSpeciesFactory(Constants.Species.Bird);
		Animal a3=speciesFactory3.getAnimal(Constants.Animals.Birds.Barza);
		 a3.set_nrOfLegs(2);
		System.out.println("Avem o pasare cu "+a3.get_nrOfLegs()+" picioare");
		
		AnimalFactory abstractFactory4=new AnimalFactory();
		SpeciesFactory speciesFactory4=abstractFactory4.getSpeciesFactory(Constants.Species.Aquatic);
		Animal a4=speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);
		 ((Shark) a4).set_avgSwimDepth(200);
		 a4.set_name("Rechin");
		System.out.println("Avem un "+a4.get_name()+",care poate inota pana la adancimea maxima de "+ ((Shark) a4).get_avgSwimDepth() +" m");
		
		AnimalFactory abstractFactory5=new AnimalFactory();
		SpeciesFactory speciesFactory5=abstractFactory5.getSpeciesFactory(Constants.Species.Reptile);
		Animal a5=speciesFactory5.getAnimal(Constants.Animals.Reptiles.Sarpe);
		 ((Sarpe) a5).set_laysEggs(true);
		System.out.println("Reptila din gradina zoo face oua?"+((Sarpe) a5).get_laysEggs());
		
	}
}
