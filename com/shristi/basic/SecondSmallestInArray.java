package com.shristi.basic;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestInArray {

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
        Arrays.sort(arr);
        System.out.println("Second smallest number is: " + arr[1]);
        sc.close();
	}

}
