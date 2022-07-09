package ca.nscc;

public class Main {

    public static void main(String[] args) {

        //Create my three shape objects, with values
        Circle myCircle = new Circle("red", "Bill", 5);
        Rectangle myRect = new Rectangle("blue", "Steve", 3, 4);
        Triangle myTri = new Triangle("purple", "Prince", 5, 4);

        //For each shape, print a message (from toString()) and then print the
        //results of calling its getArea() method.
        System.out.println(myCircle.toString() + " My area is: " + myCircle.getArea());
        System.out.println("\n" + myRect.toString() + " My area is: " + myRect.getArea());
        System.out.println("\n" + myTri.toString() + " My area is: " + myTri.getArea());
    }
}
