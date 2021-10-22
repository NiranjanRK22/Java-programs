package com.shristi.abstractassignment;

public abstract class Bank {
	double balance;
    
    Bank(double b) {
  	  balance = b;
    }
    
    abstract void withdraw(double amount);
    abstract void deposit(double amount); 
    
    double getBalance()  {
  	  return balance;
    }
}
