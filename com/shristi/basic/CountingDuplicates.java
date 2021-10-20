package com.shristi.basic;

public class CountingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[] = new int [] {1,2,4,5,2,6,4,3,8,8};
        int count = 0;
        for (int i=0; i<array.length; i++) {
        	for (int j=i+1; j<array.length;j++) {
        		if (array[i] == array[j])  {
        			count++;
        			//System.out.println(array[j]);
       
        		}
        	}
        }
        System.out.println(count);
	}

}
