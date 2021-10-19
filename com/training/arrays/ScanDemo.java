package com.training.arrays;
import java.util.Scanner;
public class ScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter AGE");
        int age = sc.nextInt();
        System.out.println(age);
        sc.close();
	}

}
