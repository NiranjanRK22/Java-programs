package com.shristi.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in an array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements in array:");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
        System.out.println("Minimum value: " + arr[0]);

	}

}
