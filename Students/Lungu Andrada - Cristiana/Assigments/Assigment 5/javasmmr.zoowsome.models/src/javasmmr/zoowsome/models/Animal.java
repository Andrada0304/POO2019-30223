package javasmmr.zoowsome.models;

public abstract class Animal {

		public int nrOfLegs;
		public String name;
		public String get_avgSwimDepth;
		public final double dangerPerc;
		public final double maintenanceCost;
		boolean takenCareOf;
		
		
		Animal(double maintenanceCost,double dangerPerc){
			this.maintenanceCost = maintenanceCost;
			this.dangerPerc=dangerPerc;
			this.nrOfLegs=0;
			this.name=null;
			//this.maintenanceCost=maintenanceCost;
		}
		
		
		public int get_nrOfLegs() {
			return this.nrOfLegs;
		}
		public String get_name() {
			return this.name;
		}
		
		public void set_nrOfLegs(int nrOfLegs) {
			this.nrOfLegs=nrOfLegs;
		}
		public void set_name(String name) {
			this.name=name;
		}
		
		public boolean kill() {
			double x=Math.ceil(Math.random()*100);
			x=x/100;
			if (this.dangerPerc>x)
				return true;
			else
				return false;
		}
		public void setTakenCareOf(boolean takenCareOf) {
			this.takenCareOf=takenCareOf;
		}
		
		public boolean getTakenCareOf() {
			return this.takenCareOf;
		}
		
	
	}

