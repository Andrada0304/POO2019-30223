package javasmmr.zoowsome.models;

import javasmmr.zoowsome.models.Aquatic.waterType;
public class Balena extends Aquatic{
		private int nrOfLegs;
		private String name;
		private int avgSwimDepth;
		enum waterType {
			SALTWATER,
			FRESHWATER;
		}
		private waterType type;
		
		public Balena(){
			super();
		}
		
		private void set_waterType(waterType type2) {
			this.type= type2;
		}
			// TODO Auto-generated method stub
		public static void main(String[] args) {
			Balena wh =new Balena();
			wh.set_nrOfLegs(0);
			wh.set_name("Balena");
			wh.set_avgSwimDepth(50);
			waterType type=waterType.SALTWATER;
			wh.set_waterType(type);
			

			System.out.println(wh.get_name()+" are "+wh.get_nrOfLegs()+" picioare.Ce tip de apa?"+
					wh.type.toString()+" .Inoata la adancimea maxima de "+wh.get_avgSwimDepth()+" m");
			
		}
		
	
}
