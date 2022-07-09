package com.company;

public class Shape {

    private String color;
    private String firstName;

    public Shape() {};

    public Shape( String color, String firstName) {
        this.color = color;
        this.firstName = firstName;
    }

    public String getColor() {
        return color;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getArea() {
        return 0.0;
    }
}
