package com.shristi.basic;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++)  {
        	arr[i] = sc.nextInt(); 
        }
        for (int j=0; j < arr.length;j++) {
        	sum+=arr[j];
        }
        System.out.println(sum);
        int average = sum/arr.length;
        System.out.println(average);
	}

}
