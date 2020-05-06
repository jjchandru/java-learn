package com.company.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CitizenDataManager {
	
	public static ArrayList<Citizen> getCitizenArrayList() {
		Citizen citizen1 = new Citizen(123434, "John", "Sam", 'M', LocalDate.of(1984, 7, 21));
		Citizen citizen2 = new Citizen(223463, "Jack", "Potter", 'M', LocalDate.of(1996, 12, 18));
		Citizen citizen3 = new Citizen(878237, "Lily", "Charlie", 'F', LocalDate.of(2001, 4, 7));
		Citizen citizen4 = new Citizen(233467, "Linda", "Johnson", 'F', LocalDate.of(1974, 11, 1));
		Citizen citizen5 = new Citizen(765657, "Jack", "Elliott", 'F', LocalDate.of(1999, 9, 23));
		Citizen citizen6 = new Citizen(987977, "John", "Sam", 'M', LocalDate.of(2000, 10, 17));
		
		//Citizen[] citizen = {citizen1, citizen2, citizen3, citizen4, citizen5, citizen6 };
		ArrayList<Citizen> citizens = new ArrayList<>();
		citizens.add(citizen1);
        citizens.add(citizen2);
        citizens.add(citizen3);
        citizens.add(citizen4);
        citizens.add(citizen5);
        citizens.add(citizen6);
		
		return citizens;
	}

    public static HashSet<Citizen> getCitizenHashSet() {
        Citizen citizen1 = new Citizen(123434, "John", "Sam", 'M', LocalDate.of(1984, 7, 21));
        Citizen citizen2 = new Citizen(223463, "Jack", "Potter", 'M', LocalDate.of(1996, 12, 18));
        Citizen citizen3 = new Citizen(878237, "Lily", "Charlie", 'F', LocalDate.of(2001, 4, 7));
        Citizen citizen4 = new Citizen(233467, "Linda", "Johnson", 'F', LocalDate.of(1974, 11, 1));
        Citizen citizen5 = new Citizen(765657, "Jack", "Elliott", 'F', LocalDate.of(1999, 9, 23));
        Citizen citizen6 = new Citizen(987977, "John", "Sam", 'M', LocalDate.of(2000, 10, 17));
        Citizen citizen7 = new Citizen(987977, "John", "Sam", 'M', LocalDate.of(2000, 10, 17));
        System.out.println("Citizen objects created.");
        
        HashSet<Citizen> citizens = new HashSet<>();
        citizens.add(citizen1);
        System.out.println("After adding citizen1.");
        citizens.add(citizen2);
        citizens.add(citizen3);
        citizens.add(citizen4);
        citizens.add(citizen5);
        citizens.add(citizen6);
        citizens.add(citizen7);
        
        System.out.println("Size of HashSet: " + citizens.size());
        for (Citizen citizen : citizens) {
            citizen.display();
        }
        
        return citizens;
    }

    public static HashMap<Integer, Citizen> getCitizenHashMap() {
        Citizen citizen1 = new Citizen(123434, "John", "Sam", 'M', LocalDate.of(1984, 7, 21));
        Citizen citizen2 = new Citizen(223463, "Jack", "Potter", 'M', LocalDate.of(1996, 12, 18));
        Citizen citizen3 = new Citizen(878237, "Lily", "Charlie", 'F', LocalDate.of(2001, 4, 7));
        Citizen citizen4 = new Citizen(233467, "Linda", "Johnson", 'F', LocalDate.of(1974, 11, 1));
        Citizen citizen5 = new Citizen(765657, "Jack", "Elliott", 'F', LocalDate.of(1999, 9, 23));
        Citizen citizen6 = new Citizen(987977, "John", "Sam", 'M', LocalDate.of(2000, 10, 17));
        //Citizen citizen7 = new Citizen(987977, "John", "Sam", 'M', LocalDate.of(2000, 10, 17));

        HashMap<Integer, Citizen> citizens = new HashMap<>();
        citizens.put(citizen1.getNationalId(), citizen1);
        citizens.put(citizen2.getNationalId(), citizen2);
        citizens.put(citizen3.getNationalId(), citizen3);
        citizens.put(citizen4.getNationalId(), citizen4);
        citizens.put(citizen5.getNationalId(), citizen5);
        citizens.put(citizen6.getNationalId(), citizen6);
        //citizens.add(citizen7);
        
        System.out.println("Size of HashMap: " + citizens.size());
        System.out.println("Citizens: " + citizens);
        return citizens;
    }
}

