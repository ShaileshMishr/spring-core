// Create an Employee bean with some attributes and a Manager Bean also
// You need to show the relationship as Employee has a Manager.
// Create appropriate methods that shows employee and it's manager
// and also display salaries of both.

package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empId;
	private String empName;
	private String desigNation;
	private double salary;
	
	@Autowired
	private Manager manager;
	
	
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesigNation() {
		return desigNation;
	}

	public void setDesigNation(String desigNation) {
		this.desigNation = desigNation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String EmpDetails() {
		return empId+":"+empName+":"+desigNation+":"+salary+" , "+" Manager Details :"+manager.getManagerDetail();
	}
	
}
