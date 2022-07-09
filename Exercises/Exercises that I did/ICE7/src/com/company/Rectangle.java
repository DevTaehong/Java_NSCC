package com.company;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(String color, String firstName, int length, int width) {
        super(color, firstName);
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "I'm a " + super.getColor() + " rectangle named " + super.getFirstName() + ". My length is " + this.length +
                " and my width is " + this.width + ".";
    }

    @Override
    public double getArea() {

        return this.length * this.width;
    }
}
