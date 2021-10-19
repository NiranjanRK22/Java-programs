package com.shristi.basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        for (int i=1; i < number; i++)  {
        	if (number % i == 0)  {
        		sum += i;
        	}
        }
        //System.out.println(sum);
        if (number == sum) {
        	System.out.println("Number is a perfect number");
        }
        else  {
        	System.out.println("Number is not a perfect number");
        }
	}

}
