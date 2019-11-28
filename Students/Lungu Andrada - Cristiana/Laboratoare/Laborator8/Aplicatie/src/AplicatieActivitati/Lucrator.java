package AplicatieActivitati;

public class Lucrator {
	String nume;
	CalendarLucru calendar;
	

	Lucrator(String nume,CalendarLucru calendar){
		this.nume=nume;
		this.calendar=calendar;
	}
	public void lucreaza(Zi zi) throws ExceptieNume {
		if(calendar.getZi(zi)==false) throw new ExceptieNume("Nu lucreaza in ziua respectiva");
			
		else
			System.out.println(this.nume+" lucreaza "+zi.getNume());
	}
}
