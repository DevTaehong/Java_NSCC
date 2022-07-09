package ca.nscc;

public class Shape {

    //Declare properties of ANY shape
    private String color;
    private String firstName;

    //Default constructor (no params)
    public Shape() {};

    //Constructor with params
    public Shape( String color, String firstName) {
        this.color = color;
        this.firstName = firstName;
    }

    //Getter method for color property
    public String getColor() {
        return color;
    }

    //Getter method for firstName property
    public String getFirstName() {
        return firstName;
    }

    //Define a getArea() method, to be inherited by subclasses
    //Note that since a generic shape doesn't have an area, we're just returning zero.
    //Also note, in this solution, I'm overriding the super's getArea() method in each subclass
    public double getArea() {
        return 0.0;
    }
}
