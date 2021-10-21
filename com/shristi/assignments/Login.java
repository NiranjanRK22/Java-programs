package com.shristi.assignments;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"Rahul", "MSD", "Rohit", "Virat"};
        boolean username_found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username to login:");
        String username = sc.next();
        for (int i=0; i<arr.length;i++) {
        	if (arr[i].equals(username))  {
        		username_found = true;
        	}
        }
        
        if (username_found)  {
        	System.out.println("You are logged in successfully");
        }
        else {
        	System.out.println("Invalid username");
        }
        sc.close();
	}

}
