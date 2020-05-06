package com.company.collection;

import java.time.LocalDate;

public class Citizen implements Comparable<Citizen> {

    private int nationalId;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dateOfBirth;

    public Citizen(int nationalId, String firstName, String lastName,
            LocalDate dateOfBirth) {
        super();
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Citizen(int nationalId, String firstName, String lastName,
            char gender, LocalDate dateOfBirth) {
        super();
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
        result = prime * result
                + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result
                + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + nationalId;
        System.out.println("Hashcode for '" + nationalId + "' is " + result);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Inside Equals.");
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Citizen other = (Citizen) obj;
        if (dateOfBirth == null) {
            if (other.dateOfBirth != null) {
                return false;
            }
        } else if (!dateOfBirth.equals(other.dateOfBirth)) {
            return false;
        }
        if (firstName == null) {
            if (other.firstName != null) {
                return false;
            }
        } else if (!firstName.equals(other.firstName)) {
            return false;
        }
        if (lastName == null) {
            if (other.lastName != null) {
                return false;
            }
        } else if (!lastName.equals(other.lastName)) {
            return false;
        }
        if (nationalId != other.nationalId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "Citizen [nationalId=%s, firstName=%s, lastName=%s, gender=%s, dateOfBirth=%s]",
                nationalId, firstName, lastName, gender, dateOfBirth);
    }

    public void display() {
        System.out.printf("%6d %-8s %-8s %c %s\n", nationalId, firstName,
                lastName, gender, dateOfBirth);
    }

    public int compareTo(Citizen citizen) {
        int result = firstName.compareTo(citizen.firstName);
        System.out.println(this.nationalId + " - " + this.firstName + " "
                + citizen.getNationalId() + " - " + citizen.getFirstName()
                + " (" + result + ")");
        return result;
    }

}
