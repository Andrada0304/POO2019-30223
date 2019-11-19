package javasmmr.zoowsome.models;

public class Mammal extends Animal {
	private double normalBodyTemp;
	private double percBodyHair;
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	Mammal(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
		
	}
	
	/*Mammal(double normalBodyTemp,double percBodyHair,int nrOfLegs,String name){
		this.name="Mammal";
		this.normalBodyTemp=32;
		this.nrOfLegs=4;
		this.percBodyHair=90;
	}*/
	

	public double get_normalBodyTemp() {
		return this.normalBodyTemp;
	}
	
	public double get_percBodyHair() {
		return this.percBodyHair;
	}
	
	public void set_normalBodyTemp(double normalBodyTemp) {
		this.normalBodyTemp=normalBodyTemp;
	}
	
	public void set_percBodyHair(double percBodyHair) {
		this.percBodyHair=percBodyHair;
	}

	

}