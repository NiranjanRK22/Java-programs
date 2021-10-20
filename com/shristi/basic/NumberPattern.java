package com.shristi.basic;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int range = 4, number=1;
       
        for (int i=1; i<=range; i++)  {
        	 String number_value = String.valueOf(number);
        	 number++;
        	 System.out.println(number_value.repeat(i));
        	
        }
	}

}
