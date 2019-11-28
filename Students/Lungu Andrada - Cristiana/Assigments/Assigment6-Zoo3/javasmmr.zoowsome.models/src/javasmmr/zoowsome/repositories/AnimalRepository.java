package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Butterfly;
import javasmmr.zoowsome.models.interfaces.XML_Parasable;


public class AnimalRepository {
	private static final String XML_FILENAME="Animals.xml";
	public AnimalRepository() {
		
	}
	
	public void save (ArrayList<Animal> animals)throws XMLStreamException, FileNotFoundException { 
		
		XMLOutputFactory outputFactory=XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter=outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory=XMLEventFactory.newInstance();
		XMLEvent end=eventFactory.createDTD("\n");
		
		StartDocument startDocument=eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		
		StartElement configStartElement=eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for(XML_Parasable animal:animals) {
			StartElement sElement=eventFactory.createStartElement("","",Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			
			animal.encodeToXml(eventWriter);
			
			EndElement eElement=( eventFactory.createEndElement("", "",Constants.XML_TAGS.ANIMAL));
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		
		eventWriter.add(eventFactory.createEndElement("", "","content"));
		eventWriter.add( eventFactory.createEndDocument());
		eventWriter.close();
		
		
	}
	public ArrayList<Animal> load() throws SAXException, IOException, ParserConfigurationException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
		Node node = nodeList.item(i);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
		Element element = (Element) node;
		String discriminant =
		element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
		.getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Butterfly:
		Animal butterfly = new Butterfly(2.3, 0.1);
		butterfly.decodeFromXml(element);
		animals.add(butterfly);
		//…
		default:
		break;
		}
		}
		}
		return animals;

	}
		
	public static void createNode(XMLEventWriter eventWriter,String name,String value) throws XMLStreamException{
		XMLEventFactory eventFactory=XMLEventFactory.newInstance();
		XMLEvent end =eventFactory.createDTD("\n");
		XMLEvent tab=eventFactory.createDTD("\t");
		
		StartElement sElement=eventFactory.createStartElement("","",name); 
		eventWriter.add(tab);
		eventWriter.add(sElement);
		Characters characters =eventFactory.createCharacters(value);
		eventWriter.add(characters);
		EndElement eElement=eventFactory.createEndElement("","",name);
		eventWriter.add(eElement);
		eventWriter.add(end);
		
			
	}
	
	
}
