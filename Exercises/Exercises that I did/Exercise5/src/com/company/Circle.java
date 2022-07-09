package com.company;

public class Circle {
    private double radius;
    private String colour;

    public Circle(){
        this.radius = 2;
        this.colour = "Green";
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String colour){
        this.radius=radius;
        this.colour=colour;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public double getArea(double radius){
        double totalArea =  Math.PI * radius * radius;
        return totalArea;
    }

    public String toString(){
        return "Radius = "+ this.radius + ", " + "Colour = " + this.colour;
    }


}
