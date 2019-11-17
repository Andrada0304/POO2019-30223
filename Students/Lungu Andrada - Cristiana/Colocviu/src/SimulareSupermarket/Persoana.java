package SimulareSupermarket;

public class Persoana {
	int id;
	String numePersoana;
	
	Persoana(){
		id=0;
		numePersoana=null;
	}
	
	public int getId() {
		return this.id;
	}
	public String getNumePersoana() {
		return this.numePersoana;
	}
	
	public void setNumePersoana(String nume) {
		this.numePersoana=nume;
	}
	
	public void setId(int id) {
		this.id=id;
	}
}
