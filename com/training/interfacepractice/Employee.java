package com.training.interfacepractice;

public class Employee implements BonusCalculator{
      String name;
      double salary;
      
      public Employee(String name, double salary)  {
    	  super();
    	  this.name = name;
    	  this.salary = salary;
      }
      
      void getDetails()  {
    	  System.out.println("Name " +name);
    	  System.out.println("Salary " +salary);
      }

	@Override
	public void calculateBonus() {
		// TODO Auto-generated method stub
		System.out.println("Bonus for everyone");
	} 
}
