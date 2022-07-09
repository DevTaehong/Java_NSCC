package com.company;

public class Circle extends Shape{

    private double radius = 0.0;


    public Circle(String color, String firstName, double radius) {
        super(color, firstName);
        this.radius = radius;
    }

    public String toString() {
        return "I'm a " + super.getColor() + " circle named " + super.getFirstName() + ". My radius is " + this.radius + ".";
    }

    @Override
    public double getArea() {

        return Math.PI * (this.radius * this.radius);
    }
}
