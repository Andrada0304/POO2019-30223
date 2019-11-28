package StudentCuMasina;

public class Masina implements Cloneable{
	String marca;
	String culoare;
	
	Masina(String marca,String culoare){
		this.marca=marca;
		this.culoare=culoare;
	}
	
	public void setCuloare(String culoare) {
		this.culoare=culoare;
	}
	
	public String getCuloare() {
		return this.culoare;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}
   
}
