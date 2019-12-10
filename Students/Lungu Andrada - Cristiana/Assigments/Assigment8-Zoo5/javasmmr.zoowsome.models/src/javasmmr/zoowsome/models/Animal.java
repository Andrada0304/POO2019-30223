package javasmmr.zoowsome.models;

import javasmmr.zoowsome.models.interfaces.XML_Parasable;
import static  javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
public abstract class Animal implements XML_Parasable {

		public int nrOfLegs;
		public String name;
		public String get_avgSwimDepth;
		public final double dangerPerc;
		public final double maintenanceCost;
		boolean takenCareOf;
		
		
		Animal(double maintenanceCost,double dangerPerc){
			this.maintenanceCost = maintenanceCost;
			this.dangerPerc=dangerPerc;
			this.nrOfLegs=0;
			this.name=null;
			//this.maintenanceCost=maintenanceCost;
		}
		
		
		public int get_nrOfLegs() {
			return this.nrOfLegs;
		}
		public String get_name() {
			return this.name;
		}
		
		public void set_nrOfLegs(int nrOfLegs) {
			this.nrOfLegs=nrOfLegs;
		}
		public void set_name(String name) {
			this.name=name;
		}
		
		public boolean kill() {
			double x=Math.ceil(Math.random()*100);
			x=x/100;
			if (this.dangerPerc>x)
				return true;
			else
				return false;
		}
		public void setTakenCareOf(boolean takenCareOf) {
			this.takenCareOf=takenCareOf;
		}
		
		public boolean getTakenCareOf() {
			return this.takenCareOf;
		}
		@Override
		public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
			createNode(eventWriter,"nrOfLegs",String.valueOf(this.nrOfLegs));
			createNode(eventWriter,"name",String.valueOf(this.name));
			createNode(eventWriter,"maintenanceCost",String.valueOf(this.maintenanceCost));
			createNode(eventWriter,"dangerPerc",String.valueOf(this.dangerPerc));
			createNode(eventWriter,"takenCareOf",String.valueOf(this.takenCareOf));
			
			
			
		}
		@Override
		public void decodeFromXml(Element element) {
			set_nrOfLegs (Integer.valueOf(element.getElementsByTagName("nrOfL egs").item(0).getTextContent() ));
			set_name(element.getElementsByTagName("name").item(0).getTextContent()) ;
			//setMaintenanceCost (Double. valueOf(element.getElementsByTagName( "mainte nanceCos t").item(0).getTextContent())) ;
			//setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()) );

			
		}


		
	
	}

