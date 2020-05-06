package com.xyzbank.model;

import java.time.LocalDateTime;

public class CreditCardAccount extends Account {
	
	public CreditCardAccount(String accountNumber, double balance, Transaction[] transactions) {
		super(accountNumber, balance, transactions);
	}

	public void withdraw(double transactionAmount) {
		double tentativeBalance = balance - transactionAmount;
		if (tentativeBalance > 0) {
			balance = tentativeBalance;
			if (transactionAmount >= 5000) {
				balance = balance + 100;
			}
		}
	}
	
	public static void main(String args[]) {
		Transaction[] transactions = {
			new Transaction("01/01/19 07:25", 'W', 2000),
			new Transaction("08/02/19 10:42", 'D', 2000),
			new Transaction("08/02/19 12:03", 'W', 5000)
		};
		CreditCardAccount account = 
				new CreditCardAccount("5544 3322 1100 9988", 
						20000, transactions);
		account.printStatement(LocalDateTime.of(2019, 1, 1, 0, 0), 
				LocalDateTime.of(2019, 2, 31, 0, 0));
	}
}
