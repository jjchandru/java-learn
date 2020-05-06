package com.company.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NewsDateFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date in dd/mm/yy hh:mm format: ");
		String input = scanner.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
		LocalDateTime articleDateTime = LocalDateTime.parse(input, formatter);
		
		DateTimeFormatter articleDateFormat = DateTimeFormatter.ofPattern("MMM dd, yyyy, k.mm a");
		System.out.println(articleDateTime.format(articleDateFormat));
	}

}
