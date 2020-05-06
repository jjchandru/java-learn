package com.xyzbank.model;

import java.time.LocalDateTime;

public class SavingsAccount extends Account {

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}
	
	public SavingsAccount(String accountNumber, double balance, 
			Transaction[] transactions) {
		super(accountNumber, balance, transactions);
	}
	
	public void deposit(double transactionAmount) {
		super.deposit(transactionAmount);
		if (transactionAmount == 10000) {
			balance += 150;
		}
	}
	
	public static void main(String args[]) {
		Transaction[] transactions = {
			new Transaction("01/01/19 07:25", 'W', 2000),
			new Transaction("08/02/19 10:42", 'D', 20000), 
			new Transaction("08/02/19 12:03", 'D', 500),
			new Transaction("19/03/19 15:48", 'W', 15000), 
			new Transaction("15/04/19 23:25", 'D', 10000)
		};
		SavingsAccount account = new SavingsAccount("01302343794", 
				5000, transactions);
		account.printStatement(LocalDateTime.of(2019, 1, 1, 0, 0), 
				LocalDateTime.of(2019, 2, 31, 0, 0));
	}
}
