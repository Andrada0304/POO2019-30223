package javasmmr.zoowsome.models;

public class Testoasa extends Reptile{
	final double maintenanceCost;
	final double dangerPerc;
	public Testoasa(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public static void main(String[] args) {
		Testoasa tes=new Testoasa(3.1,0.1);
		tes.set_name("Testoasa");
		tes.set_nrOfLegs(4);
		tes.set_laysEggs(true);
		
		System.out.println(tes.get_name()+" are "+tes.get_nrOfLegs()+" picioare. Face oua? "+tes.get_laysEggs());
	}
}
