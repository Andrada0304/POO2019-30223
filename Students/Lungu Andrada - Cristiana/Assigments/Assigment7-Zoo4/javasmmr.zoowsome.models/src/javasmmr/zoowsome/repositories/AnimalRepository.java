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


public class AnimalRepository  extends EntityRepository<Animal> {
	private static final String XML_FILENAME="Animals.xml";
	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}
	@Override
	protected Animal getEntityFromXmlElement(Element element) {
	String discriminant =element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
	.getTextContent();
	switch (discriminant) {
	case Constants.Animals.Insects.Butterfly:
	Animal butterfly = new Butterfly(2.3, 0.1);
	butterfly.decodeFromXml(element);
	return butterfly;
	default:
	break;
	}
	return null;
	}

	
	
}
