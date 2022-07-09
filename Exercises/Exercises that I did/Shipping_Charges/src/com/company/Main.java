package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to our shop");

        System.out.print("Enter the amount for your total purchase: $");
        Scanner sc1 = new Scanner(System.in);
        int amountOfTotalPurchase = sc1.nextInt();

        double finalTotalUnder50 = amountOfTotalPurchase + 10;




        if (amountOfTotalPurchase > 50)
        {
            System.out.println("Your final total including shipping cost is: $" + finalTotalUnder50);
        }

        else {
            System.out.println("Your final total including shipping cost is: $" + amountOfTotalPurchase);
        }

    }
}
