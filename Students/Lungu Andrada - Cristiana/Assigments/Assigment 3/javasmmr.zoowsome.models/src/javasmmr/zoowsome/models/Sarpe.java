package javasmmr.zoowsome.models;

public class Sarpe extends Reptile{

	public Sarpe(){
		super();
	}
	
	public static void main(String[] args) {
		Sarpe snk=new Sarpe();
		snk.set_name("Sarpele");
		snk.set_nrOfLegs(0);
		snk.set_laysEggs(true);
		
		System.out.println(snk.get_name()+" are "+snk.get_nrOfLegs()+" picioare. Face oua? "+snk.get_laysEggs());
	}
}
