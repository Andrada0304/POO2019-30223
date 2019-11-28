package javasmmmr.zoowsome.services;

import javasmmr.zoowsome.models.employees.Employee;

public class EmployeeAbstractFactory extends EmployeeFactory{

	
	public EmployeeFactory getEmployeeFactory(String type) throws Exception {
		if(Constants.Employee.Caretakers.equals(type)) {
			return new CaretakersFactory();
	}
		else
			throw new Exception("Invalid species exceptions");
}

	@Override
	public Employee getEmployee(String type) {
		// TODO Auto-generated method stub
		return null;
	}	




	
}
