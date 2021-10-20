package com.shristi.basic;

public class StarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number_of_rows = 5;
        for (int row=1; row<=number_of_rows; row++)  {
        	for (int column=1; column<=row; column++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
