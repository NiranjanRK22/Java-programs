package com.shristi.basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, reverse_number=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        while (number != 0) {
        	int remainder = number % 10;
        	reverse_number = reverse_number * 10 + remainder;
        	number = number / 10;
        }
        System.out.println(reverse_number);
        sc.close();
	}

}
