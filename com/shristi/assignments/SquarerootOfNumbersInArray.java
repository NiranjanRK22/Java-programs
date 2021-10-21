package com.shristi.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class SquarerootOfNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++)  {
        	arr[i] = sc.nextInt(); 
        }
        double newArray[] = new double[n];
        for (int i=0; i<arr.length;i++) {
        	newArray[i] = Math.sqrt(arr[i]);
        }
        
        System.out.println(Arrays.toString(newArray));
        sc.close();
	}

}
