package com.voterapp.main;
import java.util.Scanner;

import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBooth;
import com.voterapp.exception.LocalityNotFoundException;

public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectionBooth booth  = new ElectionBooth();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		try {
			booth.checkAge(age);
		}
		catch(UnderAgeException e)  {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("Enter your locality: ");
		String locality = sc.next();
		
		try  {
			booth.checkLocality(locality);
		}
		catch(LocalityNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("Enter your voter ID: ");
		int voterId = sc.nextInt();
		
		try  {
			booth.checkVoterId(voterId);
		}
		catch(NoVoterIdException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		sc.close();
	}

}
