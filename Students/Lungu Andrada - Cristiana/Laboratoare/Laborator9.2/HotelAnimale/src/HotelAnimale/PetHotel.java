package HotelAnimale;

import java.util.ArrayList;

public class PetHotel {
	public static void main(String[] args) {
		Caine c1=new Caine("Happy","Bichon",1);
		Caine c2=new Caine("Maya","Pomeranian",2);
		Caine c3=new Caine("Kira","Amfstaff",4);
		Caine c4=new Caine("Max","Pug",3);
		
		ArrayList<Caine> listaCaini=new ArrayList<Caine>();
		listaCaini.add(c1);
		listaCaini.add(c2);
		listaCaini.add(c3);
		listaCaini.add(c4);
		
		for(Caine c:listaCaini) {
			System.out.println(c.toString());
		}
		
	}
}
