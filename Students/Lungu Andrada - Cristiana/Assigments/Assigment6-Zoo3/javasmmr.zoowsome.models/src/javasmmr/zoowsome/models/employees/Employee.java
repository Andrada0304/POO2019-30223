package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public  abstract class Employee {
	String name;
	long id;
	BigDecimal salary;
	boolean isDead;
	
	
	Employee(String name,BigDecimal salary,boolean isDead){
		this.name=name;
		this.salary=salary;
		this.isDead=false;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(long id) {
		long id1=0;
		for(int i=0;i<13;i++) {
			int x=(int)Math.ceil(Math.random()*10);
			id1=id1*10+x;
		}
		this.id=id1;
		
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary=salary;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public void setIsDead(boolean isDead) {
		this.isDead=isDead;
	}
	
	public boolean getIsDead() {
		return this.isDead;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter,"name",String.valueOf(this.name));
		createNode(eventWriter,"id",String.valueOf(this.id));
		createNode(eventWriter,"salary",String.valueOf(this.salary));
		createNode(eventWriter,"isDead",String.valueOf(this.isDead));
		
		
	}
	public void decodeFromXml(Element element) {
		setName (String.valueOf(element.getElementsByTagName("name").item(0).getTextContent() ));
		setId (Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent() ));
		//setSalary (BigDecimal.valueOf(element.getElementsByTagName("salary").item(0).getTextContent()));
		setIsDead (Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent() ));
	}
}
