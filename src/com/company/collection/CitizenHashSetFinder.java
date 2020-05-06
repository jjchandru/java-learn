package com.company.collection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

public class CitizenHashSetFinder {

    private static DateTimeFormatter INPUT_DATE_FORMAT = 
            DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public static void main(String args[]) {
        HashSet<Citizen> citizens = CitizenDataManager.getCitizenHashSet();
        Citizen citizenToFind = getCitizenToFind();
        if (citizens.contains(citizenToFind)) {
            System.out.println("Citizen FOUND");
        } else {
            System.out.println("Citizen NOT FOUND");
        }
    }
    
    public static Citizen getCitizenToFind() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter National ID");
        int nationalId = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter First Name");
        String firstName = scanner.nextLine();
        
        System.out.println("Enter Last Name");
        String lastName = scanner.nextLine();
        
        System.out.println("Enter Date of Birth in dd/mm/yyyy format");
        String dateOfBirthText = scanner.nextLine();
        LocalDate dateOfBirth = 
                LocalDate.parse(dateOfBirthText, INPUT_DATE_FORMAT);
        
        return new Citizen(nationalId, firstName, lastName, dateOfBirth);
    }

}
