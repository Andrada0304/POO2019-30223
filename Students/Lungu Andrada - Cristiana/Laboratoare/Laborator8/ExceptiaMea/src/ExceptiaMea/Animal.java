package ExceptiaMea;

public class Animal {
	private String name;
	private int age;
	
	public Animal(String name,int age) throws ExceptieNume{
		if(age<0) {
			throw new ExceptieNume("Nu poate avea varsta negativa:"+age);
			
		}
		
		else {
			this.name=name;
			this.age=age;
			System.out.println("Ai creat un animal");
		}
	}
}
