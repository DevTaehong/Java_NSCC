package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] letterGrade = new char[]{'A', 'B', 'C', 'D', 'F'};
        int[] numericGrade = {4, 3, 2, 1, 0};

        System.out.println("It's our fantastic grade calculator!");

        System.out.print("Enter a letter grade: ");
        Scanner sc = new Scanner(System.in);
        char userValue = sc.next().charAt(0);

        for(int i=0; i < letterGrade.length; i++) {
            if (userValue == letterGrade[i])
                System.out.println("Your numeric grade is: " + numericGrade[i]);
        }





    }
}
