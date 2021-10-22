package com.shristi.assignments;

public class Employee {
      String name;
      String designation;
      
      Employee(String n, String d) {
    	  name = n;
    	  designation = d;
      }
      
      void calcBonus(double basicAllowance)  {
    	  System.out.println(basicAllowance);
      }
      void calcBonus(double basicAllowance, double carAllowance)  {
    	  System.out.println(basicAllowance + carAllowance);
      }
      void calcBonus(double basicAllowance, double carAllowance, double houseAllowance)  {
    	  System.out.println(basicAllowance + carAllowance + houseAllowance);;
      }
}
