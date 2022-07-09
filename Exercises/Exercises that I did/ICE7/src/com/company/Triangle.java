package com.company;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(String color, String firstName, int base, int height) {
        super(color, firstName);
        this.base = base;
        this.height = height;
    }
    public String toString() {
        return "I'm a " + super.getColor() + " triangle named " + super.getFirstName() + ". My base is " + this.base +
                " and my height is " + this.height + ".";
    }

    @Override
    public double getArea() {

        return (this.base * this.height)/2;
    }
}
