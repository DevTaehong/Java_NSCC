package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        JOptionPane.showMessageDialog(null,
//                "This is my first Message",
//                "Welcome",
//                JOptionPane.INFORMATION_MESSAGE);
//
//        JOptionPane.showMessageDialog(null,
//                "Invalid input",
//                "Error Message",
//                JOptionPane.ERROR_MESSAGE);
//
//        JOptionPane.showMessageDialog(null,
//                "Invalid input",
//                "Error Message",
//                JOptionPane.WARNING_MESSAGE);
        // Confirmation Dialog
        int myChoice = JOptionPane.showConfirmDialog(null,"DO you like your car?",
                "Car's Impression",JOptionPane.YES_NO_OPTION);

        System.out.println("Your choice is :"+myChoice);
        if (myChoice==0){
            System.out.println("You like your car!");
        }
        else {
            System.out.println("Change your car");
        }

        // Show Input Dialog

        String inputString = JOptionPane.showInputDialog("Enter your favorite car :");
        System.out.println("Your favorite car is: "+inputString);

        // Option Dialog

        Object[] customButtons = {"Honda","Toyota","Pontiac","Ferrari"};
        int myCarChoice = JOptionPane.showOptionDialog(null,"Choose your favourite Car: ",
        "Car Choice",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,customButtons,
        customButtons[3]);

        System.out.println(String.format("The %s is your fav. car", customButtons[myCarChoice]));

        System.out.println("This is my First GUI Application.");
















    }
}
