package javasmmr.zoowsome.models;

import javasmmr.zoowsome.models.Aquatic.waterType;
public class Pastrav extends Aquatic{
	private int nrOfLegs;
	private String name;
	private int avgSwimDepth;
	final double maintenanceCost;
	final double dangerPerc;
	enum waterType {
		SALTWATER,
		FRESHWATER;
	}
	private waterType type;
	
	public Pastrav(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	private void set_waterType(waterType type2) {
		this.type= type2;
	}
		// TODO Auto-generated method stub
	public static void main(String[] args) {
		Pastrav pst =new Pastrav(0.1,0.1);
		pst.set_nrOfLegs(0);
		pst.set_name("Pastravul");
		pst.set_avgSwimDepth(300);
		waterType type=waterType.FRESHWATER;
		pst.set_waterType(type);
		

		System.out.println(pst.get_name()+" are "+pst.get_nrOfLegs()+" picioare.Ce tip de apa?"+
				pst.type.toString()+" .Inoata la adancimea maxima de "+pst.get_avgSwimDepth()+" m");
		
	}
	
}
