package javasmmmr.zoowsome.services;


import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Caretakers;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakersFactory extends EmployeeFactory{

	public Employee getEmployee(String type) {
		// TODO Auto-generated method stub
		if(Constants.Employee.Caretakers.equals(type)) {
			return new Caretaker(null,null,false);
				
	}
		return null;

	
}
}
