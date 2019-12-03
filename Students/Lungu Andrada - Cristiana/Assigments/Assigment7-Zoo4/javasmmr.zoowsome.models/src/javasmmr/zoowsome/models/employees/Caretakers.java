package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmmr.zoowsome.services.Constants;
import javasmmr.zoowsome.models.Animal;

public class Caretakers extends Employee{
	
	double workingHours;
	
	public Caretakers(String nume,BigDecimal salary,boolean isDead){
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
}
