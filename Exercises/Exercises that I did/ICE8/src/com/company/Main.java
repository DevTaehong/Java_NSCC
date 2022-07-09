package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Friend> guests = new ArrayList<Friend>();

        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker.\n\nEnter " +
                "person's name and the type of food they're likely to bring,\nthen indicate whether they are actually invited to the party or not.");

        do {
            String first = JOptionPane.showInputDialog(null, "Enter first name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String last = JOptionPane.showInputDialog(null, "Enter last name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String food = JOptionPane.showInputDialog(null, "Enter the food they usually bring", "Party Picker", JOptionPane.QUESTION_MESSAGE);

            boolean invited = false;
            Object[] choices = {"Invited", "Not Invited"};
            int result = JOptionPane.showOptionDialog(null, "Choose if this guested is Invited or Not Invited", "Party Picker",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);

            if (result == 0) {
                invited = true;
            }
            guests.add(new Friend(first, last, invited, food));
        } while (JOptionPane.showConfirmDialog(null, "Enter another guest?", "Party Picker", JOptionPane.YES_NO_OPTION) == 0);

        String report = "Guests:\n";

        for (Friend currFriend : guests) {
            report += "\n" + currFriend.toString();
        }

        JOptionPane.showMessageDialog(null, "\n" + report);
    }
}
