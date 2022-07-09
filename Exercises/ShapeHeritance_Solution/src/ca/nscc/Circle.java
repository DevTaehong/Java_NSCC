package ca.nscc;

public class Circle extends Shape {

    //Declare circle-specific properties
    private double radius = 0.0;

    //Constructor
    public Circle(String color, String firstName, double radius) {
        super(color, firstName);    //Pass super values to the super's constructor
        this.radius = radius;       //Set this object's value to it's own properties
    }

    //toString method to return a description of the object.
    public String toString() {
        return "I'm a " + super.getColor() + " circle named " + super.getFirstName() + ". My radius is " + this.radius + ".";
    }

    //Circle's implementation of the inherited getArea() method
    @Override
    public double getArea() {
        //Area = PI * radius squared
        return Math.PI * (this.radius * this.radius);    //or Math.pow(this.radius, 2)
    }
}
