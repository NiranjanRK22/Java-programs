package com.shristi.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        boolean is_prime = true;
        for (int i=2; i<= number/2;i++)  {
        	if (number%i==0)  {
        		is_prime = false;
        		break;
        	}
        }
        if (number<2 || !is_prime)  {
        	System.out.println(number + " is not a Prime number");
        }
        else  {
        	System.out.println(number + " is a Prime number");
        }
	}

}
