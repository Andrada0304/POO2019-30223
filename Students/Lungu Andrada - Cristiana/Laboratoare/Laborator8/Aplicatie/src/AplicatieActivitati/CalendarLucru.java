package AplicatieActivitati;

public class CalendarLucru {
	
	Zi[] zile=new Zi[7];
	CalendarLucru(){
		zile[0]=new Zi("Luni",true);
		zile[1]=new Zi("Marti",true);
		zile[2]=new Zi("Miercuri",true);
		zile[3]=new Zi("Joi",true);
		zile[4]=new Zi("Vineri",true);
		zile[5]=new Zi("Sambata",false);
		zile[6]=new Zi("Duminica",false);
	}
	
	public void setZi(Zi zi) {
		int i=0;
		while(!zi.getNume().equals(zile[i].getNume())) {
			i++;
		}
		zile[i].setEsteLucratoare(zi.esteLucratoare);
	}
	
	public boolean getZi(Zi zi) {
		int i=0;
		while(!zi.getNume().equals(zile[i].getNume())) {
			i++;
		}
		return zile[i].getEsteLucratoare();
	}

}
