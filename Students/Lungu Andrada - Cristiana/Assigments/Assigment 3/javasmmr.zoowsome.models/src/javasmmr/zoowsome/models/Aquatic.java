package javasmmr.zoowsome.models;

//import javasmmr.zoowsome.models.Shark.waterType;

public class Aquatic extends Animal{
	
	private int avgSwimDepth;
	//private waterType type;
	//private Object waterType;
	enum waterType {
		SALTWATER,
		FRESHWATER;
		//public static waterType type;
	}
	private waterType type;
	
	Aquatic(){
		super();
	}
	public int get_avgSwimDepth() {
		return this.avgSwimDepth;
	}
	//waterType type=waterType.SALTWATER;
	
	public waterType get_waterType() {
		return this.type;
	}
	
	public void set_avgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth=avgSwimDepth;
	}
	public void set_waterType(waterType type) {
		
		this.type= type;
		
	}
	
}
