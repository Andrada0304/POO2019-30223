package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmmr.zoowsome.services.Constants;

public class Sarpe extends Reptile{

	final double maintenanceCost;
	final double dangerPerc;
	public Sarpe(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,
								Constants.Animals.Reptiles.Sarpe);
		
	}
	
	public static void main(String[] args) {
		Sarpe snk=new Sarpe(5.9,0.7);
		snk.set_name("Sarpele");
		snk.set_nrOfLegs(0);
		snk.set_laysEggs(true);
		
		System.out.println(snk.get_name()+" are "+snk.get_nrOfLegs()+" picioare. Face oua? "+snk.get_laysEggs());
	}
}
