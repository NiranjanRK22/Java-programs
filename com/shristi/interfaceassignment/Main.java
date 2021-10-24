package com.shristi.interfaceassignment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BasicCalculator ref = new Basic();
        ref.add(10, 20);
        ref.difference(20,10);
        ref.product(2, 5);
        ref.divide(40, 10);
        
        System.out.println();
        
        ScientificCalculator scientific = new Scientific();
        scientific.square(5);
        scientific.cube(5);
        scientific.add(5, 12);
        scientific.difference(10,5);
        scientific.product(5, 5);
        scientific.divide(10,10);
        
	}

}
