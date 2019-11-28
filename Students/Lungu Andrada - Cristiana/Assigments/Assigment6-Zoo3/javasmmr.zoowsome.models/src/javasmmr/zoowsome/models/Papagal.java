package javasmmr.zoowsome.models;

public class Papagal extends Bird{
	private int nrOfLegs;
	private String name;
	private boolean migrates;
	final double maintenanceCost;
	private int avgFlightAttitude;
	final double dangerPerc;
	
	public Papagal(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}

	public static void main(String[] args) {
		Papagal p=new Papagal(2.0,0.2);
		p.set_migrates(false);
		p.set_avgFlightAttitude(1000);
		p.set_name("Papagalul");
		p.set_nrOfLegs(2);
		
		System.out.println(p.get_name()+" are "+p.get_nrOfLegs()+" picioare.Migreaza?"+
				p.get_migrates()+" .Zboara la inaltimea maxima de "+p.get_avgFlightAttitude()+" m");
	
	}
}
