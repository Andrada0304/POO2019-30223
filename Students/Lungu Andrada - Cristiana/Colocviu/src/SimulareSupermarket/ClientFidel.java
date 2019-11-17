package SimulareSupermarket;

public class ClientFidel extends Client{
		ClientFidel(){
			super();
		}
		int nrPuncte=0;
		float discount;
		
		public int puncteAcumulate() {
			float suma=0;
			for(int i=0;i<this.nrProduseCumparate;i++) {
				suma=suma+this.listaProduse[i].pret;
				
			}
			
			this.nrPuncte+=(int) (suma/20);
			return this.nrPuncte;		
			}
		

}
