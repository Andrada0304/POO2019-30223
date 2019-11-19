package javasmmr.zoowsome.models;

public class Reptile extends Animal {
	

	private boolean laysEggs;
	final double maintenanceCost;
	final double dangerPerc;
	Reptile(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public boolean get_laysEggs() {
		return this.laysEggs;
	
	}
	
	public void set_laysEggs(boolean laysEggs) {
		this.laysEggs=laysEggs;
	}

}
