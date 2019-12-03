package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.models.Animal;

public class Caretaker extends Employee {

	double workingHours;
	
	public Caretaker(String nume,BigDecimal salary,boolean isDead){
		super(nume,salary,isDead);
		this.workingHours=0.0;
	}


	public void setWorkingHours(double workingHours) {
		this.workingHours=workingHours;
	}
	public double getWorkingHours() {
		return this.workingHours;
	}
	public String takeCareOf(Animal a) {
		if(a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if(this.workingHours<a.maintenanceCost) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
			
		}
		a.setTakenCareOf(true);
		this.workingHours=(this.workingHours-a.maintenanceCost);
		return Constants.Employees.Caretakers.TCO_SUCCESS;
		
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter,"avgFlightAttitude",String.valueOf(this.workingHours));
		
	}
	public void decodeFromXml( Element element) {
		setWorkingHours(Integer.valueOf(element.getElementsByTagName("mworkingHours"). item(0).getTextContent( )));
	
		}

}
