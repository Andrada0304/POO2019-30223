package javasmmr.zoowsome.models;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static  javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;

import javasmmr.zoowsome.models.Aquatic.waterType;

public class Reptile extends Animal {
	

	private boolean laysEggs;
	final double maintenanceCost;
	final double dangerPerc;
	Reptile(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	public boolean get_laysEggs() {
		return this.laysEggs;
	
	}
	
	public void set_laysEggs(boolean laysEggs) {
		this.laysEggs=laysEggs;
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"laysEggs",String.valueOf(this.laysEggs));
		
		
	}

	public void decodeFromXml( Element element) {
		set_laysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs"). item(0).getTextContent( )));
		
		}

}
