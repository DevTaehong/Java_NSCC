package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.2);
        Circle c3 = new Circle(4.3,"Blue");


        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1);

        System.out.println(c3.getColour());
        System.out.println(c1.getRadius());
        System.out.println(c1.getColour());
        System.out.println(c2.getArea(2.2));







    }
}
