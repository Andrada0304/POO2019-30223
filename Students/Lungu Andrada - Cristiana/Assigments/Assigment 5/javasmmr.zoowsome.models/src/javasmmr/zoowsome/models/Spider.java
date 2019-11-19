package javasmmr.zoowsome.models;

public class Spider extends Insect{
	private boolean canFly;
	private boolean isDangerous;
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	public Spider(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public static void main(String[] args) {
	
		Spider s=new Spider(1.2,0.7);
		s.set_canFly(false);
		s.set_isDangerous(true);
		s.set_name("Paianjenul");
		s.set_nrOfLegs(8);
		
		System.out.println(s.get_name()+" are "+s.get_nrOfLegs()+" picioare.Poate zbura?"+
				s.get_canFly()+" .E periculos? "+s.get_isDangerous());
	}
}
