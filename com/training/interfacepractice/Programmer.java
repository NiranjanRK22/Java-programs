package com.training.interfacepractice;

public class Programmer extends Employee implements Recreation, Gamer {

	public Programmer(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void outdoorGames() {
		// TODO Auto-generated method stub
        System.out.println("Cricket");
	}

	@Override
	public void indoorGames() {
		// TODO Auto-generated method stub
       System.out.println("Carroms and chess");
	}

	@Override
	public void musicClub() {
		// TODO Auto-generated method stub
        System.out.println("Music night");
	}

	@Override
	public void theatreClub() {
		// TODO Auto-generated method stub
		System.out.println("Sunday club");

	}

}
