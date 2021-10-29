package com.training.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <EmployeeData> empList = new ArrayList<>();
        EmployeeData employeeData = new EmployeeData();
        for (int i=0; i<2; i++)   {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter name: ");
        	String name = sc.next();
        	employeeData.setName(name);
        	System.out.println("Enter dob: ");
        	String dob = sc.next();
            employeeData.setDob(dob);
            empList.add(employeeData);
            
        }
        
        System.out.println(empList);
	}

}
