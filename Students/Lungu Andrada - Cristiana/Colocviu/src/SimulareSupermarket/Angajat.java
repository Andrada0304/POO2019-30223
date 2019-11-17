package SimulareSupermarket;

import java.util.Date;

public class Angajat extends Persoana {
	Angajat(){
		super();
	}
	 Date date;
	 
	int nrClientiServiti;
	Client[] listaClientiServiti=new Client[100];
	
	public float scaneaza(int id) {
		float suma=0;
		for(int i=0;i<this.listaClientiServiti[id].nrProduseCumparate;i++) {
			suma= (suma+this.listaClientiServiti[id].listaProduse[i].pret);
		}
		return suma;
	}
	public void servesteClient(String nume,int id) {
		Client c=new Client();
		c.setNumePersoana(nume);
		c.setId(id);
		this.listaClientiServiti[this.nrClientiServiti]=c;
		this.nrClientiServiti++;
	}

}
