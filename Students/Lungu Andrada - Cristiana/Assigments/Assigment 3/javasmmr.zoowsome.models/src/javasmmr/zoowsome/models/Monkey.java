package javasmmr.zoowsome.models;

public class Monkey extends Mammal{

	private double normalBodyTemp;
	private double percBodyHair;
	private int nrOfLegs;
	private String name;
	public Monkey (){
		super();
	}
	
	public static void main(String[] args) {
	Mammal m=new Mammal();
	Monkey mky=new Monkey();
	mky.set_name("Maimuta");
	mky.set_nrOfLegs(2);
	mky.set_percBodyHair(75.0);
	mky.set_normalBodyTemp(37.0);
	
	System.out.println(mky.get_name()+" are "+mky.get_nrOfLegs()+" picioare,un procent de "+
	mky.get_percBodyHair()+" % de par si temperatura corpului de "+mky.get_normalBodyTemp()+
	" grade ");
	}
}
