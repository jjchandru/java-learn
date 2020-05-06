package com.xyzbank.model;

import java.util.Scanner;

public class TransactionManager {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount("003", 3000.0);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ATM Cash Withdrawal Amount");
		double withdrawAmount = scanner.nextDouble();
		try {
			account.withdraw(withdrawAmount);
			System.out.println("Balance after Withdrawal is " + account.getBalance());
		} catch (InsufficientBalanceException e) {
			System.out.println("INSUFFICIENT BALANCE");
		}
	}

}
