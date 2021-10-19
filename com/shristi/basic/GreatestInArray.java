package com.shristi.basic;
import java.util.Scanner;

public class GreatestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max_value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements in array:");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		max_value = arr[0];
		for (int i=0; i<n; i++)  {
			if (arr[i] > max_value)  {
			    max_value = arr[i];
			}
		}
        System.out.println("Maximum value: " + max_value);
	}

}
