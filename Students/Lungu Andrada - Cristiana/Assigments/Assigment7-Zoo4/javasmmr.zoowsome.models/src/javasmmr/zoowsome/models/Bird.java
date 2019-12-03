package javasmmr.zoowsome.models;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static  javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;

import javasmmr.zoowsome.models.Aquatic.waterType;

public class Bird extends Animal {
	private boolean migrates;
	private int avgFlightAttitude;
	private int nrOfLegs;
	final double maintenanceCost;
	final double dangerPerc;
	private String name;
	
	Bird(double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	public boolean get_migrates() {
		return this.migrates;
	}
	public int get_avgFlightAttitude() {
		return this.avgFlightAttitude;
	}
	
	public void set_migrates(boolean migrates) {
		this.migrates=migrates;
	}
	
	public void set_avgFlightAttitude(int avgFlightAttitude) {
		this.avgFlightAttitude=avgFlightAttitude;
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"avgFlightAttitude",String.valueOf(this.avgFlightAttitude));
		createNode(eventWriter,"migrates",String.valueOf(this.migrates));
		
	}
	public void decodeFromXml( Element element) {
		set_migrates(Boolean.valueOf(element.getElementsByTagName("migrates"). item(0).getTextContent( )));
		set_avgFlightAttitude(Integer.valueOf(element.getElementsByTagName("avgFlightAttitude").item(0).getTextContent()) );
		}

	
}
