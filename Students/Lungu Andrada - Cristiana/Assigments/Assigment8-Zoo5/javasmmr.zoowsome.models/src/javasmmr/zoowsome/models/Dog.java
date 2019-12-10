package javasmmr.zoowsome.models;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmmr.zoowsome.services.Constants;

public class Dog extends Mammal {
	
	private double normalBodyTemp;
	private double percBodyHair;
	private int nrOfLegs;
	private String name;
	final double maintenanceCost;
	final double dangerPerc;
	public Dog (double maintenanceCost,double dangerPerc){
		super(maintenanceCost,dangerPerc);
		this.maintenanceCost=maintenanceCost;
		this.dangerPerc=dangerPerc;
	}
	
	/*Dog(int nrOfLegs,String name,float normalBodyTemp,float percBodyHair){
		this.nrOfLegs=nrOfLegs;
		this.name=name;
		this.normalBodyTemp=normalBodyTemp;
		this.percBodyHair=percBodyHair;
	}*/
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,
								Constants.Animals.Mammals.Dog);
		
	}
	public static void main(String[] args) {

	Dog d=new Dog(6.4,0.4);
	d.set_name("Cainele");
	d.set_nrOfLegs(4);
	d.set_percBodyHair(85.0);
	d.set_normalBodyTemp(38.2);
	
	//System.out.println(d.get_name()+" are "+d.get_nrOfLegs()+" picioare,un procent de "+
	//d.get_percBodyHair()+" % de par si temperatura corpului de "+d.get_normalBodyTemp()+
	//" grade ");
	}
}

