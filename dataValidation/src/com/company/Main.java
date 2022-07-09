package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // First Validation Example
        Scanner sc = new Scanner(System.in);
        int theNum = 0;
        System.out.println("Enter an integer value :");
        if (sc.hasNextInt()) {    //Check if the value is an integer or not
            //If yes, run the code in this IF to get the value from scanner.
            int myNum = sc.nextInt();
            System.out.println("This is an integer  input");
            theNum = myNum;
        }
        System.out.println("The value is : " + theNum);
        // Second Validation
        // Try Catches method
        System.out.println("Try Catch Method");
        System.out.println("=======================");
        String myInput = "123";
        try {
            int myInt = Integer.parseInt(myInput);    //If the value is an integer,
            // it will be assigned to the integer variable.
            //If not, it will throw an exception, which will be caught by the catch block
            // below
            System.out.println("This is correct integer input for " + myInt);
        }
        catch (NumberFormatException ex) {
            //Code to run if the incoming value was not an integer
            System.out.println("Try again; type mismatch");
        }
        //
        System.out.println("Another Try Catch Method");
        System.out.println("=======================");
        try {
            System.out.println("Enter an integer value: ");
            int intValue = sc.nextInt();
            System.out.println("your integer data is : " + intValue);
        }
        catch (Exception ex) {
            System.out.println("Try again; integer type mismatch");

        }
        System.out.println("Input Validation for positive integer Using Do-While Loop");
        System.out.println("========================================================");
        //Repeat validation until user enters a valid POSITIVE number
        int number;
        do {
            System.out.println("Enter a positive number");
            while (!sc.hasNextInt()) {  //Check that the value if it is an integer
                System.out.println("Enter a positive integer number.");
                sc.next(); // to handle the newline character
            }
            number = sc.nextInt();
        } while (number < 0);    //Checks that the value is zero or higher.
        System.out.println("Input Validation for String Input Using Do-While");
        System.out.println("================================================");
        String input = null;
        do {
            System.out.println("Enter a sentence ");
            while (!sc.hasNextLine()) { //While the scanner has no next line
                System.out.println("Please enter a valid word!");
                sc.next(); // to handle the newline character
            }
            input = sc.nextLine();
        } while ((input == null) || input.equals("")); //While the input value is not a null value
                                                        // or empty String
        System.out.println("Input Validation for numbers satisfying condition");
        System.out.println("================================================");
        System.out.println("Enter a valid Student mark between 0 and 100");
        // The Following Validation is not working properly
        // Please fix it .............................
        System.out.println(" Please Fix this Part as it is not working ");
        //sc.next();
        double newInput;
        newInput = sc.nextDouble();
        while (newInput<0.0 || newInput>100.0){
            System.out.println("Enter a valid Mark");
            newInput = sc.nextDouble();
        }
    }
}
