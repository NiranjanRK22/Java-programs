package com.shristi.assignments;
import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter student name: ");
        //String name = sc.next();
        //System.out.println("Enter student id: ");
        //int id = sc.nextInt();
        sc.close();
        int marks[] = new int[3];
		System.out.println("Enter student marks:");
		Student ram = new Student("Ram", 12);
		ram.getDetails();
		ram.getGrades(marks);
      
	}

}
