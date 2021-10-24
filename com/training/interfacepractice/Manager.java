package com.training.interfacepractice;

public class Manager extends Employee implements Recreation{

	public Manager(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void musicClub() {
		// TODO Auto-generated method stub
		System.out.println("Music party");
	}

	@Override
	public void theatreClub() {
		// TODO Auto-generated method stub
	    System.out.println("Standup comedy");
	}

}
