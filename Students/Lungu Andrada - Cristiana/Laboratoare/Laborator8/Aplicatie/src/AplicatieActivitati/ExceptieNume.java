package AplicatieActivitati;

public class ExceptieNume extends Exception{
	public ExceptieNume() {
		super("Ziua nu e lucratoare");
	}
	public ExceptieNume(String mesaj) {
		super(mesaj);
	}
}

