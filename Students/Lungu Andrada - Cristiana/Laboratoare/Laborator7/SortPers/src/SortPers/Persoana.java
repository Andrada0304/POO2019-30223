package SortPers;

public class Persoana implements Comparable<Persoana>{
	String nume;
	String prenume;
	int varsta;
	Persoana(String nume,String prenume,int varsta){
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
	}
	@Override
	public int compareTo(Persoana p) {
		return this.nume.compareTo(p.nume);
		
	}
	
}
