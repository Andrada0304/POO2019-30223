package javasmmr.zoowsome.models;

public class Vultur extends Bird{
	private int nrOfLegs;
	private String name;
	private boolean migrates;
	private int avgFlightAttitude;
	
	public Vultur(){
		
	}

	public static void main(String[] args) {
		Vultur v=new Vultur();
		v.set_migrates(false);
		v.set_avgFlightAttitude(7000);
		v.set_name("Vulturul");
		v.set_nrOfLegs(2);
		
		System.out.println(v.get_name()+" are "+v.get_nrOfLegs()+" picioare.Migreaza?"+
				v.get_migrates()+" .Zboara la inaltimea maxima de "+v.get_avgFlightAttitude()+" m");
	}
	
}
