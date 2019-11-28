package javasmmr.zoowsome.models;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static  javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;

import javasmmr.zoowsome.models.Aquatic.waterType;

public class Insect extends Animal{
	private boolean canFly;
	private boolean isDangerous;
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	Insect(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
		
	}
	
	public boolean get_canFly() {
		return this.canFly;
	}
	
	public boolean get_isDangerous() {
		return this.isDangerous;
		
	}
	
	public void set_canFly(boolean canFly) {
		this.canFly=canFly;
	}
	
	public void set_isDangerous(boolean isDangerous){
		this.isDangerous=isDangerous;
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"canFly",String.valueOf(this.canFly));
		createNode(eventWriter,"isDangerous",String.valueOf(this.isDangerous));
		
	}

	@Override
	public void decodeFromXml( Element element) {
		set_canFly(Boolean.valueOf(element.getElementsByTagName("canFly"). item(0).getTextContent( )));
		set_isDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()) );
		}
}
