package javasmmr.zoowsome.models;

public class Tiger extends Mammal {

	private double normalBodyTemp;
	private double percBodyHair;
	private int nrOfLegs;
	private String name;
	public Tiger (){
		super();
	}
	
	public static void main(String[] args) {
	Mammal m=new Mammal();
	Tiger t=new Tiger();
	t.set_name("Tigrul");
	t.set_nrOfLegs(4);
	t.set_percBodyHair(70.0);
	t.set_normalBodyTemp(37.5);
	
	System.out.println(t.get_name()+" are "+t.get_nrOfLegs()+" picioare,un procent de "+
	t.get_percBodyHair()+" % de par si temperatura corpului de "+t.get_normalBodyTemp()+
	" grade ");
	}
}
