package com.shristi.assignments;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank bankObj = new Bank(1000);
        bankObj.withdraw(100);
        bankObj.deposit(200);
        double availableBalance = bankObj.getBalance();
        System.out.println(availableBalance);
	}

}
