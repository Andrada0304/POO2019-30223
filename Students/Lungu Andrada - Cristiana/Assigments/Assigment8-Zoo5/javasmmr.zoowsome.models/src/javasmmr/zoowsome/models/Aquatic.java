package javasmmr.zoowsome.models;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static  javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import org.w3c.dom.Element;

//import javasmmr.zoowsome.models.Shark.waterType;

public class Aquatic extends Animal{
	
	private int avgSwimDepth;
	//private waterType type;
	//private Object waterType;
	final double maintenanceCost;
	final double dangerPerc;
	enum waterType {
		SALTWATER,
		FRESHWATER;
		//public static waterType type;
	}
	private waterType type;
	
	Aquatic(double maintenanceCost,double dangerPerc){
	
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	public int get_avgSwimDepth() {
		return this.avgSwimDepth;
	}
	//waterType type=waterType.SALTWATER;
	
	public waterType get_waterType() {
		return this.type;
	}
	
	public void set_avgSwimDepth(int avgSwimDepth) {
		this.avgSwimDepth=avgSwimDepth;
	}
	public void set_waterType(waterType type) {
		
		this.type= type;
		
	}
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"avgSwimDepth",String.valueOf(this.avgSwimDepth));
		createNode(eventWriter,"waterType",String.valueOf(this.type));
	}
	public void decodeFromXml( Element element) {
		set_avgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth"). item(0).getTextContent( )));
		set_waterType(waterType.valueOf(element.getElementsByTagName("type").item(0).getTextContent()) );
		}


	
	
}

