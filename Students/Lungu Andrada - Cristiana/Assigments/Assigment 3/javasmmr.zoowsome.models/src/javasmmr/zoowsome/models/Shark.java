package javasmmr.zoowsome.models;

import javasmmr.zoowsome.models.Aquatic.waterType;

public class Shark extends Aquatic{
	
	private int nrOfLegs;
	private String name;
	private int avgSwimDepth;
	enum waterType {
		SALTWATER,
		FRESHWATER;
	}
	private waterType type;
	
	public Shark(){
		super();
	}
	
	private void set_waterType(waterType type2) {
		this.type= type2;
	}
		// TODO Auto-generated method stub
	public static void main(String[] args) {
		Shark sh =new Shark();
		sh.set_nrOfLegs(0);
		sh.set_name("Rechinul");
		sh.set_avgSwimDepth(200);
		waterType type=waterType.SALTWATER;
		sh.set_waterType(type);
		

		System.out.println(sh.get_name()+" are "+sh.get_nrOfLegs()+" picioare.Ce tip de apa?"+
				sh.type.toString()+" .Inoata la adancimea maxima de "+sh.get_avgSwimDepth()+" m");
		
	}
	
}

