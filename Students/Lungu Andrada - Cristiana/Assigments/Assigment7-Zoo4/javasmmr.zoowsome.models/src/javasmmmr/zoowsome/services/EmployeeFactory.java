package javasmmmr.zoowsome.services;

import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.employees.Employee;

public abstract class EmployeeFactory {
	public abstract Employee getEmployee(String type);
	

}
