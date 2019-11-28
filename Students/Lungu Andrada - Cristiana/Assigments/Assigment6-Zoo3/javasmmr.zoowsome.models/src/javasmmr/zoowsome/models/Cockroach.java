package javasmmr.zoowsome.models;

public class Cockroach extends Insect{
	private boolean canFly;
	private boolean isDangerous;
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	public Cockroach(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public static void main(String[] args) {
	
		Cockroach c=new Cockroach(0.9,0.1);
		c.set_canFly(false);
		c.set_isDangerous(false);
		c.set_name("Gandacul de bucatarie");
		c.set_nrOfLegs(8);
		
		System.out.println(c.get_name()+" are "+c.get_nrOfLegs()+" picioare.Poate zbura?"+
				c.get_canFly()+" .E periculos? "+c.get_isDangerous());
	}
}
