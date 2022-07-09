package com.company;

public class Student {
    // 1. Things each Student has/is :
    // PROPERTIES OR MEMBER VARIABLES
    private String firstName;
    private String latName;
    private String wNumber;
    private int age;
    private boolean isFullTime;

    // 2. Our way of making a Student object CONSTRUCTOR
    // public Student(){} // DEFAULT CONSTRUCTOR
    public Student (String fName, String lName, String id, int age, boolean fullTime) {

        // set all out member variables that were passed in
        this.firstName = fName;
        this.latName = lName;
        this.wNumber = id;
        this.age = age;
        this.isFullTime = fullTime;
    }

    // 3. Things a Student can do
    // MEMBER FUNCTIONS OR METHODS
    public String reportInfo()
    {
        String report = String.format("Name; %s, %s ID: %s Age %d FillTime: %b", this.latName,this.firstName,this.wNumber,
                this.age,this.isFullTime);
        return report;
    }




}
