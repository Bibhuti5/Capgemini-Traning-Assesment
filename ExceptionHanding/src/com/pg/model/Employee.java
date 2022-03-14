package com.pg.model;

public class Employee {
  private String employee_name;
  private double taxAmout,empSal;
  
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public double getTaxAmout() {
		return taxAmout;
	}
	public void setTaxAmout(double taxAmout) {
		this.taxAmout = taxAmout;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	public Employee(double taxAmout, double empSal) {
		super();
		this.taxAmout = taxAmout;
		this.empSal = empSal;
	}
	
	
	
  
	
  
  
  
}
