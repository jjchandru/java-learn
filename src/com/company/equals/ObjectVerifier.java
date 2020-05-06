package com.company.equals;

import java.time.LocalDate;

public class ObjectVerifier {

	public static void main(String args[]) {
		Citizen citizen1 = new Citizen(123434, "John", "Sam", 'M', LocalDate.of(1984, 7, 21));
		Citizen citizen2 = new Citizen(123434, "John", "Sam", 'M', LocalDate.of(1984, 7, 21));
		
		System.out.println(citizen1);
		System.out.println(citizen2);
		String result = (citizen1.equals(citizen2)) ? "EQUAL" : "NOT EQUAL";
		
		System.out.println(result);
	}
}

