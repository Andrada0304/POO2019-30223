package javasmmr.zoowsome.models;

public class Insect extends Animal{
	private boolean canFly;
	private boolean isDangerous;
	private int nrOfLegs;
	private String name;
	Insect(){
		super();
		
	}
	
	public boolean get_canFly() {
		return this.canFly;
	}
	
	public boolean get_isDangerous() {
		return this.isDangerous;
		
	}
	
	public void set_canFly(boolean canFly) {
		this.canFly=canFly;
	}
	
	public void set_isDangerous(boolean isDangerous){
		this.isDangerous=isDangerous;
	}
}
