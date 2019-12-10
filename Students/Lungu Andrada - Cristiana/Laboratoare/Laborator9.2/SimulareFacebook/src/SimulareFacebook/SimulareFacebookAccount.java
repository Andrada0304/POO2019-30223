package SimulareFacebook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimulareFacebookAccount {
	//public Collection<FacebookAccount> prieteni;
	
	public static void main(String[] args) {
		FacebookAccount cont1=new FacebookAccount("Popescu Cristina",21,"Bucuresti");
		FacebookAccount cont2=new FacebookAccount("Mihai Radu",28,"Bucuresti");
		FacebookAccount cont3=new FacebookAccount("Ioan Marius",26,"Cluj-Napoca");
		FacebookAccount cont4=new FacebookAccount("Calugar Maria",20,"Cluj-Napoca");
		FacebookAccount cont5=new FacebookAccount("Adam Miruna",23,"Cluj-Napoca");
		FacebookAccount cont6=new FacebookAccount("Andreea Maria",19,"Bucuresti");

		cont1.adaugaPrieten(cont2);
		cont1.adaugaPrieten(cont3);
		
		cont2.adaugaPrieten(cont4);
		cont2.adaugaPrieten(cont5);
		
		cont3.adaugaPrieten(cont4);
		cont3.adaugaPrieten(cont6);
		cont3.adaugaPrieten(cont5);
		
		cont6.adaugaPrieten(cont5);
		
		System.out.println("Prietenii lui "+cont1.getNume()+" sunt: ");
		cont1.afisarePrieten();
		System.out.println("\n");
		
		System.out.println("Prietenii lui "+cont2.getNume()+" sunt: ");
		cont2.afisarePrieten();
		System.out.println("\n");
		
		System.out.println("Prietenii lui "+cont3.getNume()+" sunt: ");
		cont3.afisarePrieten();
		System.out.println("\n");
		
		System.out.println("Prietenii lui "+cont4.getNume()+" sunt: ");
		cont4.afisarePrieten();
		System.out.println("\n");
		
		System.out.println("Prietenii lui "+cont5.getNume()+" sunt: ");
		cont5.afisarePrieten();
		System.out.println("\n");
		
		System.out.println("Prietenii lui "+cont6.getNume()+" sunt: ");
		cont6.afisarePrieten();
		System.out.println("\n");
		
		cont1.stergePrieten(cont2);
		System.out.println("Prietenii lui "+cont1.getNume()+" sunt: ");
		cont1.afisarePrieten();
		System.out.println("\n");
		
		System.out.println("Prietenii lui "+cont2.getNume()+" sunt: ");
		cont2.afisarePrieten();
		System.out.println("\n");
		
		System.out.println("Prietenii lui "+cont3.getNume()+" care locuiesc in Cluj-Napoca sunt: ");
		cont3.gasestePrieten("Cluj-Napoca");
	}
}
