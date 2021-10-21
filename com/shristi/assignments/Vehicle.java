package com.shristi.assignments;

public class Vehicle {
      String name;
      String model;
      int price;
      
      Vehicle(String n, String m, int p)  {
    	  name = n;
    	  model = m;
    	  price = p;
      }
      
      void getDetails()  {
    	  System.out.println("Name " +name);
    	  System.out.println("Model " +model);
    	  System.out.println("Price " +price);
      }
}
