package com.shristi.abstractassignment;


public class ATMmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSavings obj1 = new AccountSavings(5000); 
        obj1.withdraw(1000);
        obj1.deposit(2000);
        double presentBalanceInSavings = obj1.getBalance();
        System.out.println(presentBalanceInSavings);
        
        AccountCurrent obj2 = new AccountCurrent(15000);
        obj2.withdraw(2000); 
        obj2.deposit(3000);
        double presentBalanceInCurrent = obj2.getBalance();
        System.out.println(presentBalanceInCurrent);
	}

}
