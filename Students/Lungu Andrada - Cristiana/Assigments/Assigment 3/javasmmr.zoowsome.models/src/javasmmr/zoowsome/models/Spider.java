package javasmmr.zoowsome.models;

public class Spider extends Insect{
	private boolean canFly;
	private boolean isDangerous;
	private int nrOfLegs;
	private String name;
	
	public Spider(){
		super();
	}
	
	public static void main(String[] args) {
	
		Insect i=new Insect();
		Spider s=new Spider();
		s.set_canFly(false);
		s.set_isDangerous(true);
		s.set_name("Paianjenul");
		s.set_nrOfLegs(8);
		
		System.out.println(s.get_name()+" are "+s.get_nrOfLegs()+" picioare.Poate zbura?"+
				s.get_canFly()+" .E periculos? "+s.get_isDangerous());
	}
}
