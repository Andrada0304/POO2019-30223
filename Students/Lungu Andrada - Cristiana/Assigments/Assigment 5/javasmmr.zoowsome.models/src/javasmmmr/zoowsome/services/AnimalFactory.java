package javasmmmr.zoowsome.services;

public class AnimalFactory {
	public SpeciesFactory getSpeciesFactory(String type) throws Exception  {
		if(Constants.Species.Mammals.equals(type)) {
			return new MammalsFactory();
		}else 
		if(Constants.Species.Insect.equals(type)) {
			return new InsectFactory();
		}else
			if(Constants.Species.Aquatic.equals(type)) {
				return new AquaticFactory();
			}else
				if(Constants.Species.Bird.equals(type)) {
					return new BirdsFactory();
				}else
					if(Constants.Species.Reptile.equals(type)) {
						return new ReptileFactory();
	}else
		throw new Exception("Invalid species exceptions");
}
}
