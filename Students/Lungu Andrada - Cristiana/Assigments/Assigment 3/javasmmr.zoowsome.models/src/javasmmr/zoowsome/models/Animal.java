package javasmmr.zoowsome.models;

public abstract class Animal {

		public int nrOfLegs;
		public String name;
		public String get_avgSwimDepth;
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
		
		Animal(){
			this.nrOfLegs=0;
			this.name=null;
		}
	}

