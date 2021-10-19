package com.shristi.basic;

public class OddNumbersUpto20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 20;
        for (int num=1; num<=range;num++)  {
        	if (num % 2 != 0)  {
        		System.out.println(num);
        	}
        }
	}

}
