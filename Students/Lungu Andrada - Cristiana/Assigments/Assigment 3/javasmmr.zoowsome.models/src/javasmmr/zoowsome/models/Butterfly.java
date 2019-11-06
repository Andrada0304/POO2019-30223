package javasmmr.zoowsome.models;

public class Butterfly extends Insect{
	private boolean canFly;
	private boolean isDangerous;
	private int nrOfLegs;
	private String name;
	
	public Butterfly(){
		super();
	}
	
	public static void main(String[] args) {
	
		Insect i=new Insect();
		Butterfly b=new Butterfly();
		b.set_canFly(true);
		b.set_isDangerous(false);
		b.set_name("Fluturele");
		b.set_nrOfLegs(6);
		
		System.out.println(b.get_name()+" are "+b.get_nrOfLegs()+" picioare.Poate zbura?"+
				b.get_canFly()+" .E periculos? "+b.get_isDangerous());
	}
}
