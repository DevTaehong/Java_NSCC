package com.company;

public class Student {
    private String name;
    private double marks1;
    private double marks2;


    public Student(String name, double marks1, double marks2){ // Constructor
        this.name=name;
        this.marks1=marks1;
        this.marks2=marks2;
    }

    public String getName() { // Getter method for course name
        return name;
    }

    public void setName(String name) { // Setter method for course name
        this.name = name;
    }

    public double getMarks1() { // Getter method for mark 1
        return marks1;
    }

    public void setMarks1(double marks1) { // Setter method for mark1
        this.marks1 = marks1;
    }

    public double getMarks2() { // Getter method for mark 2
        return marks2;
    }

    public void setMarks2(double marks2) { // Setter method for mark2
        this.marks2 = marks2;
    }
    public double total(){
        double sum = this.marks1 + this.marks2;
        return sum;
    }


    String reportInfo()
    {
        String report=String.format(this.name + ":" + "Assignment1 - " + this.marks1 + "      Assignment2 - " + this.marks2 + " Total - " + total());
        return report; // Print a report for stats per student
    }


}
