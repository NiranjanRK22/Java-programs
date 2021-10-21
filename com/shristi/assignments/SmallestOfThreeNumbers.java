package com.shristi.assignments;
import java.util.Scanner;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number_1, number_2, number_3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        number_1 = sc.nextInt();
        number_2 = sc.nextInt();
        number_3 = sc.nextInt();
        sc.close();
        
        if (number_1<number_2 && number_1<number_3)  {
        	System.out.println("Number 1 is smaller");
        }
        else if (number_2<number_3){
            System.out.println("Number 2 is smaller");
        }
        else  {
        	System.out.println("Number 3 is smaller");
        }
	}

}
