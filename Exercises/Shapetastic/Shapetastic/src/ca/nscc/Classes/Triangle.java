package ca.nscc.Classes;

import javax.swing.*;

public class Triangle extends Shape {

    //Declare triangle-specific properties
    private int base;
    private int height;
    private ImageIcon trianglePic;

    //Constructor
    public Triangle(String name, int base, int height) {
        super(name);
        this.base = base;
        this.height = height;

        //Set image for this shape
        trianglePic = new ImageIcon(this.getClass().getResource("/Images/triangle.png"));
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ImageIcon getTrianglePic() {
        return trianglePic;
    }

    public void setTrianglePic(ImageIcon trianglePic) {
        this.trianglePic = trianglePic;
    }

    //toString method to return a description of the object.
    public String toString() {
        return "I'm a triangle named " + super.getName() + ". My base is " + this.base +
                " and my height is " + this.height + ". " + super.toString();
    }

    //Triangle's implementation of the inherited getArea() method
    @Override
    public double getArea() {
        //Area = (base * height)/2
        return (this.base * this.height)/2;
    }

    @Override
    public String getDimensionsString() {
        return "Base: " + this.base + ", Height: " + this.height;
    }
}
