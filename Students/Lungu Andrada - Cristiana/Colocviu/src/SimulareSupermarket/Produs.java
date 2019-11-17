package SimulareSupermarket;

public class Produs {
	String numeProdus;
	float pret;
	int numarExemplare;
	
	public static Produs[] produse=new Produs[100];
	public static int nrProduse=0;
	
	public boolean esteInStoc(String numeProdus) {
		if (this.numarExemplare==0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String getNumeProdus() {
		return this.numeProdus;
	}
	
	public void setNumeProdus(String nume) {
		 this.numeProdus=nume;
	}
	public float getPret() {
		return this.pret;
	}
	
	public void setPret(float pret) {
		 this.pret=pret;
	}
	public int getNumarExemplare() {
		return this.numarExemplare;
	}
	
	public void setNumarExemplare(int numarExemplare) {
		 this.numarExemplare=numarExemplare;
	}
}
