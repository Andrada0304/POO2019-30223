package SimulareGhiozdan;

public class TestGhiozdan {
	 public static void main(String[] args) {
	Ghiozdan gh=new Ghiozdan();
	Manual m1=new Manual();
	Manual m2=new Manual();
	Manual m3=new Manual();
	Manual m4=new Manual();
	Manual m5=new Manual();
	Caiet c1=new Caiet();
	Caiet c2=new Caiet();
	Caiet c3=new Caiet();
	Caiet c4=new Caiet();
	gh.addCaiet(c1);
	gh.addManual(m1);
	gh.addManual(m2);
	gh.addCaiet(c2);
	gh.addManual(m3);
	gh.addManual(m4);
	gh.addCaiet(c3);
	gh.addCaiet(c4);
	gh.addManual(m5);
	
	gh.GetNrRechizite();
	gh.GerNrManuale();
	gh.GetNrCaiete();
	
	gh.listItems();
	System.out.println("\n");
	gh.listCaiet();
	System.out.println("\n");
	gh.listManual();
}
}