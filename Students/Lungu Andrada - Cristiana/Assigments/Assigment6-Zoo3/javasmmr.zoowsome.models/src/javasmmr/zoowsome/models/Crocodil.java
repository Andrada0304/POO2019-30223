package javasmmr.zoowsome.models;

public class Crocodil extends Reptile{
	final double maintenanceCost;
	final double dangerPerc;
	public Crocodil(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public static void main(String[] args) {
		Crocodil croc=new Crocodil(7.6,0.8);
		croc.set_name("Crocodilul");
		croc.set_nrOfLegs(4);
		croc.set_laysEggs(true);
		
		System.out.println(croc.get_name()+" are "+croc.get_nrOfLegs()+" picioare. Face oua? "+croc.get_laysEggs()+croc.maintenanceCost);
	}

}
