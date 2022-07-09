package ca.nscc.Classes;

import javax.annotation.PostConstruct;
import javax.swing.*;

public class Circle extends Shape {

    //Declare circle-specific properties
    private double radius = 0.0;
    private ImageIcon circlePic;

    //Constructors

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;

        //Set image for this shape
        circlePic = new ImageIcon(this.getClass().getResource("/Images/circle.png"));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public ImageIcon getCirclePic() {
        return circlePic;
    }

    public void setCirclePic(ImageIcon circlePic) {
        this.circlePic = circlePic;
    }

    //toString method to return a description of the object.
    @Override
    public String toString() {
        return "I'm a circle named " + super.getName() + ". My radius is " + this.radius
                + ". " + super.toString()  ;
    }

    //Circle's implementation of the inherited getArea() method
    @Override
    public double getArea() {
        //Area = PI * radius squared
        return Math.PI * (this.radius * this.radius);    //or Math.pow(this.radius, 2)
    }

    @Override
    public String getDimensionsString() {
        return "Radius: " + this.radius;
    }
}
