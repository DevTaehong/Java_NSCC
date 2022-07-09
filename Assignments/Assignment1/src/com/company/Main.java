package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the first Part!"); //Print with line breaker
        System.out.print("Enter the number of asterisks: "); // Print without line breaker
        Scanner sc = new Scanner(System.in); // Making new scanner
        int numberOfAsterisks = sc.nextInt();

        for (int i = numberOfAsterisks; i >= 1; i--) { // Initialize i as a number of asterisks that the user entered. i is decrement
            for (int j = 1; j <= i; j++) { // Initialize j as 1 and increment
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= numberOfAsterisks; i++) { // Initialize i as a number 1 and increment
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

///////////////////////Part2////////////////////////////
        double[] stMarks = new double[10]; // Initialize double array stMarks
        System.out.println("Welcome to the second Part!");
        System.out.println("Enter the Student Marks:");
        Scanner sc2 = new Scanner(System.in); // Making a Scanner

        for (int i = 0; i < 10; i++) { // Initialize i = 0 and increment
            System.out.print("Enter mark # " + (i + 1) + ": "); // 10 times print it to enter marks
            stMarks[i] = sc2.nextDouble(); //Save the marks that the user entered to stMarks
        }

        double min = 100; // Initialize double min = 100
        double max = 0; // Initialize double max = 0
        double sum = 0; // Initialize double sum = 0
        for (int i=0; i<10; i++){
            if (stMarks[i] < min) { //To save min variable
                min = stMarks[i];
            }

            if (stMarks[i] > max) { //To save max variable
                max = stMarks[i];
            }

            sum = sum + stMarks[i]; // Increment sum
        }
        double avg = (sum / 10); // Set variable avg

        Marks marks = new Marks(sum, avg, max, min); // Class Marks and making new variable marks and its parameters sum, avg, max, min
        String output = marks.totalMarks(); //Function totalMarks
        System.out.println();
        System.out.println(output); // print out output variable

        ///////////////////////////Part3////////////////////////////
        System.out.println("\nWelcome to the Third Part!");
        System.out.println("The Array Elements are:\n");
        int[][] myArray = {{10, 20, 30, 40}, {12, 15, 18, 19}, {10, 10, 10, 10}}; //Declare 2D array which is myArray

        for (int row=0; row<3; row++) { // Initialize row and increment
            for (int col=0; col<4; col++){ // Initialize col and increment
                System.out.print(myArray[row][col] + " " + " ");
            }
            System.out.println();
        }

        int sum1 = 0; // Initialize sum1
        int sum2 = 0; // Initialize sum2
        int sum3 = 0; // Initialize sum3
        for (int row=0; row<3; row++) {
            for (int col=0; col<4; col++) {
                if (row==0) sum1 = sum1 + myArray[row][col]; //if row is 0, sum1 = sum1 + myArray[row][col] execute
                else if (row==1) sum2 = sum2 + myArray[row][col]; //if row is 1, sum2 = sum2 + myArray[row][col]
                else sum3 = sum3 + myArray[row][col]; // if row is 2 sum3 = sum3 + myArray[row][col]
                }
            }

        Summation sumOfEachRow = new Summation(sum1,sum2,sum3); // Class Summation and declare sumOfEachRow
        String output2 = sumOfEachRow.rowOfSum();
        System.out.println(output2);

        int average = (sum1 + sum2 + sum3) / 12; // Declare variable average
        System.out.println("\nThe Average is : " + average);
        System.out.println("\nThe Converted Array Elements are:");

        int col = myArray.length; // Initialize col to make from 2D array to 1D array
        int row = myArray[0].length; // Initialize row to make from 2D array to 1D array

        int[] oneArray = new int[col * row]; // Declare oneArray

        for(int i=0; i<myArray.length; i++) {	//0 1 2
            for(int j=0; j<myArray[0].length; j++) { // 0 1 2 3
                oneArray[i * myArray[0].length + j] = myArray[i][j];
            }
        }
        for (int i: oneArray) { //foreach
            System.out.print(i + " \n");
        }









    }
}
