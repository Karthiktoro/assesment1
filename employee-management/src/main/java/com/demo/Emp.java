package com.demo;

public class Emp {
	
		private int empId;
		private String name;
		private String city;
		private double salary;
		
		//no args constructor
		//constructor using all fields
		//setter and getter for all fields
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int empId, String name , String city , double salary) {
		this.city = city;
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public String getDetails() {
		return empId +" "+name + " "+city + " "+salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
	  return empId +" "+name + " "+city + " "+salary;
	}

}
