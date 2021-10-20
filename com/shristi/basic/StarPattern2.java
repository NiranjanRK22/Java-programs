package com.shristi.basic;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_of_rows = 5;
        for (int row=number_of_rows; row>=1; row--)  {
        	for (int column=row; column>=1; column--) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
