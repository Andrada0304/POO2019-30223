package javasmmr.zoowsome.models;

public class Dog extends Mammal {
	
	private double normalBodyTemp;
	private double percBodyHair;
	private int nrOfLegs;
	private String name;
	public Dog (){
		super();
	}
	
	/*Dog(int nrOfLegs,String name,float normalBodyTemp,float percBodyHair){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}*/
	public static void main(String[] args) {
	Mammal m=new Mammal();
	Dog d=new Dog();
	d.set_name("Cainele");
	d.set_nrOfLegs(4);
	d.set_percBodyHair(85.0);
	d.set_normalBodyTemp(38.2);
	
	//System.out.println(d.get_name()+" are "+d.get_nrOfLegs()+" picioare,un procent de "+
	//d.get_percBodyHair()+" % de par si temperatura corpului de "+d.get_normalBodyTemp()+
	//" grade ");
	}
}

