package com.shristi.basic;

import java.util.Scanner;

public class ReverseElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_of_elements;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array: ");
		number_of_elements = sc.nextInt();
		int array[] = new int[number_of_elements];
		int reverse [] = new int[number_of_elements];
		for (int i=0; i<number_of_elements;i++) {
			array[i] = sc.nextInt();
		}
		for (int i=0; i<number_of_elements; i++) {
			reverse[i] = array[number_of_elements-i-1];
			System.out.print(reverse[i] + " ");
		}
		sc.close();
	}

}
