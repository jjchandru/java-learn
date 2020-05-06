package com.company.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TrainingDurationCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter course start date in dd/mm/yy format: ");
		String input = scanner.nextLine();
		
		System.out.println("Enter course duration in weeks:");
		int weeks = scanner.nextInt();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
		LocalDate courseStartDate = LocalDate.parse(input, formatter);
		
		System.out.println(courseStartDate.plusWeeks(weeks).format(formatter));
	}

}
