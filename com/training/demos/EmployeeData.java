package com.training.demos;

import java.time.LocalDate;

public class EmployeeData {
	String name;
	String dob;
	
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
		//LocalDate dob = LocalDate.parse(date);
		//System.out.println(dob);
		
	}
	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", dob=" + dob + "]";
	}
    
    
}
