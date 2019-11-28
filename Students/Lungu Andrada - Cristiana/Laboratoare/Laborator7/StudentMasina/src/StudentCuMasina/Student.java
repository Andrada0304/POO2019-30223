package StudentCuMasina;

public class Student implements Cloneable {
	String nume;
	String prenume;
	Masina masina;
	
	
	Student(String nume,String prenume,Masina masina){
		this.nume=nume;
		this.prenume=prenume;
		//this.masina.culoare=culoareMasina;
		//this.masina.marca=marcaMasina;
		this.masina=masina;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public String getPrenume() {
		return this.prenume;
		
	}
	
	 
	public Object clone() throws CloneNotSupportedException
	    {
	        Student student = (Student) super.clone();
	 
	        student.masina = (Masina) masina.clone();
	 
	        return student;
	    }
}
