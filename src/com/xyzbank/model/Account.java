package com.xyzbank.model;

import static com.xyzbank.model.DateConstants.STATEMENT_DATE_FORMAT;

import java.time.LocalDateTime;

public abstract class Account {
	private static String bankName = "XYZ Bank"; 
	protected String accountNumber;
	protected double balance;
	//private char type;
	protected Transaction[] transactions;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public Account(String accountNumber, double balance, /*char type,*/ Transaction[] transactions) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		//this.type = type;
		this.transactions = transactions;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double transactionAmount) throws InsufficientBalanceException {
		double tentativeBalance = balance - transactionAmount;
		if (tentativeBalance < 0) {
			throw new InsufficientBalanceException();
		}
		balance = tentativeBalance;
	}
	
	public void deposit(double transactionAmount) {
		balance += transactionAmount;
	}
	
	public void displayBalance() {
		System.out.println(balance);
	}
	
	public void printStatement(LocalDateTime startDate, LocalDateTime endDate) {
		System.out.println(bankName);
		System.out.println("Account Statement of " + accountNumber);
		System.out.println("Initial Balance: " + balance);
		System.out.println("From: " + startDate.format(STATEMENT_DATE_FORMAT));
		System.out.println("To: " + endDate.format(STATEMENT_DATE_FORMAT));
		System.out.println("-------------------------------------------");
		System.out.println("Date             Type  Transaction  Balance");
		System.out.println("-------------------------------------------");
		
		for (Transaction transaction : transactions) {
			char type = transaction.getType();
			double amount = transaction.getAmount();
			LocalDateTime date = transaction.getDate();

			if (date != null && date.isAfter(startDate) && date.isBefore(endDate)) {
				transaction.displayTransaction(this.balance);
			}
			
			if (type == 'W') {
				try {
					this.withdraw(amount);
				} catch (InsufficientBalanceException e) {
				}
			} else if (type == 'D') {
				this.deposit(amount);
			}
		}
		System.out.println("-------------------------------------------");
	}

	public static void main(String[] args) throws InsufficientBalanceException {
		Transaction[] savingsTransactions = {
			new Transaction("01/01/19 07:25", 'W', 2000),
			new Transaction("08/02/19 10:42", 'D', 20000), 
			new Transaction("08/02/19 12:03", 'D', 500),
			new Transaction("19/03/19 15:48", 'W', 50000), 
			new Transaction("15/04/19 23:25", 'D', 10000)
		};
		Transaction[] cardTransactions = {
			new Transaction("01/01/19 07:25", 'W', 2000),
			new Transaction("08/02/19 10:42", 'D', 2000),
			new Transaction("08/02/19 12:03", 'W', 5000)
		};
		Account savingsAccount = new SavingsAccount("01302343794", 5000, savingsTransactions);
		Account cardAccount = new CreditCardAccount("5544 3322 1100 9988", 
				20000, cardTransactions);
		Account[] accounts = { savingsAccount, cardAccount };
		for (Account account : accounts) {
			account.printStatement(LocalDateTime.of(2019, 1, 1, 0, 0), 
					LocalDateTime.of(2019, 4, 28, 23, 59));
			System.out.println();
		}
	}

}
