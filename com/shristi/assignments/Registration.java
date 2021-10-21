package com.shristi.assignments;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String arr[] = {"Rahul", "MSD", "Rohit", "Virat"};
        boolean username_found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to register:");
        String username = sc.next();
        for (int i=0; i<arr.length;i++) {
        	if (arr[i].equals(username))  {
        		//System.out.println("Name is not unique");
        		username_found = true;
        	}
        }
        
        if (username_found)  {
        	System.out.println("Name is not unique");
        }
        else {
        	System.out.println("Your name is registered");
        }
        sc.close();
	}

}
