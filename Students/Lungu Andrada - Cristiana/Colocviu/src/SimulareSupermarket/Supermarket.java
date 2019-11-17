package SimulareSupermarket;

public class Supermarket {

	public Angajat[] listaAngajati=new Angajat[100];
	public ClientFidel[] listaClienti=new ClientFidel[100];
	public int nrAngajati=0;
	public int nrClienti=0;
	public int produseCl=0;
	public int prodeuseClfid=0;

	public void addAngajati(String numePersoana,int id) {
		Angajat a=new Angajat();
		a.setNumePersoana(numePersoana);
		a.setId(id);
		this.listaAngajati[this.nrAngajati]=a;
		this.nrAngajati++;
	}
	

	public void addClient(String numePersoana,int id) {
		ClientFidel c=new ClientFidel();
		c.setNumePersoana(numePersoana);
		c.setId(id);
		this.listaClienti[this.nrClienti]=c;
		this.nrClienti++;
	}
	
	public void sortareAngajati() {
		for(int i=0;i<nrAngajati-1;i++) {
			for(int j=0;j<nrAngajati;j++)
			{
				if(this.listaAngajati[i].nrClientiServiti>this.listaAngajati[j].nrClientiServiti) {
					{
						Angajat aux=new Angajat();
						aux=this.listaAngajati[i];
						this.listaAngajati[i]=this.listaAngajati[j];
						this.listaAngajati[j]=aux;
					}
				}
			}
		}
	}
	
	public void statistici() {
		int produseCl=0;
		int produseClFid=0;
		for(int i=0;i<this.nrAngajati;i++) {
			for(int j=0;j<this.listaAngajati[i].nrClientiServiti;j++)
			if(this.listaAngajati[i].listaClientiServiti[j].puncteAcumulate()==0) {
				produseCl=produseCl+this.listaAngajati[i].listaClientiServiti[j].nrProduseCumparate;
			}
			else
				produseClFid=produseCl+this.listaAngajati[i].listaClientiServiti[j].nrProduseCumparate;
		}
		System.out.println("Au fost cumparate "+produseCl+"produse de catre clienti obisnuiti");
		System.out.println("Au fost cumparate "+produseClFid+"produse de catre clienti fideli");
	}
	
	public void adaugaProdus(String nume,float pret,int nrExemplare) {
		Produs p=new Produs();
		p.setNumarExemplare(nrExemplare);
		p.setNumeProdus(nume);
		p.setPret(pret);
		Produs.produse[Produs.nrProduse]=p;
		Produs.nrProduse++;
		
	}
	
}
