package AplicatieActivitati;

public class Zi {
	String nume;
	boolean esteLucratoare;
	
	Zi(String nume,boolean esteLucratoare){
		this.nume=nume;
		this.esteLucratoare=esteLucratoare;
	}
	public void setNume(String nume) {
		this.nume=nume;
	}
	
	public void setEsteLucratoare(boolean esteLucratoare) {
		this.esteLucratoare=esteLucratoare;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public boolean getEsteLucratoare() {
		return this.esteLucratoare;
	}
	
}
