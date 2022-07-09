package ca.nscc;

public class Triangle extends Shape {

    //Declare triangle-specific properties
    private int base;
    private int height;

    //Constructor
    public Triangle(String color, String firstName, int base, int height) {
        super(color, firstName);    //Pass super values to the super's constructor
        this.base = base;           //Set this object's value to it's own properties
        this.height = height;
    }

    //toString method to return a description of the object.
    public String toString() {
        return "I'm a " + super.getColor() + " triangle named " + super.getFirstName() + ". My base is " + this.base +
                " and my height is " + this.height + ".";
    }

    //Triangle's implementation of the inherited getArea() method
    @Override
    public double getArea() {
        //Area = (base * height)/2
        return (this.base * this.height)/2;
    }
}
