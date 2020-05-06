package com.xyzbank.model;

import static com.xyzbank.model.DateConstants.INPUT_DATE_FORMAT;
import static com.xyzbank.model.DateConstants.STATEMENT_DATE_FORMAT;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class Transaction {

	private LocalDateTime date;
	private char type;
	private double amount;
	
	public Transaction(String date, char type, double amount) {
		LocalDateTime localDateTime = null;
		try {
			localDateTime = LocalDateTime.parse(date, INPUT_DATE_FORMAT);
		} catch (DateTimeParseException e) {
		}
		this.date = localDateTime;
		this.type = type;
		this.amount = amount;
	}

	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}
	
	public LocalDateTime getDate() {
		return date;
	}

	public void displayTransaction(double balance) {
		String formattedDate = date.format(STATEMENT_DATE_FORMAT);
		System.out.printf("%15s %5c %12.2f %8.2f\n", formattedDate, type, amount, balance);
	}
	
	public static void main(String[] args) {
		Transaction transaction = new Transaction("01/01/19 15:43", 'W', 2000);
		transaction.displayTransaction(5000);
	}

}
