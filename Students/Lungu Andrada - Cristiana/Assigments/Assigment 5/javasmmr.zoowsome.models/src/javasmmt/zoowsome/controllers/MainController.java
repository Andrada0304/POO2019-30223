package javasmmt.zoowsome.controllers;
import java.math.BigDecimal;

import javasmmmr.zoowsome.services.AnimalFactory;
import javasmmmr.zoowsome.services.Constants;
import javasmmmr.zoowsome.services.Constants.Employees.Caretakers;
import javasmmmr.zoowsome.services.EmployeeAbstractFactory;
import javasmmmr.zoowsome.services.EmployeeFactory;
import javasmmmr.zoowsome.services.SpeciesFactory;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Sarpe;
import javasmmr.zoowsome.models.Shark;
import javasmmr.zoowsome.models.employees.*;
public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory=new AnimalFactory();
		SpeciesFactory speciesFactory1=abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		Animal a1=speciesFactory1.getAnimal(Constants.Animals.Mammals.Dog);
		a1.set_nrOfLegs(4);
		a1.set_name("Caine");
		//System.out.println("We have an animal with "+a1.get_nrOfLegs()+"  legs! ");
		a1.setTakenCareOf(false);
		//System.out.println(a1.maintenanceCost);
		
		AnimalFactory abstractFactory2=new AnimalFactory();
		SpeciesFactory speciesFactory2=abstractFactory2.getSpeciesFactory(Constants.Species.Insect);
		Animal a2=speciesFactory2.getAnimal(Constants.Animals.Insects.Butterfly);
		a2.set_name("Fluture");
		//System.out.println(a2.maintenanceCost);
		a2.setTakenCareOf(false);
		
		AnimalFactory abstractFactory3=new AnimalFactory();
		SpeciesFactory speciesFactory3=abstractFactory3.getSpeciesFactory(Constants.Species.Bird);
		Animal a3=speciesFactory3.getAnimal(Constants.Animals.Birds.Barza);
		 a3.set_nrOfLegs(2);
		 a3.set_name("Barza");
//		System.out.println("Avem o pasare cu "+a3.get_nrOfLegs()+" picioare");
		a3.setTakenCareOf(false);
		 
		AnimalFactory abstractFactory4=new AnimalFactory();
		SpeciesFactory speciesFactory4=abstractFactory4.getSpeciesFactory(Constants.Species.Aquatic);
		Animal a4=speciesFactory4.getAnimal(Constants.Animals.Aquatics.Shark);
		 ((Shark) a4).set_avgSwimDepth(200);
		 a4.set_name("Rechin");
	//	System.out.println("Avem un "+a4.get_name()+",care poate inota pana la adancimea maxima de "+ ((Shark) a4).get_avgSwimDepth() +" m");
		a4.setTakenCareOf(false);
		 
		AnimalFactory abstractFactory5=new AnimalFactory();
		SpeciesFactory speciesFactory5=abstractFactory5.getSpeciesFactory(Constants.Species.Reptile);
		Animal a5=speciesFactory5.getAnimal(Constants.Animals.Reptiles.Sarpe);
		 ((Sarpe) a5).set_laysEggs(true);
		 a5.set_name("Sarpe");
		//System.out.println("Reptila din gradina zoo face oua?"+((Sarpe) a5).get_laysEggs());
		a5.setTakenCareOf(false);
		 
		EmployeeAbstractFactory employeeabstractfactory=new EmployeeAbstractFactory();
		EmployeeFactory employee1=employeeabstractfactory.getEmployeeFactory(Constants.Employee.Caretakers);
		Employee e1=employee1.getEmployee(Constants.Employee.Caretakers);
		
		// EmployeeFactory employeeabstractfactory=new EmployeeFactory();
		 
		 e1.setName("Cristian");
		 e1.setIsDead(false);
		 BigDecimal bg1=new BigDecimal(3200.36);
		 e1.setSalary(bg1);
		 e1.setId();
		//((javasmmr.zoowsome.models.employees.Caretakers) e1).setWorkingHours(10.2);
		 ((Caretaker)e1).setWorkingHours(10.2);
		// System.out.println(e1.getName()+" cu id-ul "+e1.getId()+" castiga "+e1.getSalary()+".Is Dead? "+e1.getIsDead()+ ((javasmmr.zoowsome.models.employees.Caretakers)e1).getWorkingHours());
		 
		Employee e2=employee1.getEmployee(Constants.Employee.Caretakers);
		 e2.setName("Loredana");
		 e2.setIsDead(false);
		 BigDecimal bg2=new BigDecimal(3500.47);
		 e2.setSalary(bg2);
		 e2.setId();
	//	((javasmmr.zoowsome.models.employees.Caretakers) e2).setWorkingHours(12.4);
		((Caretaker)e2).setWorkingHours(12.4);
		 
		 javasmmr.zoowsome.models.employees.Employee e3=employee1.getEmployee(Constants.Employee.Caretakers);
		 e3.setName("Maria");
		 e3.setIsDead(false);
		 BigDecimal bg3=new BigDecimal(3750.43);
		 e3.setSalary(bg3);
		 e3.setId();
		//((javasmmr.zoowsome.models.employees.Caretakers) e3).setWorkingHours(14.9);
			((Caretaker)e3).setWorkingHours(14.9);
			
		 javasmmr.zoowsome.models.employees.Employee e4=employee1.getEmployee(Constants.Employee.Caretakers);
		 e4.setName("Paul");
		 e4.setIsDead(false);
		 BigDecimal bg4=new BigDecimal(3950.37);
		 e4.setSalary(bg4);
		 e4.setId();
		//((javasmmr.zoowsome.models.employees.Caretakers) e4).setWorkingHours(8.0);
		((Caretaker)e4).setWorkingHours(8.0);
		
		Animal[] animalList=new Animal[100];
		animalList[0]=a1;
		animalList[1]=a2;
		animalList[2]=a3;
		animalList[3]=a4;
		animalList[4]=a5;
		
		/*javasmmr.zoowsome.models.employees.Caretakers[] employeeList=new javasmmr.zoowsome.models.employees.Caretakers[100];
		employeeList[0]=((javasmmr.zoowsome.models.employees.Caretakers) e1);
		employeeList[1]=((javasmmr.zoowsome.models.employees.Caretakers) e2);
		employeeList[2]=((javasmmr.zoowsome.models.employees.Caretakers) e3);
		employeeList[3]=((javasmmr.zoowsome.models.employees.Caretakers) e4);
	*/
		Caretaker employeeList[]=new Caretaker[100];
		employeeList[0]=(Caretaker) e1;
		employeeList[1]=(Caretaker) e2;
		employeeList[2]=(Caretaker) e3;
		employeeList[3]=(Caretaker) e4;
	
		
		for(int i=0;i<4;i++) {
			//System.out.println(employeeList[i].getName());
			for(int j=0;j<5;j++)
			{
			//System.out.println(animalList[j].get_name());
				if((employeeList[i].getIsDead()==false) && (animalList[j].getTakenCareOf()==false)) {
					//System.out.println("!");
					//String result=null;
					//result=((javasmmr.zoowsome.models.employees.Caretakers)employeeList[i]).takeCareOf(animalList[j]);
					String result=employeeList[i].takeCareOf(animalList[j]);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						employeeList[i].setIsDead(true);
						System.out.println(employeeList[i].getName()+" was killed "+animalList[j].dangerPerc);
						//i++;
						
					}
					else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
					System.out.println(employeeList[i].getName()+" Nu are timp de "+animalList[j].get_name());
						
					}
					else if(result.equals(Constants.Employees.Caretakers.TCO_SUCCESS)) {
						animalList[j].setTakenCareOf(true);
						System.out.println("De  " +animalList[j].get_name()+" se ocupa "+employeeList[i].getName());
						
						
					}
				}
			}
		}
		
	System.out.println("\n");
	for( int i=0;i<5;i++)
		{
			if(animalList[i].getTakenCareOf()==true)
				System.out.println("De  " +animalList[i].get_name()+" se ocupa un angajat");
			else
				System.out.println("De  " +animalList[i].get_name()+" nu se ocupa nimeni");
				
		}
	
	}
}
