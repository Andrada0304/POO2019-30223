package javasmmr.zoowsome.models;

public class Crocodil extends Reptile{
	public Crocodil(){
		super();
	}
	
	public static void main(String[] args) {
		Crocodil croc=new Crocodil();
		croc.set_name("Crocodilul");
		croc.set_nrOfLegs(4);
		croc.set_laysEggs(true);
		
		System.out.println(croc.get_name()+" are "+croc.get_nrOfLegs()+" picioare. Face oua? "+croc.get_laysEggs());
	}

}
