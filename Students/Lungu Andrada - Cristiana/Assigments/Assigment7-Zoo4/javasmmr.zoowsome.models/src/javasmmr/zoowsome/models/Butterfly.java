package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmmr.zoowsome.services.Constants;

public class Butterfly extends Insect{
	private boolean canFly;
	private boolean isDangerous;
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	public Butterfly(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,
								Constants.Animals.Insects.Butterfly);
		
	}
	
	public static void main(String[] args) {
	
		
		Butterfly b=new Butterfly(2.3,0.1);
		b.set_canFly(true);
		b.set_isDangerous(false);
		b.set_name("Fluturele");
		b.set_nrOfLegs(6);
		
		System.out.println(b.get_name()+" are "+b.get_nrOfLegs()+" picioare.Poate zbura?"+
				b.get_canFly()+" .E periculos? "+b.get_isDangerous());
	}
}
