package com.shristi.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number, factorial_of_number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        while (number > 0)  {
        	factorial_of_number *= number;
        	number--;
        }
        System.out.println(factorial_of_number);
	}

}
