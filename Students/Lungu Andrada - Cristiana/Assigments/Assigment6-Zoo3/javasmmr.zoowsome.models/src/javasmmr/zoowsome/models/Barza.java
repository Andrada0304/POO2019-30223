package javasmmr.zoowsome.models;

public class Barza extends Bird {
	private int nrOfLegs;
	private String name;
	private boolean migrates;
	final double maintenanceCost;
	final double dangerPerc;
	private int avgFlightAttitude;
	
	public Barza(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
		
	}

	public static void main(String[] args) {
		Barza b=new Barza(7.6,0.1);
		b.set_migrates(true);
		b.set_avgFlightAttitude(3000);
		b.set_name("barza");
		b.set_nrOfLegs(2);
		
		System.out.println(b.get_name()+" are "+b.get_nrOfLegs()+" picioare.Migreaza?"+
				b.get_migrates()+" .Zboara la inaltimea maxima de "+b.get_avgFlightAttitude()+" m "+b.maintenanceCost);
	}
}
