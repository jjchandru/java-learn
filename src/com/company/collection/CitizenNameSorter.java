package com.company.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CitizenNameSorter {
    public static void main(String args[]) {
        ArrayList<Citizen> citizens = CitizenDataManager.getCitizenArrayList();
        Collections.sort(citizens, new CitizenNameComparator());
        
        for (Citizen citizen : citizens) {
            citizen.display();
        }
    }
}
