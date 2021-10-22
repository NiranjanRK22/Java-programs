package com.shristi.inheritanceassignment;

public class Bank {
      double balance;
      
      Bank(double b) {
    	  balance = b;
      }
      
      void withdraw(double amount)  {
    	  balance = balance - amount;
      }
      
      void deposit(double amount)  {
    	  balance = balance + amount;
      }
      
      double getBalance()  {
    	  return balance;
      }
}
