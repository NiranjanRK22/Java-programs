package com.shristi.basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number1 = 0, number2 = 1, number3, count = 20;
        System.out.print(number1 + " " + number2);
        
        for (int i=2; i<count; i++) {
        	number3 = number1 + number2;
        	System.out.print(" " + number3);
        	number1 = number2;
        	number2 = number3;
        }
	}

}
