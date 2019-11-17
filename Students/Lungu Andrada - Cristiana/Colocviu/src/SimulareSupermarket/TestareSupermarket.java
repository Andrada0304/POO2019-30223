package SimulareSupermarket;

public class TestareSupermarket {

	

	public static void main(String[] args) {
		Supermarket s=new Supermarket();
	
		s.addAngajati("Cristina",0);
		s.addAngajati("Mihai", 1);
		s.addAngajati("Camelia", 2);
		s.addAngajati("Cristian", 3);
		
		
		s.addClient("Lorena", 0);
		s.addClient("Mihaela",1);
		s.addClient("Calin",2);
		s.addClient("Maria", 3);
		s.addClient("Catalin", 4);
		
		for(int i=0;i<s.nrAngajati;i++) {
			System.out.println(s.listaAngajati[i].getNumePersoana());
		}
		
		for(int i=0;i<s.nrClienti;i++) {
			System.out.println(s.listaClienti[i].getNumePersoana());
		}
		
		s.adaugaProdus("paine", (float) 3.45, 50);
		s.adaugaProdus("suc", (float) 6.50, 20);
		s.adaugaProdus("pepene", (float) 3.00, 25);
		s.adaugaProdus("clementine", (float) 4.25, 40);
		
		for(int i=0;i<Produs.nrProduse;i++) {
			System.out.println(Produs.produse[i].getNumeProdus());
		}
		
	
		s.listaAngajati[0].servesteClient("Lorena", 1);
		
	}
}
