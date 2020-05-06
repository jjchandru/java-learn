package com.company.collection;

import java.util.Comparator;

public class CitizenNameComparator implements Comparator<Citizen> {

    @Override
    public int compare(Citizen citizen1, Citizen citizen2) {
        if (citizen1.getFirstName().equals(citizen2.getFirstName())) {
            return citizen1.getLastName().compareTo(citizen2.getLastName());
        } else {
            return citizen1.getFirstName().compareTo(citizen2.getFirstName());
        }
    }
}
