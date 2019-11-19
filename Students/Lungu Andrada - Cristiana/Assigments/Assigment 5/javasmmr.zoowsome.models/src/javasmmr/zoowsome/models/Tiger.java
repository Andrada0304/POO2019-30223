package javasmmr.zoowsome.models;

public class Tiger extends Mammal {

	private double normalBodyTemp;
	private double percBodyHair;
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	public Tiger (double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public static void main(String[] args) {
	
	Tiger t=new Tiger(6.8,0.9);
	t.set_name("Tigrul");
	t.set_nrOfLegs(4);
	t.set_percBodyHair(70.0);
	t.set_normalBodyTemp(37.5);
	
	System.out.println(t.get_name()+" are "+t.get_nrOfLegs()+" picioare,un procent de "+
	t.get_percBodyHair()+" % de par si temperatura corpului de "+t.get_normalBodyTemp()+
	" grade ");
	}
}
