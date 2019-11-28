package AplicatieActivitati;


public class MainClass {

	public static void main(String[] args) {
		CalendarLucru c1=new CalendarLucru();
		Zi zi1=new Zi("Marti",false);
		c1.setZi(zi1);
		Lucrator l1=new Lucrator("Marius",c1);
		
		CalendarLucru c2=new CalendarLucru();
		Zi zi2=new Zi("Miercuri",false);
		c2.setZi(zi2);
		Lucrator l2=new Lucrator("Calin",c2);
		
		CalendarLucru c3=new CalendarLucru();
		Zi zi3=new Zi("Joi",false);
		Zi zi4=new Zi("Luni",false);
		c3.setZi(zi3);
		c3.setZi(zi4);
		Lucrator l3=new Lucrator("Cristina",c3);
		
		for (int i=0;i<7;i++) {
			Zi ziLucru1=c1.zile[i];
			
			try {
				l1.lucreaza(ziLucru1);
			} catch (ExceptieNume e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			for (int i=0;i<7;i++) {
				Zi ziLucru2=c2.zile[i];
				try {
				l2.lucreaza(ziLucru2);
			} catch (ExceptieNume e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
				
			for (int i=0;i<7;i++) {
				Zi ziLucru3=c3.zile[i];
				try {
				l3.lucreaza(ziLucru3);
			} catch (ExceptieNume e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
