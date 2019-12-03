package javasmmr.zoowsome.models;

public class Monkey extends Mammal{

	private double normalBodyTemp;
	private double percBodyHair;
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	public Monkey (double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public static void main(String[] args) {

	Monkey mky=new Monkey(2.9,0.4);
	mky.set_name("Maimuta");
	mky.set_nrOfLegs(2);
	mky.set_percBodyHair(75.0);
	mky.set_normalBodyTemp(37.0);
	
	System.out.println(mky.get_name()+" are "+mky.get_nrOfLegs()+" picioare,un procent de "+
	mky.get_percBodyHair()+" % de par si temperatura corpului de "+mky.get_normalBodyTemp()+
	" grade ");
	}
}
