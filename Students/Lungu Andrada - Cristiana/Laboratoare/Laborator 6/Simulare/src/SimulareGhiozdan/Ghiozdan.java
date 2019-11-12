package SimulareGhiozdan;
import SimulareGhiozdan.Manual;
public class Ghiozdan {
	Rechizita[] listaRechizite=new Rechizita[10];
	int n=0; 
	Manual m=new Manual();
	Caiet c=new Caiet();
	
	public void addCaiet(Caiet c) {
		listaRechizite[n]=c;
		n++;
	}
	

	public void addManual(Manual m) {
		 listaRechizite[n]= m;
		 n=n+1;
	 }
	
	public void listItems() {
		for(int i=0;i<n;i++)
			System.out.println(listaRechizite[i].getNume()+" ");
	}
	
	public void listManual() {
		for(int i=0;i<n;i++)
			if(listaRechizite[i].getNume().equals("Manual"))
					System.out.println("Manual ");
	}
	
	public void listCaiet() {
		for(int i=0;i<n;i++)
			if(listaRechizite[i].getNume().equals("Caiet"))
				System.out.println("Caiet ");
	}
	
	public void GetNrRechizite() {
		System.out.println("Nr de rechizite="+ n);
	}
	public void GerNrManuale() {
		int manuale=0;
		for(int i=0;i<n;i++)
			if(listaRechizite[i].getNume().equals("Manual"))
				manuale++;
		System.out.println("Sunt "+manuale+" manuale");
	}
	public void GetNrCaiete() {
		int caiete=0;
		for(int i=0;i<n;i++)
			if(listaRechizite[i].getNume().equals("Caiet"))
				caiete++;
		System.out.println("Sunt " + caiete +" caiete");
	}
	
	
	
}
