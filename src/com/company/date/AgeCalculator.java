package com.company.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date of Birth in dd/mm/yyyy format");
		String input = scanner.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(input, formatter);
			
		Period period = Period.between(date, LocalDate.now());
		int age = period.getYears();
		System.out.println("Age: " + age);
	}

}
