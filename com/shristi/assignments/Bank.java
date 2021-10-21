package com.shristi.assignments;

public class Bank {
      double balance;
      
      Bank(double b)  {
    	  balance=b;
      }
      
      public void withdraw(int x)  {
    	  balance = balance - x;
      }
      public void deposit(int y)  {
    	  balance = balance + y;
    	  
      }
      public double getBalance()  {
    	  return balance;
      }
}
