package com.shristi.assignments;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_1=5, number_2=20, number_3=15;
		String result;
		result = (number_1> number_2) && (number_1>number_3) ? "Number 1 is greater" : (number_2>number_3)?"Number 2 is greater":"Number 3 is greater";
		System.out.println(result);

	}

}
