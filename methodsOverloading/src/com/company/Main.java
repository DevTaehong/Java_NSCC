package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Adder myAdder = new Adder();

        System.out.println(myAdder.add(5,7));
        System.out.println(myAdder.add(5,7,6));
        System.out.println(myAdder.add(8,"7"));
        System.out.println(myAdder.add("5",9));
        System.out.println(myAdder.add("5","7"));

        // Overriding
        System.out.println(myAdder.toString());
        System.out.println();
    }
}
