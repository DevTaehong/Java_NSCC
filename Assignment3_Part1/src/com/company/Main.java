package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Friend> guests = new ArrayList<Friend>();

        JOptionPane.showMessageDialog(null,"Welcome to the Party Picker.\n\nEnter " +
                "person's name and the type of food they're likely to bring,\nthen indicate whether they are actually invited to the party or not.");

        do {
            String first = JOptionPane.showInputDialog(null, "Enter first name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String last = JOptionPane.showInputDialog(null, "Enter last name", "Party Picker", JOptionPane.QUESTION_MESSAGE);
            String food = JOptionPane.showInputDialog(null, "Enter the food they usually bring", "Party Picker", JOptionPane.QUESTION_MESSAGE);

            boolean invited = false;
            Object[] choices = {"Invited", "Not Invited"};
            int result = JOptionPane.showOptionDialog(null,"Choose if this guested is Invited or Not Invited", "Party Picker",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);

            if (result == 0){
                invited = true;
            }
            guests.add(new Friend(first, last, invited, food));
        } while (JOptionPane.showConfirmDialog(null,"Enter another guest?", "Party Picker",JOptionPane.YES_NO_OPTION)==0);

        String report = "Guest:\n";

        for (Friend currFriend :guests) {
            report += "\n" + currFriend.toString();
        }
        report += "\n\nTotal Guests are: " + guests.size() + ".";
        int number =0;
        for (int i=0; i<guests.size(); ++i){
            if (!guests.get(i).isInvited()){
                number += 1;
            }
        }
        int invitedGuests = guests.size() - number;
        int notInvited = guests.size() - invitedGuests;
        double invitedCost = 99.99;
        double notInvitedCost = 399.99;
        report += "\n-" + invitedGuests + " invited.";
        report += "\n-" + notInvited + " not invited.";
        report += "\n-" + "Total Expenses: $" + invitedGuests *  invitedCost;
        report += "\n-" + "Total Earned: $" + notInvited * notInvitedCost;
        report += "\n-" + "Gross Profit: $" + ((notInvited * notInvitedCost) - (invitedGuests * invitedCost))+"\n-Done By: Taehong Min";


        JOptionPane.showMessageDialog(null,"\n" + report);

    }
}
