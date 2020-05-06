package com.company.equals;

import java.time.LocalDate;

public class CitizenDataManager {
	
	public static Citizen[] getCitizenData() {
		Citizen citizen1 = new Citizen(123434, "John", "Sam", 'M', LocalDate.of(1984, 7, 21));
		Citizen citizen2 = new Citizen(223463, "Jack", "Potter", 'M', LocalDate.of(1996, 12, 18));
		Citizen citizen3 = new Citizen(878237, "Lily", "Charlie", 'F', LocalDate.of(2001, 4, 7));
		Citizen citizen4 = new Citizen(233467, "Linda", "Johnson", 'F', LocalDate.of(1974, 11, 1));
		Citizen citizen5 = new Citizen(765657, "Jack", "Elliott", 'F', LocalDate.of(1999, 9, 23));
		Citizen citizen6 = new Citizen(987977, "John", "Sam", 'M', LocalDate.of(2000, 10, 17));
		
		Citizen[] citizen = {citizen1, citizen2, citizen3, citizen4, citizen5, citizen6 };
		
		return citizen;
	}

}

