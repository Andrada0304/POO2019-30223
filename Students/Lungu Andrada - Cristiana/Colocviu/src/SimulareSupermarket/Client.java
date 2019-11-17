package SimulareSupermarket;

public class Client extends Persoana{
	Client(){
		super();
	}
	public int nrProduseCumparate;
	Produs[] listaProduse=new Produs[100];
	
	public void adaugaProdus(String numeProdus,float pret) {
		this.listaProduse[this.nrProduseCumparate].numeProdus=numeProdus;
		this.listaProduse[this.nrProduseCumparate].pret=pret;
		this.nrProduseCumparate++;
	}
	
	public int puncteAcumulate() {
		return 0;
	}
}
