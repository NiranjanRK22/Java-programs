package com.shristi.inheritanceassignment;

public class AccountCurrent extends Bank{

	AccountCurrent(double b) {
		super(b);
		// TODO Auto-generated constructor stub
	}
    
	void withdraw(double amount)  {
		balance = balance - (amount + amount * 0.5);
	}
	
	void deposit(double amount)  {
		balance = balance - (amount + amount * 0.5);
	}
}
