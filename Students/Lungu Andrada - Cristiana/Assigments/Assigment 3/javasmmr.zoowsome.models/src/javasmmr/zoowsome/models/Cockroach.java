package javasmmr.zoowsome.models;

public class Cockroach extends Insect{
	private boolean canFly;
	private boolean isDangerous;
	private int nrOfLegs;
	private String name;
	
	public Cockroach(){
		super();
	}
	
	public static void main(String[] args) {
	
		Insect i=new Insect();
		Cockroach c=new Cockroach();
		c.set_canFly(false);
		c.set_isDangerous(false);
		c.set_name("Gandacul de bucatarie");
		c.set_nrOfLegs(8);
		
		System.out.println(c.get_name()+" are "+c.get_nrOfLegs()+" picioare.Poate zbura?"+
				c.get_canFly()+" .E periculos? "+c.get_isDangerous());
	}
}
