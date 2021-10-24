package com.shristi.interfaceassignment;

public class Scientific extends Basic implements ScientificCalculator{

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println("squareResult: " +(x*x));
		
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println("cubeResult: " +(x*x*x));
	}

}
