package com.training.arrays;

public class OneDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int marks[] = new int[4];
       marks[0] = 10;
       marks[1] = 20;
       marks[2] = 30;
       marks[3] = 40;
       int sum = 0;
       for(int i=0; i<marks.length;i++) {
    	   sum += marks[i];
       }
       System.out.println(sum);
       // for each
       for(int i: marks) {
   		System.out.println(i);
	}
    
	
	}
}
