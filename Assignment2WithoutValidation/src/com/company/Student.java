package com.company;

public class Student {
    // Properties- Member Variables-Attributes
    private String stName;
    private double assignment1Mark;
    private double assignment2Mark;

    // Parametrized Constructor : to create the object using stName property.
    public Student(String name) {
        this.stName=name;
    }

    // Getters : to retrieve data which is stored in the property (attributes)
    public void setAssignment1Mark(double assignment1Mark) {
        this.assignment1Mark = assignment1Mark;
    }

    public void setAssignment2Mark(double assignment2Mark) {
        this.assignment2Mark = assignment2Mark;
    }
    // Setters : to set(store) data in each property (attributes) through the instantiation process
    public double getAssignment1Mark() {
        return this.assignment1Mark;
    }
    public double getAssignment2Mark() {
        return this.assignment2Mark;
    }



    // Public methods for displaying each student's report
    private double totalMarks(double mark1, double mark2){
        return mark1+mark2;
    }
    public String studentReport() {

        return String.format("%s: Assignment1 - %.2f\t\tAssignment2 - %.2f\t\tTotal- %.2f\n",
                this.stName, this.assignment1Mark, this.assignment2Mark,
                this.totalMarks(this.assignment1Mark,this.assignment2Mark)); // you can use
                            // (this.assignment1Mark+this.assignment2Mark)
                            // instead of calling the private method.

    }
}
