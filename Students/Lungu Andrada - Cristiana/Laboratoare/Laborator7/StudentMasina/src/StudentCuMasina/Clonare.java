package StudentCuMasina;

public class Clonare{
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Masina masina=new Masina("audi","rosie");
		Student student=new Student("Moldovan","Cristian",masina);
		
		Student s2=(Student)student.clone();
		s2.masina.setCuloare("neagra");
		
		System.out.println("Inainte de vopsire,masina "+student.masina.getMarca()+ " a studentului  "+ student.getNume()+" " +student.getPrenume()+" este  "+student.masina.getCuloare());
		System.out.println("Dupa vopsire,masina "+s2.masina.getMarca()+ " a studentului  "+ s2.getNume()+" " +s2.getPrenume()+" este  "+s2.masina.getCuloare());
	}
}
