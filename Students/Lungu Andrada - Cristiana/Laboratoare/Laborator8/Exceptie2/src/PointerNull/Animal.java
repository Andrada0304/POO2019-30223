package PointerNull;

public class Animal {
     private String nume=null;
	private String sunet=null;
	//Animal(){
		//nume=null;
		//sunet=null;
	//}
	public void setNume(String nume) {
		this.nume=nume;
	}
	
	public void setSunet(String sunet) {
		this.sunet=sunet;
	}
	public static Animal doSomething() {
		return null;
	}
	//public static String getNume() {
		//try {
		//return nume;
		//} catch(Exception e) {
		  //throw new NullPointerException("o is null");
	//}
	
	public static void main(String[] args) {
		try {
			
			Animal a=new Animal();
			a.setNume("caine");
			a=doSomething();
		
			//Animal a1=new Animal();
			a.setSunet("Ham");
		}
			catch(Throwable any) {
			System.out.println("error"+any);
			any.printStackTrace();
		}

}
}
