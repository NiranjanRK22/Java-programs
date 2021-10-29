//project: streams assignment
//author: Niranjan
//v: 1.0

package com.shristi.streamassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class EmpMain {

	public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        
        //adding 5 Employees to list
        empList.add(new Employee("Rahul", "hyderabad", 113));
        empList.add(new Employee("Niranjan", "hyderabad", 114));
        empList.add(new Employee("vijay", "chennai", 115));
        empList.add(new Employee("kiran", "delhi", 116));
        empList.add(new Employee("Aravind", "warangal", 112));
        
        //List<List<Employee>> listOfEmps = Arrays.asList(empList);
        //System.out.println(listOfEmps);
        
        //Printing each Employee list
        for (Employee emp : empList)  {
        	System.out.println(emp);
        }
        
        System.out.println();
        
        //printing employee list based on city
        Stream<Employee> empStream = empList.stream().filter(x  -> x.city.equalsIgnoreCase("hyderabad"));
        Iterator <Employee> emp = empStream.iterator();
        while(emp.hasNext())  {
        	Employee city = emp.next();
        	System.out.println(city);
        }
        
        System.out.println();
        
        //printing all the employees sorted by name
        Stream<Employee> sortedStream = empList.stream().sorted((emp1, emp2)  -> emp1.name.compareTo(emp2.name));
        Iterator <Employee> sortedEmp = sortedStream.iterator();
        while(sortedEmp.hasNext())  {
        	Employee sortedByName = sortedEmp.next();
        	System.out.println(sortedByName);
        } 
        
        System.out.println();
      
        //printing one employee based on given id
        Stream<Employee> filteredStream = empList.stream().filter(x  -> x.empId == 114);
       	Iterator <Employee> FilteredEmp = filteredStream.iterator();
        while(FilteredEmp.hasNext())  {
            Employee filteredById = FilteredEmp.next();
            System.out.println(filteredById);
        }
            
         System.out.println();
         //printing employees whose name starts with k
         try  {
            Employee empId = empList.stream().filter(x  -> x.name.startsWith("k")).findFirst().orElseThrow(()  -> new Exception("Not in first place"));
            System.out.println(empId);
         }
         catch(Exception e)  {
            System.out.println(e);
         }
 
        
	}

}
