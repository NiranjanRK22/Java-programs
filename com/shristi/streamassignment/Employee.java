package com.shristi.streamassignment;

public class Employee {
       String name, city;
       int empId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String city, int empId) {
		super();
		this.name = name;
		this.city = city;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", empId=" + empId + "]";
	}
       
}
