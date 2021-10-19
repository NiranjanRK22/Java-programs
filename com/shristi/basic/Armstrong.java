package com.shristi.basic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
       String number_string = Integer.toString(number);
       //System.out.println(number_string.length());
       int number_of_digits = number_string.length();
       int given_number = number;
       while (given_number != 0)  {
       	    int remainder = given_number % 10;
       	    sum += Math.pow(remainder, number_of_digits);
       	    given_number /= 10;		
        }
       //System.out.println(sum);
       if (number == sum)  {
    	   System.out.println("Number is a armstrong number");
       }
       else {
    	   System.out.println("Number is not a armstrong number");
       }
	}

}
