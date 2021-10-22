package com.shristi.inheritanceassignment;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank obj1 = new AccountSavings(5000); //runtime polymorphism
        obj1.withdraw(1000);
        obj1.deposit(2000);
        double presentBalanceInSavings = obj1.getBalance();
        System.out.println(presentBalanceInSavings);
        
        obj1 = new AccountCurrent(15000);
        obj1.withdraw(2000); //dynamic method dispatch
        obj1.deposit(3000);
        double presentBalanceInCurrent = obj1.getBalance();
        System.out.println(presentBalanceInCurrent);
        
	}

}
