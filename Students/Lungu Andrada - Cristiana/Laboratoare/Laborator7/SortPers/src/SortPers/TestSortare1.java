package SortPers;

import java.util.Arrays;


public class TestSortare1 {
	public static void main(String[] args) {
		Persoana[] persoane=new Persoana[6];
		Persoana2[] persoane2=new Persoana2[6];
		try {
			persoane[0]=new Persoana("Moldovan","Cristina",20);
			persoane[1]=new Persoana("Muntean","Maria",21);
			persoane[2]=new Persoana("Popescu","Andrei",27);
			persoane[4]=new Persoana("Radu","Mihai",17);
			persoane[5]=new Persoana("Adam","Ioana",14);
			
			persoane2[0]=new Persoana2("Moldovan","Cristina",20);
			persoane2[1]=new Persoana2("Muntean","Maria",21);
			persoane2[2]=new Persoana2("Popescu","Andrei",27);
			persoane2[4]=new Persoana2("Radu","Mihai",17);
			persoane2[5]=new Persoana2("Adam","Ioana",14);
			
		} catch( Exception e ) {
			e.printStackTrace();
		}
		Arrays.sort(persoane);
		Arrays.sort(persoane2);
		for(Persoana pers:persoane) {
			System.out.println(pers);
		}
		
		for(Persoana2 pers:persoane2) {
			System.out.println(pers);
		}
	}
}
