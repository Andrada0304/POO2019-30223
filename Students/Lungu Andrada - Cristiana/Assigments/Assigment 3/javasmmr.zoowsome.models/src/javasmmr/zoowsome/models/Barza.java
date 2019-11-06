package javasmmr.zoowsome.models;

public class Barza extends Bird {
	private int nrOfLegs;
	private String name;
	private boolean migrates;
	private int avgFlightAttitude;
	
	public Barza(){
		
	}

	public static void main(String[] args) {
		Barza b=new Barza();
		b.set_migrates(true);
		b.set_avgFlightAttitude(3000);
		b.set_name("barza");
		b.set_nrOfLegs(2);
		
		System.out.println(b.get_name()+" are "+b.get_nrOfLegs()+" picioare.Migreaza?"+
				b.get_migrates()+" .Zboara la inaltimea maxima de "+b.get_avgFlightAttitude()+" m");
	}
}
