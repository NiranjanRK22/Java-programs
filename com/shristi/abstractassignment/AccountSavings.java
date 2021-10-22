package com.shristi.abstractassignment;

public class AccountSavings extends Bank {
	AccountSavings(double b) {
		super(b);
		// TODO Auto-generated constructor stub
	}
	
	void withdraw(double amount) {
		balance = balance - (amount + amount * 0.1);
	}
	
	void deposit(double amount)  {
		balance = balance + (amount + amount * 0.1);
	} 
}
