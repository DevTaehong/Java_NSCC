package ca.nscc;

public class Rectangle extends Shape {

    //Declare rectangle-specific properties
    private int length;
    private int width;

    //Constructor
    public Rectangle(String color, String firstName, int length, int width) {
        super(color, firstName);    //Pass super values to the super's constructor
        this.length = length;       //Set this object's value to it's own properties
        this.width = width;
    }

    //toString method to return a description of the object.
    public String toString() {
        return "I'm a " + super.getColor() + " rectangle named " + super.getFirstName() + ". My length is " + this.length +
                " and my width is " + this.width + ".";
    }

    //Rectangle's implementation of the inherited getArea() method
    @Override
    public double getArea() {
        //Area = length * width
        return this.length * this.width;
    }
}
