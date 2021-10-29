package com.training.demos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(3);
		values.add(2);
		values.add(2);
		
		Set <Integer> newValues = new TreeSet<Integer>();
		
		for (Integer i: values)  {
			newValues.add(i);
		}
		for (Integer i: newValues)  {
			System.out.println(i);
		}

	}

}
