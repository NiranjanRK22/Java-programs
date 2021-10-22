package com.shristi.assignments;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee obj = new Employee("Niranjan", "Director");
        
        if (obj.designation == "Manager")  {
        	obj.calcBonus(1000, 2000);
        }
        else if (obj.designation == "Programmer")  {
        	obj.calcBonus(4000);
        }
        else  if (obj.designation == "Director"){
        	obj.calcBonus(1000, 5000, 6000);
        }
        
	}

}
