package javasmmr.zoowsome.models;

public class Bird extends Animal {
	private boolean migrates;
	private int avgFlightAttitude;
	private int nrOfLegs;
	final double maintenanceCost;
	final double dangerPerc;
	private String name;
	
	Bird(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	public boolean get_migrates() {
		return this.migrates;
	}
	public int get_avgFlightAttitude() {
		return this.avgFlightAttitude;
	}
	
	public void set_migrates(boolean migrates) {
		this.migrates=migrates;
	}
	
	public void set_avgFlightAttitude(int avgFlightAttitude) {
		this.avgFlightAttitude=avgFlightAttitude;
	}

	
}
