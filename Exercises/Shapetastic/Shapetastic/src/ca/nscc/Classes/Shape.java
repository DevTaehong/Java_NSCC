package ca.nscc.Classes;

public abstract class Shape {

    //Declare properties of ANY shape
    private String name;
    private ShapeColor color;

    public Shape(String name) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShapeColor getColor() {
        return color;
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }

    //Define a getArea() method, to be inherited by subclasses
    public abstract double getArea();
    public abstract String getDimensionsString();

    @Override
    public String toString() {
        return  "My area is " + getArea() + ". My color is " + getColor().getColorName() + ".";
    }
}
