package javasmmr.zoowsome.models;

public class Vultur extends Bird{
	private int nrOfLegs;
	private String name;
	private boolean migrates;
	private int avgFlightAttitude;
	final double maintenanceCost;
	final double dangerPerc;
	
	public Vultur(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
		
	}

	public static void main(String[] args) {
		Vultur v=new Vultur(2.5,0.5);
		v.set_migrates(false);
		v.set_avgFlightAttitude(7000);
		v.set_name("Vulturul");
		v.set_nrOfLegs(2);
		
		System.out.println(v.get_name()+" are "+v.get_nrOfLegs()+" picioare.Migreaza?"+
				v.get_migrates()+" .Zboara la inaltimea maxima de "+v.get_avgFlightAttitude()+" m");
	}
	
}
