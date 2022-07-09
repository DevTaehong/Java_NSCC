package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private boolean invited;

    public Person(String firstName, String lastName, boolean invited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.invited = invited;
    }

    public boolean isInvited() {
        return invited;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
