package com.training.interfacepractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee mgr = new Manager("Ram", 9000);
        mgr.getDetails();
        
        Recreation rec = (Recreation)mgr;
        rec.musicClub();
        rec.theatreClub();
        System.out.println(Recreation.PROVIDER);
	}

}
