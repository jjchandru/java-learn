package com.company.collection;

import java.util.HashMap;
import java.util.Scanner;

public class CitizenHashMapFinder {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter National ID");
        int nationalId = scanner.nextInt();
        scanner.nextLine();

        HashMap<Integer, Citizen> citizens = CitizenDataManager.getCitizenHashMap();
        Citizen citizen = citizens.get(nationalId);
        if (citizen != null) {
            System.out.println("Citizen FOUND");
            System.out.println(citizen);
        } else {
            System.out.println("Citizen NOT FOUND");
        }
    }
    
}
