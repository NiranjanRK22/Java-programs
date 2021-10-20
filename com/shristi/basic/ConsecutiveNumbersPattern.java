package com.shristi.basic;

public class ConsecutiveNumbersPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_of_rows = 4;
		int number = 1;
		for (int row=1; row<=number_of_rows; row++)  {
			
			for (int column=1; column<=row; column++) {
				System.out.print(number++);
			}
			System.out.println();
		}
}
}