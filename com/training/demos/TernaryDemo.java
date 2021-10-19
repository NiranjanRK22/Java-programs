package com.training.demos;

public class TernaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 10, y= 20, z=30;
		String res = (x>y && x>z)?"x is greater":(y>z)?"y is greater":"z is gereater";
        System.out.println(res);
	}

}
