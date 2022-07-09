package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Circle myCircle = new Circle("black", "Taehong", 7);
        Rectangle myRect = new Rectangle("white", "Esteban", 5, 2);
        Triangle myTri = new Triangle("orange", "Kissiy", 1, 2);

        System.out.println(myCircle.toString() + " My area is: " + myCircle.getArea());
        System.out.println("\n" + myRect.toString() + " My area is: " + myRect.getArea());
        System.out.println("\n" + myTri.toString() + " My area is: " + myTri.getArea());








    }
}
