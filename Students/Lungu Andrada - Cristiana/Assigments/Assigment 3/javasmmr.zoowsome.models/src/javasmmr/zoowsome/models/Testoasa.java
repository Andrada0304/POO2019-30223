package javasmmr.zoowsome.models;

public class Testoasa extends Reptile{
	public Testoasa(){
		super();
	}
	
	public static void main(String[] args) {
		Testoasa tes=new Testoasa();
		tes.set_name("Testoasa");
		tes.set_nrOfLegs(4);
		tes.set_laysEggs(true);
		
		System.out.println(tes.get_name()+" are "+tes.get_nrOfLegs()+" picioare. Face oua? "+tes.get_laysEggs());
	}
}
