package ca.nscc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PageOnePanel extends JPanel {

    public PageOnePanel() {

        ProgramWindowFrame.setCurrentPage(1);   //

        JLabel welcomeLabel = new JLabel("Welcome to Page One!");
        add(welcomeLabel);

        JButton gotoPageTwoButton = new JButton("Go to Page 2");
        gotoPageTwoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                welcomeLabel.setText("I GOT CHANGED, MAGICALLY");

                setVisible(false);
                //panelTwo.setVisible(true);
            } });

        add(gotoPageTwoButton);

        setVisible(true);
    }
}
