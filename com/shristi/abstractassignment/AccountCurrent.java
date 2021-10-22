package com.shristi.abstractassignment;

public class AccountCurrent extends Bank {
	AccountCurrent(double b) {
		super(b);
		// TODO Auto-generated constructor stub
	}
    
	void withdraw(double amount)  {
		balance = balance - amount ;
	}
	
	void deposit(double amount)  {
		balance = balance + amount ;
	}
}
