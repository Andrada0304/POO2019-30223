package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

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
	
	public void setId() {
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
}
