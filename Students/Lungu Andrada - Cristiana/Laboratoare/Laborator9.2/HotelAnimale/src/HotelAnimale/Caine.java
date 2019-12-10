package HotelAnimale;

public class Caine {
	public String nume;
	public String rasa;
	public int varsta;
	
	Caine(String nume,String rasa,int varsta){
		this.nume=nume;
		this.varsta=varsta;
		this.rasa=rasa;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public String getRasa() {
		return this.rasa;
	}
	
	public int getVarsta() {
		return this.varsta;
	}
	
	public String toString(){
		return this.getNume()+" "+this.getRasa()+" "+this.getVarsta();
	}
}
