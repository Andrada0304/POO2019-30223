package SortPers;

public class Persoana2 implements Comparable<Persoana>{
	String nume;
	String prenume;
	int varsta;
	Persoana2(String nume,String prenume,int varsta){
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
	}
	@Override
	public int compareTo(Persoana p) {
		return this.varsta-p.varsta;
		
	}
}
